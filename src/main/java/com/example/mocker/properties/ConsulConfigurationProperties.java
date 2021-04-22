package com.example.mocker.properties;

import com.example.mocker.properties.endpoint.SomeEndpoint;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "some.container")
@Validated
public class ConsulConfigurationProperties {
    @NotNull
    private SomeEndpoint age;
}
