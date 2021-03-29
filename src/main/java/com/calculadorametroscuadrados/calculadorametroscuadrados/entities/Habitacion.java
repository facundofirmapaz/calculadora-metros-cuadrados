package com.calculadorametroscuadrados.calculadorametroscuadrados.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Habitacion
{
    private String nombre;
    private double ancho;
    private double largo;

    public double metrosCuadrados() { return ancho * largo; }
}

