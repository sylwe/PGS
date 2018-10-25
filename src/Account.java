public class Account {
    protected int saldo = 0;


    public int getSaldo()
    {
        return this.saldo;
    }
    public void increaseSaldo(int x)
    {
        if (x>0) {
            this.saldo += x;
            System.out.println("Wpłacono: " + x);
        } else {
            System.out.println("Niepoprawna kwota");
        }
    }
    public void decreaseSaldo(int x) {
        int y = this.saldo - x;
        if (x <= 0) {
            System.out.println("Nie mozesz wykonać tej operacji, niepoprawna kwota");
        } else {
            if (y <= 0) {
                System.out.println("Nie mozesz wykonać tej operacji, niepoprawna kwota");
            } else {
            System.out.println("Wypłacono: " + x);
            this.saldo -= x;
            }
        }

    }

}
