package com.example.inf.service;

import com.example.inf.dto.SentenceDto;
import com.example.inf.entity.Sentence;
import com.example.inf.repository.SentenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class SentenceService {
    private final SentenceRepository sentenceRepository;
    public SentenceDto getSentence(Long id) {
        Sentence foundSentence = sentenceRepository.findById(id).orElseThrow(
            NoSuchElementException::new
        );
        return SentenceDto.builder()
            .id(foundSentence.getId())
            .engSen(foundSentence.getEngSen())
            .korSen(foundSentence.getKorSen())
            .build();
    }
}
