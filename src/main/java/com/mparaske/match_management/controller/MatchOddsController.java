package com.mparaske.match_management.controller;

import com.mparaske.match_management.model.MatchOdds;
import com.mparaske.match_management.service.MatchOddsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/match-odds")
public class MatchOddsController {

    private final MatchOddsService matchOddsService;

    public MatchOddsController(MatchOddsService matchOddsService) {
        this.matchOddsService = matchOddsService;
    }

    @GetMapping
    public List<MatchOdds> getAllOdds() {
        return matchOddsService.getAllOdds();
    }

    @PostMapping
    public MatchOdds createOdds(@RequestBody MatchOdds matchOdds) {
        return matchOddsService.saveOdds(matchOdds);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOdds(@PathVariable Long id) {
        matchOddsService.deleteOdds(id);
        return ResponseEntity.noContent().build();
    }
}