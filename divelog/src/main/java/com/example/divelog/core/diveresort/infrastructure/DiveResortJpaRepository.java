package com.example.divelog.core.diveresort.infrastructure;

import com.example.divelog.core.diveresort.domain.DiveResort;
import com.example.divelog.core.diveresort.domain.DiveResortRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiveResortJpaRepository extends DiveResortRepository, JpaRepository<DiveResort, Long> {
}
