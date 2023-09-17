package com.orkun.weathermicroservices.exception;

public record Error(
        String code,
        String type,
        String info
) {
}
