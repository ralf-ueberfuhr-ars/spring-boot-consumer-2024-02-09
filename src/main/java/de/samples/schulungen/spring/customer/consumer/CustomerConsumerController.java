package de.samples.schulungen.spring.customer.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;
import java.util.stream.Collectors;

// kein REST Controller
@Controller
@RequiredArgsConstructor
public class CustomerConsumerController {

    private final CustomersApiClient client;

    @GetMapping(
            value = "/index.html",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    String printCustomers() {
        return client
                .readAll()
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));
    }

    @GetMapping(
            value = "/customer",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    String printCustomerById(@RequestParam UUID uuid) {
        return String.valueOf(
                client
                        .findById(uuid)
        );
    }


}
