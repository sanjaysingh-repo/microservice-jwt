/**
 * 
 */
package com.techturtles.common.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.techturtles.common.enums.Authorities;



/**
 * @author sk sanjay
 *
 */
@Entity
@Table(name="user_roles")
public class Roles implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int role_id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "email", nullable = false)
	private User user;
	
	@NotNull
    @Enumerated(EnumType.STRING)
	private Authorities role;

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Authorities getRole() {
		return role;
	}

	public void setRole(Authorities role) {
		this.role = role;
	}
	
	
}
