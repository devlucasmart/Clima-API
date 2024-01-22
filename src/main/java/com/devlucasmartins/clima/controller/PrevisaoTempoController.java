package com.devlucasmartins.clima.controller;

import com.devlucasmartins.clima.dto.HGBrasilResponse;
import com.devlucasmartins.clima.service.HGBrasilService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("weather")
@RequiredArgsConstructor
public class PrevisaoTempoController {
    private final HGBrasilService service;

    @GetMapping("{city}")
    public HGBrasilResponse getWeatherForCity(@PathVariable String city) {
        return service.fetchWeatherForCity(city);
    }
}