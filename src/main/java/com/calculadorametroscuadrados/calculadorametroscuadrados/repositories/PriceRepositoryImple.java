package com.calculadorametroscuadrados.calculadorametroscuadrados.repositories;

import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.Price;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;

@Repository
public class PriceRepositoryImple implements PriceRepository
{
    @Override
    public Price findPriceByLocation(String location)
    {
        ArrayList<Price> precios = null;

        precios = loadDataBase();

        Price resultado = null;

        if (precios != null)
        {
            resultado = precios.stream().filter(x -> x.getLocation().equals(location)).findFirst().get();
        }

        return resultado;
    }

    private ArrayList<Price> loadDataBase()
    {
        File file;
        ArrayList<Price> precios = null;

        try
        {
            file = ResourceUtils.getFile("classpath:prices.json");
            ObjectMapper objectMapper = new ObjectMapper();
            com.fasterxml.jackson.core.type.TypeReference<ArrayList<Price>> typeReference = new com.fasterxml.jackson.core.type.TypeReference<>() {};

            precios = objectMapper.readValue(file, typeReference);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return precios;
    }
}
