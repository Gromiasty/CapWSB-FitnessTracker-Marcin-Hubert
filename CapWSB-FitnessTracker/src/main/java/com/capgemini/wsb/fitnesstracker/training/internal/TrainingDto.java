package com.capgemini.wsb.fitnesstracker.training.internal;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING;

/**
 * Data Transfer Object for Training.
 */
@Getter
@AllArgsConstructor
public class TrainingDto {
    
    /**
     * The ID of the training session.
     */
    private final Long id;
    
    /**
     * The user associated with the training session.
     */
    private final TrainingUserDto user;
    
    /**
     * The start time of the training session.
     */
    @JsonFormat(shape = STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private final LocalDateTime startTime;
    
    /**
     * The end time of the training session.
     */
    @JsonFormat(shape = STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private final LocalDateTime endTime;
    
    /**
     * The distance covered during the training session in kilometers.
     */
    private final double distance;
    
    /**
     * The average speed during the training session in kilometers per hour.
     */
    private final double averageSpeed;
    
    /**
     * The type of activity performed during the training session.
     */
    private final ActivityType activityType;
}