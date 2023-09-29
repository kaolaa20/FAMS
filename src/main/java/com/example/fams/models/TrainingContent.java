package com.example.fams.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tblTrainingContent")
public class TrainingContent {
    private String content;
    private String learningObjective;
    private String type;
    private deliveryType;
    private int duration;
    private String trainingFormat;
    private Stirng note;
    private String unitCode;
}
