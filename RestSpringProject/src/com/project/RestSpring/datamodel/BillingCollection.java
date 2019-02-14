package com.project.RestSpring.datamodel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "oltp_billing_collection")
public class BillingCollection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7070934711823583408L;

	@Id
	@SequenceGenerator(name = "oltp_billing_collection_billing_collection_id_seq", sequenceName = "oltp_billing_collection_billing_collection_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "oltp_billing_collection_billing_collection_id_seq")
	@Column(name = "billing_collection_id", unique = true, nullable = false)
	private Integer billingcollectionId;

	@Column(name = "billing_collection_category")
	private String billingcollectionCategory;

	@Column(name = "billing_collection_value")
	private String billingcollectionValue;

	@Column(name = "is_active")
	private boolean isActive;

	@Column(name = "created_date")
	private Date createdDate;

	@Override
	public String toString() {
		return "BillingCollection [billingcollectionId=" + billingcollectionId + ", billingcollectionCategory="
				+ billingcollectionCategory + ", billingcollectionValue=" + billingcollectionValue + ", isActive="
				+ isActive + ", createdDate=" + createdDate + "]";
	}

	public Integer getBillingcollectionId() {
		return billingcollectionId;
	}

	public void setBillingcollectionId(Integer billingcollectionId) {
		this.billingcollectionId = billingcollectionId;
	}

	public String getBillingcollectionCategory() {
		return billingcollectionCategory;
	}

	public void setBillingcollectionCategory(String billingcollectionCategory) {
		this.billingcollectionCategory = billingcollectionCategory;
	}

	public String getBillingcollectionValue() {
		return billingcollectionValue;
	}

	public void setBillingcollectionValue(String billingcollectionValue) {
		this.billingcollectionValue = billingcollectionValue;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
