package com.ilyas.Conference_service.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "confProjection", types = Conference.class)
public interface ConfernceProjection {
    Long getId();
    String getTitle();
    Long getParticipantNumber();
}
