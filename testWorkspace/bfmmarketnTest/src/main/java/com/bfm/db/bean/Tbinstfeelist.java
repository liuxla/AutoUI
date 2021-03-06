package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * Tbinstfeelist generated by hbm2java
 */
public class Tbinstfeelist implements java.io.Serializable {

	private TbinstfeelistId id;
	private String paydateOrArea;
	private BigDecimal payDate;
	private BigDecimal startDate;
	private BigDecimal endDate;
	private BigDecimal feeAmt;
	private String reserve;
	private String reserve2;
	private String reserve3;
	private BigDecimal lastDate;
	private BigDecimal lastTime;

	public Tbinstfeelist() {
	}

	public Tbinstfeelist(TbinstfeelistId id, String paydateOrArea,
			BigDecimal payDate, BigDecimal startDate, BigDecimal endDate,
			BigDecimal feeAmt, String reserve, String reserve2,
			String reserve3, BigDecimal lastDate, BigDecimal lastTime) {
		this.id = id;
		this.paydateOrArea = paydateOrArea;
		this.payDate = payDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.feeAmt = feeAmt;
		this.reserve = reserve;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.lastDate = lastDate;
		this.lastTime = lastTime;
	}

	public TbinstfeelistId getId() {
		return this.id;
	}

	public void setId(TbinstfeelistId id) {
		this.id = id;
	}

	public String getPaydateOrArea() {
		return this.paydateOrArea;
	}

	public void setPaydateOrArea(String paydateOrArea) {
		this.paydateOrArea = paydateOrArea;
	}

	public BigDecimal getPayDate() {
		return this.payDate;
	}

	public void setPayDate(BigDecimal payDate) {
		this.payDate = payDate;
	}

	public BigDecimal getStartDate() {
		return this.startDate;
	}

	public void setStartDate(BigDecimal startDate) {
		this.startDate = startDate;
	}

	public BigDecimal getEndDate() {
		return this.endDate;
	}

	public void setEndDate(BigDecimal endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getFeeAmt() {
		return this.feeAmt;
	}

	public void setFeeAmt(BigDecimal feeAmt) {
		this.feeAmt = feeAmt;
	}

	public String getReserve() {
		return this.reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getReserve2() {
		return this.reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	public String getReserve3() {
		return this.reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

	public BigDecimal getLastDate() {
		return this.lastDate;
	}

	public void setLastDate(BigDecimal lastDate) {
		this.lastDate = lastDate;
	}

	public BigDecimal getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(BigDecimal lastTime) {
		this.lastTime = lastTime;
	}

}
