package com.calculadorametroscuadrados.calculadorametroscuadrados.dtos;

import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.CasaValor;

public class CasaValorDtoMapper
{
    public static CasaValorDto mapToDto(CasaValor c)
    {
        return new CasaValorDto(c.getNombreCasa(), c.getValor());
    }
}
