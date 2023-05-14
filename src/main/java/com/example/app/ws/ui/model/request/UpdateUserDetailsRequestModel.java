package com.example.app.ws.ui.model.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {
	@NotBlank(message = "first name cannot be blank")
	@Size(min = 2)
	private String firstName;
	@NotBlank(message = "last name cannot be blank")
	@Size(min = 2)
	private String lastName;

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
}
