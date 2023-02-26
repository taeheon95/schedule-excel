package com.example.schedule.schedule.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class ScheduleDTO {
    private Long scheduleNo;
    private String title;
    private LocalDate startDate;
    private LocalDateTime startDateTime;
    private LocalDate endDate;
    private LocalDateTime endDateTime;
    private String description;
    private String insertUserName;
}
