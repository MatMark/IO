package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KontoKlienta extends Uzytkownik{

	List<Transakcja> hist =  new ArrayList<>();
	
	private String number;
	private float accountBalance;
	private Date date;
	private Uzytkownik owner;
	private float zdolnosc;
	
	
	public KontoKlienta() throws IOException{
	}
	
	public KontoKlienta(Uzytkownik user) throws IOException{
		owner = user;
		this.number = "22 1111 1111 0000 0000 0000 000" + user.getUser_ID();
		this.accountBalance = 123.45f;
		this.zdolnosc = -1;
		this.date = new Date();
	}
	
	public void LiczZdolnosc()
	{
		setZdolnosc(getAccountBalance() * 12);
	}
	
	public boolean Loan(float amount)
	{
		if(getZdolnosc() == -1) return false;
		else {
			setAccountBalance(getAccountBalance()+amount);
			return true;
		}
	}
	
	public Uzytkownik getOwner() {
		return owner;
	}

	public void setOwner(Uzytkownik owner) {
		this.owner = owner;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean Transfer(KontoKlienta src, KontoKlienta dst, float amount, String title)
	{
		if (amount > getAccountBalance()) return false;
		else
		{
			hist.add(new Transakcja(src, dst, amount, title));
			src.setAccountBalance(src.getAccountBalance()-amount);
			dst.setAccountBalance(dst.getAccountBalance()+amount);
			return true;
		}
	}


	public List<Transakcja> getHist() {
		return hist;
	}

	public void setHist(List<Transakcja> hist) {
		this.hist = hist;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public Date getDate()
	{
		return date;
	}

	public float getZdolnosc() {
		return zdolnosc;
	}

	public void setZdolnosc(float zdolnosc) {
		this.zdolnosc = zdolnosc;
	}
	
}
