package com.example.schedule.schedule.model.dto;

import com.example.schedule.user.model.dto.UserDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ScheduleDTO {
    private Long scheduleNo;
    private String title;
    private List<UserDTO> attendeeList;
    private LocalDate startDate;
    private LocalDateTime startDateTime;
    private LocalDate endDate;
    private LocalDateTime endDateTime;
    private String description;
    private String insertUserName;
}
