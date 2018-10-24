/*
* ------------- Zadanie Pierwsze ---------------
* Zaimplementować konsolowy symulator konta bankowego z następującymi funkcjami: logowanie do konta, wylogowanie, wpłata, wypłata, sprawdzanie salda.
* Rozwiązanie może być zaimplementowane jako aplikacja konsolowa, desktopowa lub webowa.
* Dla początkujących zalecane jest napisanie tego jako aplikacja konsolowa.
* Zadanie to ma na celu zapoznanie się przez was z Javą oraz napisanie prostego programu, więc używanie baz danych lub systemów do autentykacji nie jest wymagane (będzie to tematem innych zajęć J)
*
 */


import java.util.Scanner;

public class Zadanie1 {
    public static void main (String args[]){
        System.out.println();
        System.out.println("Witaj w banku ConsoleBank");
        Scanner scanner = new Scanner(System.in);
        String name = "Jacek";
        String surename = "Placek";
        //String nameBase[] = {"Jacek"};



        for (int i =0; i<3; i++) {
            int x=0;
            System.out.print("Aby zalogować się do systemu prosimy podać imię : ");
            String nameX = scanner.next();
            System.out.print(" Prosimy podać nazwisko : ");
            String surenameX = scanner.next();

            switch (nameX) {
                case "Jacek":
                    switch (surenameX) {
                        case "Placek":
                            x=0;
                            break;
                        default:
                            x = 1;
                            break;
                    }
                    break;
                default:
                    x=1;
                    break;
            }
            if (x==0){
                System.out.println();
                System.out.println("Witamy w systemie " + nameX + " " + surenameX + ".");
                System.out.println();
                break;
            }
            if (i==2){
                System.out.println("Proszę skontaktować się z BOK.");
                continue;
            }

            if (x==1){
                System.out.println();
                System.out.println("Podaleś niepoprawne dane, spróbuj ponownie.");
                System.out.println();
            }

        }

     }

}
