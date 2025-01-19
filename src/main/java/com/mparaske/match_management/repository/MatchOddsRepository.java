package com.mparaske.match_management.repository;

import com.mparaske.match_management.model.MatchOdds;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchOddsRepository extends JpaRepository<MatchOdds, Long> {
}
