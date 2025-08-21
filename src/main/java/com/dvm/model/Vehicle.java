package com.dvm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table
public class Vehicle {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "model")
	private String model;
	
	@Column(name="price")
	private Double price;
	
	@Enumerated(EnumType.STRING)
	private VehicleStatus status;
	
	@ManyToOne
    @JoinColumn(name = "dealer_id", nullable = false)
    private Dealer dealer;
	
	@Version
	@Column(nullable = false)
	private Long version = 0L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public VehicleStatus getStatus() {
		return status;
	}

	public void setStatus(VehicleStatus status) {
		this.status = status;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public Vehicle(Long id, String model, Double price, VehicleStatus status, Dealer dealer) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.status = status;
		this.dealer = dealer;
	}

	public Vehicle(String model, Double price, VehicleStatus status, Dealer dealer) {
		super();
		this.model = model;
		this.price = price;
		this.status = status;
		this.dealer = dealer;
	}

	public Vehicle() {
		super();
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", model=" + model + ", price=" + price + ", status=" + status + ", dealer="
				+ dealer + "]";
	}
	
}
