package com.example.divelog.core.diveresort.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiveResortRepository {

    DiveResort findByName(String name);
}
