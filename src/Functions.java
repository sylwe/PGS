import java.util.Scanner;

public class Functions {

    private String options;
    protected int saldo = 0;

    //private int x;

    public void show(){
        System.out.println();
        System.out.println("Masz dostęp do funkcji:");
        System.out.println();
        System.out.println("saldo");
        System.out.println("wpłata");
        System.out.println("wypłąta");
        System.out.println("wyloguj");
    }
    public void choise(){
        int i =1;
        Scanner scanner = new Scanner(System.in);
        Account konto = new Account();

        while (i>0){
            System.out.print("Wpisz operację: ");
            this.options = scanner.next();

            switch (options) {
                case "saldo": {
                    System.out.println(konto.getSaldo());
                    continue;
                }
                case "wpłata": {
                    System.out.print("Podaj wpłacaną kwotę: ");
                    int x = scanner.nextInt();
                    konto.increaseSaldo(x);
                    continue;
                }
                case "wypłata": {
                    System.out.print("Podaj wypłacaną kwotę: ");
                    int x = scanner.nextInt();
                    konto.decreaseSaldo(x);
                    continue;
                }
                case "wyloguj": {
                    System.out.println("You are logged off.");
                    i=0;
                    break;
                }
            }
        }

    }
    public int getSaldo()
    {
        return this.saldo;
    }

}
