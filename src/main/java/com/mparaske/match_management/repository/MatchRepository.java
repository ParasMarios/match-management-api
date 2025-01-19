package com.mparaske.match_management.repository;

import com.mparaske.match_management.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
