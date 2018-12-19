package com.company;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Apk {
    public static Baza baza;
    private KontoKlienta activeUser = null;


    public Apk() throws IOException {
        baza = new Baza();
        Scanner in = new Scanner(System.in);
        boolean run = true;
        int chooser;
        while (run)
        {
            if(activeUser==null)
            {
                String login, password, password2, name, surname;
                System.out.println("Wybierz:\n1. Logowanie\n2. Nowy uzytkownik\n3. Wyjscie\n");
                switch (chooser = in.nextInt()) {
                    case 1:
                        System.out.println("Podaj login:");
                        login = in.next();
                        System.out.println("Podaj haslo:");
                        password = in.next();
                        Log_in(login, password);
                        break;

                    case 2:
                        System.out.println("Podaj login:");
                        login = in.next();
                        System.out.println("Podaj haslo:");
                        password = in.next();
                        System.out.println("Powtorz haslo:");
                        password2 = in.next();
                        if(!password.equals(password2))
                        {
                            System.out.println("Podane hasla nie sa zgodne");
                            break;
                        }
                        System.out.println("Podaj imie:");
                        name = in.next();
                        System.out.println("Podaj nazwisko:");
                        surname = in.next();
                        Uzytkownik usr = new Uzytkownik(name, surname, login, password, false);
                        if(!baza.HaveAccount(usr)) baza.NewAccount(usr);
                        else System.out.println("Konto o podanych danych juz istnieje");
                        break;

                    case 3:
                        run = false;
                        System.exit(0);
                        break;

                    default:
                        break;
                }
            }
            else
            {
                System.out.println("Zalogowano " + activeUser.getOwner().getName() + " " + activeUser.getOwner().getSurname() + " Stan konta: " + activeUser.getAccountBalance() + "\nNumer konta: " + activeUser.getNumber());
                float amount;
                String num, title;
                System.out.println("Wybierz:\n1. Wyloguj sie\n2. Przelew\n3. Wyswietl historie przelewow\n4. Wyjscie\n");
                switch (chooser = in.nextInt()) {
                    case 1:
                        Log_out();
                        break;

                    case 2:
                        System.out.println("Podaj numer konta docelowego (ostatnia cyfra):\n");
                        num = "22 1111 1111 0000 0000 0000 000" + in.next();
                        KontoKlienta dstAcc = baza.CheckUserByNumber(num);
                        if(dstAcc == null){
                            System.out.println("Konto docelowe nie istnieje");
                            break;
                        }
                        System.out.println("Podaj tytul przelewu:\n");
                        title = in.next();
                        System.out.println("Podaj kwote przelewu:\n");
                        amount = in.nextFloat();
                        if(!activeUser.Transfer(activeUser, dstAcc, amount, title)) System.out.println("Nie wystarczajaca ilosc srodkow na koncie");

                        break;

                    case 3:
                        for (Transakcja trans: activeUser.hist) System.out.println("Data: " + trans.getDate() + " Konto docelowe: " + trans.getDestination().getNumber() + " Tytul przelewu: " + trans.getName() + " Kwota przelewu: " + trans.getAmount() + "\n\n");
                        break;

                    case 4:
                        run = false;
                        System.exit(0);
                        break;

                    default:
                        break;
                }
            }

        }
    }

    public void Log_in(String login, String password) {
        activeUser = baza.CheckLogin(login, password);
        if(activeUser==null) System.out.println("Nieudane logowanie");
    }

    public void Log_out() {
        activeUser = null;
        System.out.println("Wylogowano");
    }

}
