package com.calculadorametroscuadrados.calculadorametroscuadrados.dtos;

import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.MetrosCuadradosTotales;

public class MetrosCuadradosTotalesDtoMapper
{
    public static MetrosCuadradosTotalesDto mapToDto(MetrosCuadradosTotales m)
    {
        return new MetrosCuadradosTotalesDto(m.getNombreCasa(), m.getMetrosCuadrados());
    }
}
