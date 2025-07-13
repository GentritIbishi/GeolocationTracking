package com.gentritibishi.geolocationtracking.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "location_logs")
public class LocationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ip;
    private String permission;
    private Double lat;
    private Double lon;
    private String reason;
    private LocalDateTime timestamp;

}

