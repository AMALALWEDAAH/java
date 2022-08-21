package com.example.demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expense")
public class Expense {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 5, max = 200, message="Title must be at least 5 characters.")
    private String title;
    @NotNull
    @Size(min = 5, max = 200, message="Description must be at least 5 characters.")
    private String vendor;
    @NotNull
    @Size(min = 5, max = 200, message="Description must not be blank.")
    private String description;
    @NotNull
    @Min(value=1, message="Must be at least 100 pages.")
    private Integer amount;
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;

    
    
	public Expense(Long id,
			@NotNull @Size(min = 5, max = 200, message = "Title must be at least 5 characters.") String title,
			@NotNull @Size(min = 5, max = 200, message = "Description must be at least 5 characters.") String vendor,
			@NotNull @Size(min = 5, max = 200, message = "Description must not be blank.") String description,
			@NotNull @Min(value = 1, message = "Must be at least 100 pages.") Integer amount, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		this.title = title;
		this.vendor = vendor;
		this.description = description;
		this.amount = amount;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
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
