package com.calculadorametroscuadrados.calculadorametroscuadrados.controllers;

import com.calculadorametroscuadrados.calculadorametroscuadrados.dtos.*;
import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.AreasHabitaciones;
import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.CasaValor;
import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.Habitacion;
import com.calculadorametroscuadrados.calculadorametroscuadrados.entities.MetrosCuadradosTotales;
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
    @PostMapping("/metros-totales")
    public ResponseEntity metrosTotales(@RequestBody CasaDto casa)
    {
        MetrosCuadradosTotales metros = CasaService.getMetrosCuadrados(CasaDtoMapper.mapToCasa(casa));
        MetrosCuadradosTotalesDto resp = MetrosCuadradosTotalesDtoMapper.mapToDto(metros);
        return new ResponseEntity(resp, HttpStatus.OK);
    }

    @PostMapping("/valor")
    public ResponseEntity valor(@RequestBody CasaDto casa)
    {
        CasaValor valor = CasaService.getValorCasa(CasaDtoMapper.mapToCasa(casa), 800);
        return new ResponseEntity(CasaValorDtoMapper.mapToDto(valor), HttpStatus.OK);
    }

    @PostMapping("/habitacion-mas-grande")
    public ResponseEntity habitacionMasGrande(@RequestBody CasaDto casa)
    {
        Habitacion valor = CasaService.getHabitacionMasGrande(CasaDtoMapper.mapToCasa(casa));
        return new ResponseEntity(HabitacionDtoMapper.mapToDto(valor), HttpStatus.OK);
    }

    @PostMapping("/habitaciones-areas")
    public ResponseEntity habitacionesAreas(@RequestBody CasaDto casa)
    {
        AreasHabitaciones areas = CasaService.getAreasHabitaciones(CasaDtoMapper.mapToCasa(casa));
        return new ResponseEntity(AreasHabitacionesDtoMapper.mapToDto(areas), HttpStatus.OK);
    }
}
