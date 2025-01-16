package com.example.inf.controller;

import com.example.inf.dto.SentenceDto;
import com.example.inf.service.SentenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/eng")
@RequiredArgsConstructor
public class SentenceController {

    private final SentenceService sentenceService;

    @GetMapping("/{id}")
    public ResponseEntity<SentenceDto> getSentence(@PathVariable Long id){
        return ResponseEntity.ok(sentenceService.getSentence(id));
    }

}
