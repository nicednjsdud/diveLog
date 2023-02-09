package com.example.divelog.core.diveresort.domain;

import com.example.divelog.core.diveresort.infrastructure.DiveResortJpaRepository;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DiveResortTest {

    @Autowired
    DiveResortJpaRepository diveResortJpaRepository;

    @Test
    void testCreate(){
        String name = "동해다이브리조트";
        String ownerName = "bob";
        String contactNumber = "031-000-0000";
        String address = "강원도 동해시";
        String description = "동해 어느구석";

        DiveResort diveResort = new DiveResort();
        diveResort.toEntity(name, ownerName, contactNumber, address, description);
        diveResortJpaRepository.save(diveResort);

        DiveResort findDiveResort = diveResortJpaRepository.findByName(name);

            assertThat(findDiveResort.getName()).isEqualTo(name);
            assertThat(findDiveResort.getOwnerName()).isEqualTo(ownerName);
            assertThat(findDiveResort.getContactNumber()).isEqualTo(contactNumber);
            assertThat(findDiveResort.getAddress()).isEqualTo(address);
            assertThat(findDiveResort.getDescription()).isEqualTo(description);
            assertThat(findDiveResort.getCreatedDateTime()).isNotNull();
            assertThat(findDiveResort.getLastModifiedDateTime()).isNotNull();
            assertThat(findDiveResort.getLastModifiedDateTime()).isEqualTo(findDiveResort.getCreatedDateTime());
    }

}