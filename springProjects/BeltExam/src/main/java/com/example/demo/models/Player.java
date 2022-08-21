package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="players")
public class Player {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private User user;
//	@ManyToOne(fetch= FetchType.LAZY)
//	@JoinColumn(name="team_id")
//	private Team team;
	@NotNull
	@Size(min=3, max=20, message="name should be at least 3 characters")
	private String name;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
	public Player() {
		
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
//	public Team getTeam() {
//		return team;
//	}
//	public void setTeam(Team team) {
//		this.team = team;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
    
}
