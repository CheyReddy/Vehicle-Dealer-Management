package com.dvm.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long dealerId;
    private Double amount;

    @Enumerated(EnumType.STRING)
    private PaymentMethod method;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDealerId() {
		return dealerId;
	}
	public void setDealerId(Long dealerId) {
		this.dealerId = dealerId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public PaymentMethod getMethod() {
		return method;
	}
	public void setMethod(PaymentMethod method) {
		this.method = method;
	}
	public PaymentStatus getStatus() {
		return status;
	}
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Payment(Long id, Long dealerId, Double amount, PaymentMethod method, PaymentStatus status,
			LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.dealerId = dealerId;
		this.amount = amount;
		this.method = method;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Payment(Long dealerId, Double amount, PaymentMethod method, PaymentStatus status, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		this.dealerId = dealerId;
		this.amount = amount;
		this.method = method;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Payment() {
		super();
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", dealerId=" + dealerId + ", amount=" + amount + ", method=" + method
				+ ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
    
}
