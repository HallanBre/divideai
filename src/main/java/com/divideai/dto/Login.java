package com.divideai.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Login {
	
	@NotBlank(message = "The email is required.")
	@Email(message = "The email is not valid. ")
    private String email;
    
	@NotBlank(message = "The email is required.")
    private String password;

}
