package com.example.divelog.core.diveresort.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class DiveResort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "OWNER_NAME")
    private String ownerName;

    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdDateTime;

    @Column(name = "MODIFIED_AT")
    private LocalDateTime lastModifiedDateTime;

    public DiveResort toEntity(String name, String ownerName, String contactNumber, String address, String description) {
        this.name = name;
        this.ownerName = ownerName;
        this.contactNumber = contactNumber;
        this.address = address;
        this.description = description;
        this.createdDateTime = LocalDateTime.now();
        this.lastModifiedDateTime = LocalDateTime.now();
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiveResort that = (DiveResort) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getOwnerName(), that.getOwnerName()) && Objects.equals(getContactNumber(), that.getContactNumber()) && Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getCreatedDateTime(), that.getCreatedDateTime()) && Objects.equals(getLastModifiedDateTime(), that.getLastModifiedDateTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getOwnerName(), getContactNumber(), getAddress(), getDescription(), getCreatedDateTime(), getLastModifiedDateTime());
    }
}
