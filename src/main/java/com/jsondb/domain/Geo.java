package com.jsondb.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Geo {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double lat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double lng;
}
