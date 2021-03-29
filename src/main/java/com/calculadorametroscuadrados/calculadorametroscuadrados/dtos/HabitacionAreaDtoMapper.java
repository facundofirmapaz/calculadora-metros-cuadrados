package com.calculadorametroscuadrados.calculadorametroscuadrados.dtos;

import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.HabitacionArea;

public class HabitacionAreaDtoMapper
{
    public static HabitacionAreaDto mapToDto(HabitacionArea h)
    {
        return new HabitacionAreaDto(h.getNombreHabitacion(), h.getArea());
    }
}
