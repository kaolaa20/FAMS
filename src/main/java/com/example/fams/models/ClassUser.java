package com.example.fams.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tblClassUser")
public class ClassUser {

    @Id
    private long userId;
    private long classId;
    private String userType;
}
