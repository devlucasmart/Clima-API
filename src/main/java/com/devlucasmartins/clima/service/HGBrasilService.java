package com.devlucasmartins.clima.service;

import com.devlucasmartins.clima.dto.HGBrasilResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HGBrasilService {
    private final HGBrasilClientService client;
    @Value("${hgbrazil.apiKey}")
    private String apiKey;

    public HGBrasilResponse fetchWeatherForCity(String city) {

        int arrayLimit = 3;
        String fields = "only_results,temp,city_name,forecast,max,min,date";

        return client.fetchWeatherForCity(apiKey, arrayLimit, fields, city);
    }
}
