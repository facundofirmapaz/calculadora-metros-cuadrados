package com.calculadorametroscuadrados.calculadorametroscuadrados.services;

import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CasaService
{
    public static MetrosCuadradosTotales getMetrosCuadrados(Casa casa)
    {
        double areaTotal = 0;
        for (Habitacion h: casa.getHabitaciones())
        {
            areaTotal += h.metrosCuadrados();
        }

        return new MetrosCuadradosTotales(casa.getNombre(), areaTotal);
    }

    public static CasaValor getValorCasa(Casa casa, double precioMetroCuadrado)
    {
        double valor = getMetrosCuadrados(casa).getMetrosCuadrados() * precioMetroCuadrado;
        return new CasaValor(casa.getNombre(), valor);
    }

    public static Habitacion getHabitacionMasGrande(Casa casa)
    {
        Comparator<Habitacion> c = (x, y)-> { return Double.compare(x.metrosCuadrados(), y.metrosCuadrados()); };

        return casa.getHabitaciones().stream().max(c).get();
    }

    public static AreasHabitaciones getAreasHabitaciones(Casa casa)
    {
        ArrayList<HabitacionArea> habAreas = new ArrayList<>();

        for (Habitacion h: casa.getHabitaciones())
        {
            habAreas.add(new HabitacionArea(h.getNombre(), h.metrosCuadrados()));
        }

        return new AreasHabitaciones(habAreas);
    }
}
