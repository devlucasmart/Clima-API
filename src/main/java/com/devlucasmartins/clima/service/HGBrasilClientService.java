package com.devlucasmartins.clima.service;

import com.devlucasmartins.clima.dto.HGBrasilResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hgBrasilClient", url = "https://api.hgbrasil.com")
public interface HGBrasilClientService {
    @GetMapping("/weather")
    HGBrasilResponse fetchWeatherForCity(
            @RequestParam("key") String apiKey,
            @RequestParam("array_limit") int arrayLimit,
            @RequestParam("fields") String fields,
            @RequestParam("city_name") String city
    );
}
