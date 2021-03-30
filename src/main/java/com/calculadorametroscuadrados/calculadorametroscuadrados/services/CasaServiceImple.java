package com.calculadorametroscuadrados.calculadorametroscuadrados.services;
import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.*;
import com.calculadorametroscuadrados.calculadorametroscuadrados.repositories.PriceRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;

@Service
public class CasaServiceImple implements CasaService
{
    private final PriceRepository priceRepository;

    public CasaServiceImple(PriceRepository priceRepository)
    {
        this.priceRepository = priceRepository;
    }

    @Override
    public  MetrosCuadradosTotales getMetrosCuadrados(Casa casa)
    {
        double areaTotal = 0;
        for (Habitacion h: casa.getHabitaciones())
        {
            areaTotal += h.metrosCuadrados();
        }

        return new MetrosCuadradosTotales(casa.getNombre(), areaTotal);
    }

    @Override
    public  CasaValor getValorCasa(Casa casa)
    {
        Price precio = priceRepository.findPriceByLocation(casa.getLocation());
        double precioMetroCuadrado = precio == null ? 800 : precio.getPrice();
        double valor = getMetrosCuadrados(casa).getMetrosCuadrados() * precioMetroCuadrado;
        return new CasaValor(casa.getNombre(), valor);
    }

    @Override
    public  Habitacion getHabitacionMasGrande(Casa casa)
    {
        Comparator<Habitacion> c = Comparator.comparingDouble(Habitacion::metrosCuadrados);

        return casa.getHabitaciones().stream().max(c).get();
    }

    @Override
    public AreasHabitaciones getAreasHabitaciones(Casa casa) {

        ArrayList<HabitacionArea> habAreas = new ArrayList<>();

        for (Habitacion h: casa.getHabitaciones())
        {
            habAreas.add(new HabitacionArea(h.getNombre(), h.metrosCuadrados()));
        }

        return new AreasHabitaciones(habAreas);
    }
}
