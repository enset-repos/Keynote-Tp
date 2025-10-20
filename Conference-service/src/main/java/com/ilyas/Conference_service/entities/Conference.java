package com.ilyas.Conference_service.entities;

import com.ilyas.Conference_service.enums.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Conference {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDateTime date;
    private Type type;
    private Long duration;
    private Long participantNumber;
    private Long score;
}
