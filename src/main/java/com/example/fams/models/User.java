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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tblUser")
public class User {

    @Id
    private Long userId;
    private String name;
    private String email;
    private String phone;
    private Date dob;
    private String gender;
    private int role;
    private boolean status;
    private String createBy;
    private Date createDate;
    private String modifiedBy;
    private Date modifiedDate;
}
