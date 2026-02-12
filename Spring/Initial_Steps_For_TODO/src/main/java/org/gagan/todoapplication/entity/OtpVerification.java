package org.gagan.todoapplication.entity;

import java.time.LocalDateTime;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import lombok.Getter;
import lombok.Setter;

@Node("OtpVerification")
@Getter
@Setter
public class OtpVerification {

	@Id
	@GeneratedValue
	private Long id;

	@Property("email")
	private String email;

	@Property("otp")
	private String otp;

	@Property("purpose")
	private String purpose;

	@Property("expiresAt")
	private LocalDateTime expiresAt;

	@Property("verified")
	private boolean verified = false;

	@Property("createdAt")
	private LocalDateTime createdAt = LocalDateTime.now();
}