package com.example.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {

	@NotBlank(message = "first name cannot be blank")
	@Size(min = 2)
	private String firstName;
	@NotBlank(message = "last name cannot be blank")
	@Size(min = 2)
	private String lastName;
	@NotBlank(message = "email cannot be blank")
	@Email
	private String email;
	@NotBlank(message = "password cannot be blank")
	@Size(min = 8, max = 16, message = "password must be equal or grater than 8 characters and less than 16 characters")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
