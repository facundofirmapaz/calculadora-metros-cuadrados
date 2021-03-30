package com.calculadorametroscuadrados.calculadorametroscuadrados.repositories;

import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.Price;

public interface PriceRepository
{
    Price findPriceByLocation(String location);
}
