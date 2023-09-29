package com.example.fams.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tblClass")
public class Class {

    @Id
    private Long classId;
    private String trainingProgramCode;
    private String className;
    private String classCode;
    private int duration;
    private String status;
    private String location;
    private  String fsu;
    private Date startDate;
    private Date endDate;
    private String createBy;
    private Date createDate;
    private String modifiedBy;
    private Date modifiedDate;
}
