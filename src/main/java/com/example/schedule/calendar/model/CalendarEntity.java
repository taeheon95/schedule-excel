package com.example.schedule.calendar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "t_calendar")
public class CalendarEntity {
    @Id
    @GeneratedValue
    private Long calendarNo;
    private String title;
    private String description;
    private Long insertUserNo;
    private Long updateUserNo;
    private LocalDateTime insertTimestamp;
    private LocalDateTime updateTimestamp;
}
