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
@Table(name = "tblTrainingUnit")
public class TrainingUnit {
    private String unitCode;
    private String unitName;
    private int dayNumber;
    private String topicCode;
}
