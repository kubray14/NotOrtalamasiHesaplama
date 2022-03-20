import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        double ortalama;

        Scanner calc = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = calc.nextInt();
        System.out.println("");
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = calc.nextInt();
        System.out.println("");
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = calc.nextInt();
        System.out.println("");
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = calc.nextInt();
        System.out.println("");
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = calc.nextInt();
        System.out.println("");
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = calc.nextInt();
        System.out.println("");

        ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalamaniz = " + ortalama);
        System.out.print((ortalama) >= 60 ? "Sınıfı geçti :) " : "Sınıfta kaldı :( ");
    }

}