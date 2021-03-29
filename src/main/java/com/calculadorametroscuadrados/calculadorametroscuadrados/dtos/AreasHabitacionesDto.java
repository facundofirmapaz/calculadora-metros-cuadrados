package com.calculadorametroscuadrados.calculadorametroscuadrados.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class AreasHabitacionesDto
{
    private ArrayList<HabitacionAreaDto> areasHabitaciones;
}
