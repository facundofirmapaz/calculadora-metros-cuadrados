package com.calculadorametroscuadrados.calculadorametroscuadrados.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class CasaDto
{
    private String nombre;
    private String direccion;
    private ArrayList<HabitacionDto> habitaciones;
}
