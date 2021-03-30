package com.calculadorametroscuadrados.calculadorametroscuadrados.services;

import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.*;

public interface CasaService
{
    MetrosCuadradosTotales getMetrosCuadrados(Casa casa);

    CasaValor getValorCasa(Casa casa);

    Habitacion getHabitacionMasGrande(Casa casa);

    AreasHabitaciones getAreasHabitaciones(Casa casa);
}
