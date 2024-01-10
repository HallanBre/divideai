package com.divideai.Entities;


import java.util.Date;

import com.divideai.Entities.enums.MaritalStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "User")
@Table(name = "users")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
    private Integer id;

	@Column(name = "name")
    @Size(max = 150, min = 3, message = "The name must contain between 3 and 150 characters. ")
    @NotBlank(message = "The name is required. ")
    private String name;

    @Column(name = "email")
    @Size(max = 250, min = 3, message = "The email must contain between 3 and 150 characters. ")
    @Email(message = "The e-mail must follow this format: example@email.com")
    @NotBlank(message = "The email is required. ")
    private String email;
    
    @Column(name = "password")
    @Size(max = 250, min = 3, message = "The passwordmust contain between 3 and 150 characters. ")
    @NotBlank(message = "The password is required. ")
    private String password;

    @Column(name = "birth")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
    @NotNull(message = "The birth is required. ")
    private Date birth;

    @Column(name = "maritalStatus")
    @NotNull(message = "The marital status is required. ")
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;

}
