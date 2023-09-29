package com.example.fams.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tblSyllabus")
public class Syllabus {
    private String topicCode;
    private String topicName;
    private String technicalGroup;
    private String version;
    private int trainingAudience;
    private String topicOutline;
    private String trainingMaterials;
    private String trainingPrinciples;
    private String Priority;
    private String publicStatus;
    private String createBy;
    private LocalDate createDate;
    private String modifiedBy;
    private LocalDate modifiedDate;

}
