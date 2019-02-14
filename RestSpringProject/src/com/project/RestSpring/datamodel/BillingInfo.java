package com.project.RestSpring.datamodel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
@Table(name = "oltp_billing_info")
public class BillingInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2272741825973682123L;

	@Id
	@SequenceGenerator(name = "oltp_billing_info_billing_info_id_seq", sequenceName = "oltp_billing_info_billing_info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "oltp_billing_info_billing_info_id_seq")
	@Column(name = "billing_info_id", unique = true, nullable = false)
	private Integer billinginfoId;

	@Column(name = "dateofadmission")
	private Date dateofadmission;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "type_of_admission")
	@Fetch(value = FetchMode.SELECT)
	private BillingCollection typeofAdmission;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "roomwardtype")
	@Fetch(value = FetchMode.SELECT)
	private BillingCollection roomwardType;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "dischargetype")
	@Fetch(value = FetchMode.SELECT)
	private BillingCollection dischargeType;

	@Column(name = "stayindays")
	private Integer stayindays;

	
	@Column(name = "dateofsurgery")
	private Date dateofSurgery;
	
	@Column(name = "dateofdischarge")
	private Date dateofDischarge;

	@Column(name = "expectedcosthospitalization")
	private BigDecimal expectedcosthospitalization;
	
	

	@Column(name = "actualcosthospitalization")
	private BigDecimal actualcostHospitalization;
	
	
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "preauth_claim_id")
    @Fetch(value = FetchMode.SELECT)
    private EmployeeModel employeeId;


	@Override
	public String toString() {
		return "BillingInfo [billinginfoId=" + billinginfoId + ", dateofadmission=" + dateofadmission
				+ ", typeofAdmission=" + typeofAdmission + ", roomwardType=" + roomwardType + ", dischargeType="
				+ dischargeType + ", stayindays=" + stayindays + ", dateofSurgery=" + dateofSurgery
				+ ", dateofDischarge=" + dateofDischarge + ", expectedcosthospitalization="
				+ expectedcosthospitalization + ", actualcostHospitalization=" + actualcostHospitalization
				+ ", employeeId=" + employeeId + "]";
	}


	public Integer getBillinginfoId() {
		return billinginfoId;
	}


	public void setBillinginfoId(Integer billinginfoId) {
		this.billinginfoId = billinginfoId;
	}


	public Date getDateofadmission() {
		return dateofadmission;
	}


	public void setDateofadmission(Date dateofadmission) {
		this.dateofadmission = dateofadmission;
	}


	public BillingCollection getTypeofAdmission() {
		return typeofAdmission;
	}


	public void setTypeofAdmission(BillingCollection typeofAdmission) {
		this.typeofAdmission = typeofAdmission;
	}


	public BillingCollection getRoomwardType() {
		return roomwardType;
	}


	public void setRoomwardType(BillingCollection roomwardType) {
		this.roomwardType = roomwardType;
	}


	public BillingCollection getDischargeType() {
		return dischargeType;
	}


	public void setDischargeType(BillingCollection dischargeType) {
		this.dischargeType = dischargeType;
	}


	public Integer getStayindays() {
		return stayindays;
	}


	public void setStayindays(Integer stayindays) {
		this.stayindays = stayindays;
	}


	public Date getDateofSurgery() {
		return dateofSurgery;
	}


	public void setDateofSurgery(Date dateofSurgery) {
		this.dateofSurgery = dateofSurgery;
	}


	public Date getDateofDischarge() {
		return dateofDischarge;
	}


	public void setDateofDischarge(Date dateofDischarge) {
		this.dateofDischarge = dateofDischarge;
	}


	public BigDecimal getExpectedcosthospitalization() {
		return expectedcosthospitalization;
	}


	public void setExpectedcosthospitalization(BigDecimal expectedcosthospitalization) {
		this.expectedcosthospitalization = expectedcosthospitalization;
	}


	public BigDecimal getActualcostHospitalization() {
		return actualcostHospitalization;
	}


	public void setActualcostHospitalization(BigDecimal actualcostHospitalization) {
		this.actualcostHospitalization = actualcostHospitalization;
	}


	public EmployeeModel getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(EmployeeModel employeeId) {
		this.employeeId = employeeId;
	}


	

}
