package com.gentritibishi.geolocationtracking.controllers;

import com.gentritibishi.geolocationtracking.model.VideoUrl;
import com.gentritibishi.geolocationtracking.repos.VideoUrlRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/video-url")
@CrossOrigin(origins = "*")
public class VideoUrlController {

    @Autowired
    private VideoUrlRepository videoRepo;

    @GetMapping
    public VideoUrl getVideoUrl() {
        return videoRepo.findById(1L)
                .orElseGet(() -> videoRepo.save(new VideoUrl("https://www.youtube.com/watch?v=dQw4w9WgXcQ")));
    }
}
