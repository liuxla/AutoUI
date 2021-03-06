package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * Tbinstpaydatelist generated by hbm2java
 */
public class Tbinstpaydatelist implements java.io.Serializable {

	private TbinstpaydatelistId id;
	private BigDecimal payDate;
	private BigDecimal startDate;
	private BigDecimal endDate;
	private String reserve;
	private String reserve2;
	private String reserve3;
	private BigDecimal lastDate;
	private BigDecimal lastTime;

	public Tbinstpaydatelist() {
	}

	public Tbinstpaydatelist(TbinstpaydatelistId id, BigDecimal payDate,
			BigDecimal startDate, BigDecimal endDate, String reserve,
			String reserve2, String reserve3, BigDecimal lastDate,
			BigDecimal lastTime) {
		this.id = id;
		this.payDate = payDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.reserve = reserve;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.lastDate = lastDate;
		this.lastTime = lastTime;
	}

	public TbinstpaydatelistId getId() {
		return this.id;
	}

	public void setId(TbinstpaydatelistId id) {
		this.id = id;
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
