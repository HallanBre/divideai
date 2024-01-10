package com.divideai.services;


import com.divideai.Entities.Property;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public interface PropertyService {

    public Property save (
            @NotNull(message = "The Property is required. ")
            Property property);

    public Property deleteBy(
            @NotNull(message = "The id is required. ")
            Integer id);

    public Property findBy(
            @NotNull(message = "the id is required. ")
            Integer id);
}
