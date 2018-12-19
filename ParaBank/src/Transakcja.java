package com.company;

import java.util.Date;

public class Transakcja {
	private Date date;
	private float amount;
	private String name;
	private KontoKlienta source;
	private KontoKlienta destination;

	public Transakcja(KontoKlienta src, KontoKlienta dst, float amount)
	{
		this.source = src;
		this.destination = dst;
		this.amount = amount;
		this.date = new Date();
		this.name = "-";
	}
	
	public Transakcja(KontoKlienta src, KontoKlienta dst, float amount, String name)
	{
		this.source = src;
		this.destination = dst;
		this.amount = amount;
		this.date = new Date();
		this.name = name;
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public KontoKlienta getSource() {
		return source;
	}

	public void setSource(KontoKlienta source) {
		this.source = source;
	}

	public KontoKlienta getDestination() {
		return destination;
	}

	public void setDestination(KontoKlienta destination) {
		this.destination = destination;
	}
	
}
