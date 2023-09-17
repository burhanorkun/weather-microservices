package com.orkun.weathermicroservices.dto;

public record WeatherResponse(
        Request request,
        Location location,
        Current current
) {
}
