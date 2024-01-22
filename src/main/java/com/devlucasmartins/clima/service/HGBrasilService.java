package com.devlucasmartins.clima.service;

import com.devlucasmartins.clima.dto.HGBrasilResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HGBrasilService {
    private final HGBrasilClientService client;

    public HGBrasilResponse fetchWeatherForCity(String city) {
        String apiKey = "aa5bcb40";
        int arrayLimit = 3;
        String fields = "only_results,temp,city_name,forecast,max,min,date";

        return client.fetchWeatherForCity(apiKey, arrayLimit, fields, city);
    }
}
