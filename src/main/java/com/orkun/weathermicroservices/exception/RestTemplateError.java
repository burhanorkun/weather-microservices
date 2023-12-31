package com.orkun.weathermicroservices.exception;

public record RestTemplateError(
        String timestamp,
        String status,
        String error,
        String path
) {
}
