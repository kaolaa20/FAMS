package com.example.fams.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tblTrainingProgram")
public class TrainingProgram {

    @Id
    private String trainingProgramCode;
    private String name;
    private Long userId;
    private Date starTime;
    private int duration;
    private String topicCode;
    private String status;
    private String createBy;
    private Date createDate;
    private String modifiedBy;
    private Date modifiedDate;
}
