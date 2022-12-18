import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vücut Kitle İndeksi Hesaplama");
        Scanner imput=new Scanner(System.in);
        double kg,boy,index;
        System.out.print("Lütfen boyunuzu Giriniz  :");
        boy=imput.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz  :");
        kg=imput.nextDouble();
        index=kg/(boy*boy);
        System.out.println("Vücut kitle endeksiniz : "+index);
    }
}