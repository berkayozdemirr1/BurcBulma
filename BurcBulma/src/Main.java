import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gun, ay;

        Scanner deger = new Scanner(System.in);

        System.out.print("Dogdugunuz Ay : ");
        ay = deger.nextInt();

        System.out.print("Dogdugunuz Gun : ");
        gun = deger.nextInt();

        if (ay == 1) {
            if ((gun > 0) && (gun < 21)) {
                System.out.println("Burcunuz Oglak");
            } else if ((gun >= 21) && (gun <= 31)) {
                System.out.println("Burcunuz Kova");
            } else System.out.println("Sen AT burcusun");
        }
        if (ay == 2) {
            if ((gun > 0) && (gun < 19)) {
                System.out.println("Burcunuz Kova");
            } else if ((gun >= 19) && (gun <= 28)) {
                System.out.println("Burcunuz Balik");
            } else System.out.println("Sen AT burcusun");
        }
        if (ay == 3) {
            if ((gun > 0) && (gun <= 20)) {
                System.out.println("Burcunuz Balik");
            } else if ((gun > 20) && (gun <= 31)) {
                System.out.println("Burcunuz Koç");
            } else System.out.println("Sen AT burcusun");
        }
        if (ay == 4) {
            if ((gun > 0) && (gun < 20)) {
                System.out.println("Burcunuz Koc");
            } else if ((gun >= 20) && (gun <= 30)) {
                System.out.println("Burcunuz Boga");
            } else System.out.println("Sen AT burcusun");
        }
        if (ay == 5) {
            if ((gun > 0) && (gun <= 21)) {
                System.out.println("Burcunuz Boga");
            } else if ((gun > 21) && (gun <= 31)) {
                System.out.println("Burcunuz Ikizler ");
            } else System.out.println("Sen AT burcusun");
        }
        if (ay == 6) {
            if ((gun > 0) && (gun < 22)) {
                System.out.println("Burcunuz Ikizler");
            } else if ((gun >= 22) && (gun <= 30)) {
                System.out.println("Burcunuz Yengec");
            } else System.out.println("Sen AT burcusun");
        }
        if (ay == 7) {
            if ((gun > 0) && (gun <= 22)) {
                System.out.println("Burcunuz Yengec");
            } else if ((gun > 22) && (gun <= 31)) {
                System.out.println("Burcunuz Aslan");
            } else System.out.println("Sen AT burcusun");
        }
        if (ay == 8) {
            if ((gun > 0) && (gun <= 22)) {
                System.out.println("Burcunuz Aslan");
            } else if ((gun > 22) && (gun <= 31)) {
                System.out.println("Burcunuz Basak");
            } else System.out.println("Sen AT burcusun");
        }
        if (ay == 9) {
            if ((gun > 0) && (gun <= 22)) {
                System.out.println("Burcunuz Basak");
            } else if ((gun > 22) && (gun <= 30)) {
                System.out.println("Burcunuz Terazi");
            } else System.out.println("Sen AT burcusun");
        }
        if (ay == 10) {
            if ((gun > 0) && (gun <= 22)) {
                System.out.println("Burcunuz Terazi");
            } else if ((gun > 22) && (gun <= 31)) {
                System.out.println("Burcunuz Akrep");
            } else System.out.println("Sen AT burcusun");
        }
        if (ay == 11) {
            if ((gun > 0) && (gun < 22)) {
                System.out.println("Burcunuz Akrep");
            } else if ((gun >= 22) && (gun <= 30)) {
                System.out.println("Burcunuz Yay");
            } else System.out.println("Sen AT burcusun");
        }
        if (ay == 12) {
            if ((gun > 0) && (gun < 22)) {
                System.out.println("Burcunuz Yay");
            } else if ((gun >= 22) && (gun <= 31)) {
                System.out.println("Burcunuz Oglak");
            } else System.out.println("Sen AT burcusun");
        }
        else System.out.println("Lutfen Dogdugunuz Ayi 1/12 Araliginda Giriniz");
    }
}