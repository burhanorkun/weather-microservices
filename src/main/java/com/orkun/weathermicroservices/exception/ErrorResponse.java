package com.orkun.weathermicroservices.exception;

public record ErrorResponse(
        String success,
        Error error
) {
}
