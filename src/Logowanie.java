import java.util.Scanner;

public class Logowanie extends Users{

    private String login;
    private String password;
    private boolean inOut;


    public void logowanie() {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Witaj w banku ConsoleBank.");
        System.out.println();
        System.out.println("Logowanie do konta.");


        for (int i = 0; i < 3; i++) {

            System.out.print("Proszę podać imię: ");
            login = scanner.next();
            System.out.print("Proszę podać nazwisko: ");
            password = scanner.next();
            Users user = new Users(login, password);


            if (login.equals(getName()) && password.equals(getSurename())) {
                System.out.println("OK");
                this.inOut = true;
                break;
            } else {
                System.out.println("NOK");
                this.inOut = false;
            }
        }

    }
    public void getInOut()
    {
        if (inOut)
        {
            System.out.println("You are logged In.");
            Functions funkcje = new Functions();
            funkcje.show();
            funkcje.choise();
        } else {
            System.out.println("you are logged off.");
        }
    }
}
