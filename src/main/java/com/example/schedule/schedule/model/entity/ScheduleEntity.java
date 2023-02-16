package com.example.schedule.schedule.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "t_schedule")
@Getter
public class ScheduleEntity {
    @Id
    @GeneratedValue
    private Long scheduleNo;
    private String title;
    private LocalDate startDate;
    private LocalDateTime startDateTime;
    private LocalDate endDate;
    private LocalDateTime endDateTime;
    private String description;
    private Long insertUserNo;
    private Long updateUserNo;
    @CreationTimestamp
    private LocalDateTime insertTimestamp;
    @UpdateTimestamp
    private LocalDateTime updateTimestamp;
}
