package com.topcollegueswithlogin.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur {

	public enum ROLES {
		ROLE_ADMINISTRATEUR, ROLE_UTILISATEUR
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String pseudo;
	@Column
	private String password;
	
	@Column
	@Enumerated(EnumType.STRING)
	private ROLES role;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ROLES getRole() {
		return role;
	}
	public void setRole(ROLES role) {
		this.role = role;
	}
}

