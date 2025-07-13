package com.gentritibishi.geolocationtracking.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "video_url")
public class VideoUrl {
    @Id
    private Long id = 1L; // Always use ID = 1

    @Column(nullable = false)
    private String url;

    public VideoUrl(String url) {
        this.url = url;
    }

}

