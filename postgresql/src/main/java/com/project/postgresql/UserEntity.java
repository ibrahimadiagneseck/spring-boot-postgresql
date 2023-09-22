package com.project.postgresql;

import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "date_naissance")
    private Date dateNaissance;

    @Column(name = "lieu_naissance")
    private Date lieuNaissance;


    public UserEntity() {
    }

    public UserEntity(Long id, String username, String email, Date dateNaissance, Date lieuNaissance) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        dateNaissance = dateNaissance;
    }

    public Date getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(Date lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }
}
