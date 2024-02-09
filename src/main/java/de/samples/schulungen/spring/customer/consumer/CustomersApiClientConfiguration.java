package de.samples.schulungen.spring.customer.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class CustomersApiClientConfiguration {

    @Bean
    CustomersApiClient customersApiClient(ClientConfigurationProperties props) {
        var restClient = RestClient
                .builder()
                .baseUrl(props.getBaseUrl())
                .build();
        var adapter = RestClientAdapter
                .create(restClient);
        var factory = HttpServiceProxyFactory
                .builderFor(adapter)
                .build();
        return factory
                .createClient(CustomersApiClient.class);
    }

}
