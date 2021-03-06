package com.company;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Uzytkownik{

	private String login;
	private String password;
	private int User_ID;
	private String Name;
	private String Surname;

	private static final AtomicInteger count = new AtomicInteger(0); 
	
	public Uzytkownik() throws IOException
	{
		
	}
	
	public Uzytkownik(String name, String surname, String login, String password, Boolean pracownik) throws IOException
	{
		this.Name = name;
		this.Surname = surname;
		this.login = login;
		this.password = password;
		this.User_ID = count.incrementAndGet();
		if(!pracownik) new KontoKlienta();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}
	
}
