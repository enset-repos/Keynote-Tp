package com.ilyas.Keynote_service.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullKeynote", types = Keynote.class)
public interface KeynoteProjection {
    Long getId();
    String getFirstName();
    String getLastName();
    String getEmail();
    String getProfession();
}
