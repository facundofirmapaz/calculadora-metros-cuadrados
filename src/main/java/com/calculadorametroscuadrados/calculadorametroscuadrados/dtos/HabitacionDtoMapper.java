package com.calculadorametroscuadrados.calculadorametroscuadrados.dtos;

import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.Habitacion;

public class HabitacionDtoMapper
{
    public static Habitacion mapToHabitacion(HabitacionDto habitacion)
    {
        return new Habitacion(habitacion.getNombre(), habitacion.getAncho(), habitacion.getLargo());
    }

    public static HabitacionDto mapToDto(Habitacion h)
    {
        return new HabitacionDto(h.getNombre(), h.getAncho(), h.getLargo());
    }
}
