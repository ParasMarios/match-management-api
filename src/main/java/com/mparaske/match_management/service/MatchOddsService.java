package com.mparaske.match_management.service;

import com.mparaske.match_management.model.MatchOdds;
import com.mparaske.match_management.repository.MatchOddsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchOddsService {

    @Autowired
    private MatchOddsRepository matchOddsRepository;

    public List<MatchOdds> getAllOdds() {
        return matchOddsRepository.findAll();
    }

    public MatchOdds saveOdds(MatchOdds matchOdds) {
        return matchOddsRepository.save(matchOdds);
    }

    public void deleteOdds(Long id) {
        matchOddsRepository.deleteById(id);
    }
}