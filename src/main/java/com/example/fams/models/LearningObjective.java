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
@Table(name = "tblLearningObjective")
public class LearningObjective {
    private String code;
    private String name;
    private String type;
    private String description;
}
