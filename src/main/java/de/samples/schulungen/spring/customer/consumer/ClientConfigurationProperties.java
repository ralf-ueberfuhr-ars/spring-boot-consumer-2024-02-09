package de.samples.schulungen.spring.customer.consumer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("client")
public class ClientConfigurationProperties {

    private String baseUrl = "http://localhost:8080";

}
