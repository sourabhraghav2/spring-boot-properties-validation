package com.example.mocker.properties.endpoint;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Getter
@Setter
@Validated
public class SomeEndpoint {
    @NotNull
    private Integer minAge;
    @NotNull
    private Integer maxAge;
}
