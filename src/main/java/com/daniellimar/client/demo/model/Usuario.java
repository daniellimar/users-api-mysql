package com.daniellimar.client.demo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users", schema = "_sistema")
public class Usuario {

    @Id
    private Long id;

    @Column(name = "id_aluno")
    private Long idAluno;

    private String name;
    private String login;
    private String apelido;
    private String email;
    private Boolean status;

    @Column(name = "id_curso")
    private Long idCurso;

    @Column(name = "id_cursos_info")
    private Long idCursosInfo;

    @Column(name = "nivel_acesso")
    private String nivelAcesso;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = Boolean.valueOf(status);
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public Long getIdCursosInfo() {
        return idCursosInfo;
    }

    public void setIdCursosInfo(Long idCursosInfo) {
        this.idCursosInfo = idCursosInfo;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}