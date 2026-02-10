package org.gagan.todoapplication.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.gagan.todoapplication.entity.OtpVerification;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OtpVerificationRepository extends Neo4jRepository<OtpVerification, Long> {

    @Query("""
        MATCH (o:OtpVerification)
        WHERE o.email = $email AND o.purpose = $purpose AND o.verified = false
        RETURN o
        ORDER BY o.createdAt DESC
        LIMIT 1
    """)
    Optional<OtpVerification> findTopByEmailAndPurposeAndVerifiedFalseOrderByCreatedAtDesc(String email, String purpose);

    @Query("""
        MATCH (o:OtpVerification)
        WHERE o.email = $email AND o.purpose = $purpose AND o.verified = false
        SET o.verified = true
    """)
    void invalidatePreviousOtps(String email, String purpose);

    @Query("""
        MATCH (o:OtpVerification)
        WHERE o.expiresAt < $time
        DETACH DELETE o
    """)
    void deleteByExpiresAtBefore(LocalDateTime time);
}