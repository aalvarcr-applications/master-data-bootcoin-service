package com.nttdata.bootcamp.masterdatabootcoinservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 *
 * @since 2022
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MethodPayment {
    @Id
    private String id;
    private String value;
}
