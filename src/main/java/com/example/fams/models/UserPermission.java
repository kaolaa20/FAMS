package com.example.fams.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tblUserPermission")
public class UserPermission {

    @Id
    private Long permissionid;
    private String role;
    private String syllabus;
    private String class_;
    private String learningMaterial;
    private String userManagement;
}
