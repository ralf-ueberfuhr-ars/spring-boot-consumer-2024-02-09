package de.samples.schulungen.spring.customer.consumer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
public class CustomerDto {

    private UUID uuid;
    private String name;
    private LocalDate birthdate;
    private String state;

}
