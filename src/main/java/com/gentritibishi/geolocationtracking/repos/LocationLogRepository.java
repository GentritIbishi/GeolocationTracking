package com.gentritibishi.geolocationtracking.repos;

import com.gentritibishi.geolocationtracking.model.LocationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationLogRepository extends JpaRepository<LocationLog, Long> {
}

