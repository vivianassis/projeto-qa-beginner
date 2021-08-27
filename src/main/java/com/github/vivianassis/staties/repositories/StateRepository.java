package com.github.vivianassis.staties.repositories;

import com.github.vivianassis.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
