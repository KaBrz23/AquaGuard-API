package com.globalsolutions.aquaguard.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Tilapia {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_tilapia;

    @NotBlank(message = "{tilapia.isdoente.notblank}")
    private boolean isDoente;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
}
