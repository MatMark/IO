import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Baza {
	List<KontoKlienta> konta = new ArrayList<>();
	
	public Baza()
	{
		konta.add(new KontoKlienta(new Uzytkownik("Tomasz", "Kapelan", "test0", "test0", false)));
		konta.add(new KontoKlienta(new Uzytkownik("Andrzej", "Marynarzyk", "test1", "test1", false)));
		konta.add(new KontoKlienta(new Uzytkownik("Jerzy", "Marchewko", "test2", "test2", false)));
		konta.add(new KontoKlienta(new Uzytkownik("Jerzy", "Piesowski", "test3", "test3", false)));
		konta.add(new KontoKlienta(new Uzytkownik("Pawe�", "S�yszowski", "test4", "test4", false)));
	}
	
	public boolean HaveAccount(Uzytkownik user)
	{
		for (KontoKlienta konto : konta) {
			if (konto.getOwner().getLogin().equals(user.getLogin())) return true;
			else if ((konto.getOwner().getName().equals(user.getName())) && (konto.getOwner().getSurname().equals(user.getSurname()))) return true;
		}
		return false;
	}
	
	public KontoKlienta CheckLogin(String login, String pass)
	{
		for (KontoKlienta konto : konta) {
	        if (konto.getOwner().getLogin().equals(login)) {
	        	if(konto.getOwner().getPassword().equals(pass))
	            return konto;
	        }
	    }
	    return null;
	}
	
	public KontoKlienta CheckUserByNumber(String num)
	{
		for (KontoKlienta konto : konta) {
	        if (konto.getNumber().equals(num)) {
	            return konto;
	        }
	    }
		return null;
	}
}
