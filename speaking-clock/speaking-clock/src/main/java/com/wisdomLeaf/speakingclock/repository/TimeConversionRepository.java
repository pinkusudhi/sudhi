package com.wisdomLeaf.speakingclock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wisdomLeaf.speakingclock.model.TimeConversion;

public interface TimeConversionRepository extends JpaRepository<TimeConversion, Long>{

}
