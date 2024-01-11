package com.divideai.services;

import com.divideai.Entities.RealState;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;


@Validated
public interface RealStateService {

    public RealState save(
            @NotNull(message = "The RealState is required. ")
            RealState realState);

    public RealState deleteBy(
            @NotNull(message = "The id is required. ")
            Integer id);

    public RealState findBy(
            @NotNull(message = "The id is required. ")
            Integer id);
}
