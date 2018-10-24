import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int tab[] = new int[7];
        tab[0] = 6;
        tab[1] = 4;
        tab[2] = 62;
        tab[3] = 61;
        tab[4] = 4;

        for(int i : tab)
        {
            System.out.println("tablica element " + i );
        }

        int tablica[][] = {{1,2,3}, {3,2,1}};

        for(int x = 0; x<tablica.length; x++)
        {
            for (int y =0; y<tablica[x].length; y++)
            {
                System.out.println(tablica[x][y]);
            }
        }

        int a =7;
        switch (a)
        {
            case 1:
                System.out.println("a=1");
                break;
            case 2:
                System.out.println("a=2");
                break;
            case 3:
                System.out.println("a=3");
                break;
            case 4:
                System.out.println("a=4");
                break;
             default:
                 System.out.println("nie pasuje");
        }

        int c=10;
        int d;
        d = c<10 ? -1 : 1;
        System.out.println(d);

        for (int i = 0; i<10; i++)
        {
            System.out.print(i + " ");
            if (i==5) {
                break;
            }
        }

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("Wprowadź imię : ");
       // name = scanner.next();
        System.out.println(" wprowadziles napis : " );
    }
}

