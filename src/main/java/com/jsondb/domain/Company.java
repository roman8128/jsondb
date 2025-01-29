package com.jsondb.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    @Column(name = "company_name")
    private String name;
    private String catchPhrase;
    private String business;
}
