package com.example.schedule.schedule.repository;

import com.example.schedule.schedule.model.entity.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Long> {
}
