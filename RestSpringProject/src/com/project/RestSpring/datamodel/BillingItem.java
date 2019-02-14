package com.project.RestSpring.datamodel;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "oltp_billing_item_details")
public class BillingItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2790389522101321227L;
	
	@Id
	@SequenceGenerator(name = "oltp_billing_item_details_billing_item_id_seq", sequenceName = "oltp_billing_item_details_billing_item_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "oltp_billing_item_details_billing_item_id_seq")
	@Column(name = "billing_item_id", unique = true, nullable = false)
	private Integer billingitemId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "billingitemname")
	@Fetch(value = FetchMode.SELECT)
	private BillingCollection billingItemName;
	
	
	@Column(name = "charges")
	private BigDecimal charges;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "billing_info_id")
	@Fetch(value = FetchMode.SELECT)
	private BillingInfo billingInfo;

	@Override
	public String toString() {
		return "BillingItem [billingitemId=" + billingitemId + ", billingItemName=" + billingItemName + ", charges="
				+ charges + ", billingInfo=" + billingInfo + "]";
	}

	public Integer getBillingitemId() {
		return billingitemId;
	}

	public void setBillingitemId(Integer billingitemId) {
		this.billingitemId = billingitemId;
	}

	public BillingCollection getBillingItemName() {
		return billingItemName;
	}

	public void setBillingItemName(BillingCollection billingItemName) {
		this.billingItemName = billingItemName;
	}

	public BigDecimal getCharges() {
		return charges;
	}

	public void setCharges(BigDecimal charges) {
		this.charges = charges;
	}

	public BillingInfo getBillingInfo() {
		return billingInfo;
	}

	public void setBillingInfo(BillingInfo billingInfo) {
		this.billingInfo = billingInfo;
	}
	
	
	
	

}
