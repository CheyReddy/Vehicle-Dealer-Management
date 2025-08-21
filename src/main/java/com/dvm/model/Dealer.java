package com.dvm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class Dealer {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="email")
	@NotBlank(message = "Email is required")
    @Email(message = "Enter a valid email address")
	private String email;
	
	@Enumerated(EnumType.STRING)
	private SubscriptionType subscriptionType;
	
	@Version
	@Column(nullable = false)
	private Long version = 0L;

	@Column(name="password")
	@NotBlank(message = "Password is required")
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(SubscriptionType subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Dealer(Long id, String name, String email, SubscriptionType subscriptionType, Long version,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.subscriptionType = subscriptionType;
		this.version = version;
		this.password = password;
	}

	public Dealer(String name, String email, SubscriptionType subscriptionType, Long version, String password) {
		super();
		this.name = name;
		this.email = email;
		this.subscriptionType = subscriptionType;
		this.version = version;
		this.password = password;
	}

	public Dealer() {
		super();
	}

	@Override
	public String toString() {
		return "Dealer [id=" + id + ", name=" + name + ", email=" + email + ", subscriptionType=" + subscriptionType
				+ ", version=" + version + ", password=" + password + "]";
	}
	
}
