package com.attica.athens.agora.dto;

import com.attica.athens.agora.domain.Category;
import java.time.LocalTime;

public record CreateAgoraRequestDto(
    String title,
    Integer capacity,
    Integer duration,
    String color,
    Category code
) {

    static final int DIVISION_MINUTE = 60;

    public LocalTime getDuration() {
        if (duration >= 60) {
            int hour = duration / DIVISION_MINUTE;
            int minute = duration - hour * DIVISION_MINUTE;
            return LocalTime.of(hour, minute);
        } else {
            return LocalTime.of(0, duration);
        }
    }
}
