package com.ilyas.Conference_service.respository;

import com.ilyas.Conference_service.entities.Conference;
import com.ilyas.Conference_service.enums.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConferenceRepo extends JpaRepository<Conference, Long> {
    List<Conference> findAllByType(Type type);
    List<Conference> findAllByParticipantNumberGreaterThan(Long number);
    List<Conference> findAllByParticipantNumberLessThan(Long number);
}
