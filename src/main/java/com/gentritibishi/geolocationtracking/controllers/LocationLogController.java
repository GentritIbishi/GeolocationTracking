package com.gentritibishi.geolocationtracking.controllers;

import com.gentritibishi.geolocationtracking.model.LocationLog;
import com.gentritibishi.geolocationtracking.repos.LocationLogRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/log-location")
public class LocationLogController {

    @Autowired
    private LocationLogRepository repo;

    @PostMapping
    public ResponseEntity<Void> logLocation(@RequestBody LocationLog log,
                                            HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if (ip == null) {
            ip = request.getRemoteAddr();
        }
        log.setIp(ip);
        log.setTimestamp(LocalDateTime.now());
        repo.save(log);
        return ResponseEntity.ok().build();
    }
}

