package com.ilyas.Keynote_service.repository;

import com.ilyas.Keynote_service.entities.Keynote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface KeynoteRepo extends JpaRepository<Keynote, Long> {
    Optional<Keynote> findByEmail(String email);
}
