package com.example.mocker.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "box")
@Validated
public class GeneralProperties {
    @NotEmpty
    private String something;
}
