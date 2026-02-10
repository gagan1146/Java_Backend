package org.gagan.todoapplication.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Node("User")   // Neo4j node label
public class User extends BaseEntity {

	@Id
	@GeneratedValue
	private Long id;   // Neo4j internal id

	@Property("username")
	@NotBlank(message="username should not be blank")
	private String username;

	@Property("firstName")
	@NotBlank(message="First name should not be blank")
	@Size(max=25, message="First Name length less than 25 characters")
	private String firstName;

	@Property("lastName")
	@NotBlank(message="Last name should not be blank")
	@Size(max=25, message="Last Name length less than 25 characters")
	private String lastName;

	@Property("email")
	@NotBlank(message="Email should not be blank")
	@Email(message="Invalid Email format")
	private String email;

	@Property("mobileNumber")
	@NotNull(message="Mobile number should not be empty")
	private String mobileNumber;

	@Property("dateOfBirth")
	@NotNull(message="Date Of Birth should not be blank")
	@Past(message="Date Of Birth must be in the past")
	private LocalDate dateOfBirth;

	@Property("gender")
	@NotBlank(message="gender should not be blank")
	private String gender;

	@Property("password")
	@NotBlank(message="Password should not be blank")
	private String password;

	@Property("enabled")
	private boolean enabled = false;

	// Many-to-Many relationship with Role
	@Relationship(type = "HAS_ROLE", direction = Relationship.Direction.OUTGOING)
	private Set<Role> roles = new HashSet<>();
}