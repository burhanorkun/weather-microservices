package com.orkun.weathermicroservices.dto;

public record Request(
        String type,
        String query,
        String language,
        String unit
) {
}
