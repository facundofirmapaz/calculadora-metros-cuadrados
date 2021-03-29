package com.calculadorametroscuadrados.calculadorametroscuadrados.dtos;

import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.Casa;
import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.Habitacion;

import java.util.ArrayList;

public class CasaDtoMapper
{
    public static Casa mapToCasa(CasaDto casa)
    {
        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        for (HabitacionDto h: casa.getHabitaciones())
        {
            habitaciones.add(HabitacionDtoMapper.mapToHabitacion(h));
        }

        return new Casa(casa.getNombre(), casa.getDireccion(), habitaciones);
    }
}
