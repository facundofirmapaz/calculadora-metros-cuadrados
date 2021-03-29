package com.calculadorametroscuadrados.calculadorametroscuadrados.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HabitacionDto
{
    private String nombre;
    private double ancho;
    private double largo;
}
