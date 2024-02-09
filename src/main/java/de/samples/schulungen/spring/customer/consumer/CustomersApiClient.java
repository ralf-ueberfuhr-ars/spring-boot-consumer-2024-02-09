package de.samples.schulungen.spring.customer.consumer;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.Collection;
import java.util.UUID;

@HttpExchange("/customers")
public interface CustomersApiClient {

    @GetExchange
    Collection<CustomerDto> readAll();

    @GetExchange("/{uuid}")
    CustomerDto findById(@PathVariable UUID uuid);

}
