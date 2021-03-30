package com.calculadorametroscuadrados.calculadorametroscuadrados.controllers;

import com.calculadorametroscuadrados.calculadorametroscuadrados.dtos.*;
import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.*;
import com.calculadorametroscuadrados.calculadorametroscuadrados.services.CasaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casa")
public class CasaController
{
    private final CasaService casaService;

    public CasaController(CasaService casaService)
    {
        this.casaService = casaService;
    }

    @PostMapping("/metros-totales")
    public ResponseEntity metrosTotales(@RequestBody CasaDto casa)
    {
        MetrosCuadradosTotales metros = casaService.getMetrosCuadrados(CasaDtoMapper.mapToCasa(casa));
        MetrosCuadradosTotalesDto resp = MetrosCuadradosTotalesDtoMapper.mapToDto(metros);
        return new ResponseEntity(resp, HttpStatus.OK);
    }

    @PostMapping("/valor")
    public ResponseEntity valor(@RequestBody CasaDto casa)
    {
        CasaValor valor = casaService.getValorCasa(CasaDtoMapper.mapToCasa(casa));
        return new ResponseEntity(CasaValorDtoMapper.mapToDto(valor), HttpStatus.OK);
    }

    @PostMapping("/habitacion-mas-grande")
    public ResponseEntity habitacionMasGrande(@RequestBody CasaDto casa)
    {
        Habitacion valor = casaService.getHabitacionMasGrande(CasaDtoMapper.mapToCasa(casa));
        return new ResponseEntity(HabitacionDtoMapper.mapToDto(valor), HttpStatus.OK);
    }

    @PostMapping("/habitaciones-areas")
    public ResponseEntity habitacionesAreas(@RequestBody CasaDto casa)
    {
        AreasHabitaciones areas = casaService.getAreasHabitaciones(CasaDtoMapper.mapToCasa(casa));
        return new ResponseEntity(AreasHabitacionesDtoMapper.mapToDto(areas), HttpStatus.OK);
    }
}
