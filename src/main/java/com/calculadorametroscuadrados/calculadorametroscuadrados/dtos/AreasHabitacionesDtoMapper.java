package com.calculadorametroscuadrados.calculadorametroscuadrados.dtos;

import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.AreasHabitaciones;
import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.HabitacionArea;

import java.util.ArrayList;

public class AreasHabitacionesDtoMapper
{
    public static AreasHabitacionesDto mapToDto(AreasHabitaciones ah)
    {
        ArrayList<HabitacionAreaDto> areas = new ArrayList<>();

        for (HabitacionArea h: ah.getAreasHabitaciones())
        {
            areas.add(HabitacionAreaDtoMapper.mapToDto(h));
        }

        return new AreasHabitacionesDto(areas);
    }
}
