package org.gagan.jdbc_practice.PracticeDatabaseQueryUsingH2SpringBoot.Repository;

import org.gagan.jdbc_practice.PracticeDatabaseQueryUsingH2SpringBoot.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {
}
