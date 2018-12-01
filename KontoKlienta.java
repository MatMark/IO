import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KontoKlienta extends Uzytkownik{

	private List<Transakcja> transactions = new ArrayList<>();
	private String number;
	private float accountBalance;
	private Date date;
	private Uzytkownik owner;
	
	
	public KontoKlienta() {
	}
	
	public KontoKlienta(Uzytkownik user) {
		owner = user;
		this.number = "22 1111 1111 0000 0000 0000 000" + user.getUser_ID();
		this.accountBalance = 123.45f;
		this.date = new Date();
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

	public void Transfer(KontoKlienta src, KontoKlienta dst, float amount, String cat, String title)
	{
		transactions.add(new Transakcja(src, dst, amount, cat, title));
	}

	public List<Transakcja> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transakcja> transactions) {
		this.transactions = transactions;
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
	
}
