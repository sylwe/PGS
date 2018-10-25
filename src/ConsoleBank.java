
/* --------Zadanie 1 Sylwester Włodyga--------------
* Zaimplementować konsolowy symulator konta bankowego z następującymi funkcjami: logowanie do konta, wylogowanie, wpłata, wypłata, sprawdzanie salda.
* Rozwiązanie może być zaimplementowane jako aplikacja konsolowa, desktopowa lub webowa. Dla początkujących zalecane jest napisanie tego jako aplikacja konsolowa.
 */

public class ConsoleBank {
    public static void main(String args[])
    {
        Logowanie user = new Logowanie();
        user.logowanie();
        user.getInOut();

    }
}
