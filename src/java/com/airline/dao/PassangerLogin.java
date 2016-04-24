/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.dao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lin
 */
@Entity
@Table(name = "PASSANGER_LOGIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PassangerLogin.findAll", query = "SELECT p FROM PassangerLogin p"),
    @NamedQuery(name = "PassangerLogin.findByLoginId", query = "SELECT p FROM PassangerLogin p WHERE p.loginId = :loginId"),
    @NamedQuery(name = "PassangerLogin.findByLoginUserName", query = "SELECT p FROM PassangerLogin p WHERE p.loginUserName = :loginUserName"),
    @NamedQuery(name = "PassangerLogin.findByLoginPassword", query = "SELECT p FROM PassangerLogin p WHERE p.loginPassword = :loginPassword"),
    @NamedQuery(name = "PassangerLogin.findByActive", query = "SELECT p FROM PassangerLogin p WHERE p.active = :active")})
public class PassangerLogin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @NotNull
    @Column(name = "LOGIN_ID")
    private Integer loginId;
    @Size(max = 30)
    @Column(name = "LOGIN_USER_NAME")
    private String loginUserName;
    @Size(max = 30)
    @Column(name = "LOGIN_PASSWORD")
    private String loginPassword;
    @Column(name = "ACTIVE")
    private Character active;

    public PassangerLogin() {
    }

    public PassangerLogin(Integer loginId) {
        this.loginId = loginId;
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getLoginUserName() {
        return loginUserName;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public Character getActive() {
        return active;
    }

    public void setActive(Character active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginId != null ? loginId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PassangerLogin)) {
            return false;
        }
        PassangerLogin other = (PassangerLogin) object;
        if ((this.loginId == null && other.loginId != null) || (this.loginId != null && !this.loginId.equals(other.loginId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.airline.dao.PassangerLogin[ loginId=" + loginId + " ]";
    }
    
}
