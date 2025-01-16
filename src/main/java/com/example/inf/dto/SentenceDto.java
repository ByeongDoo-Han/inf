package com.example.inf.dto;

import lombok.Builder;

public record SentenceDto(Long id, String engSen, String korSen) {
    @Builder
    public SentenceDto {
    }
}
