import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //değişkenleri oluşturalım
        int a,b,c,u;
        double alan;

        //sınıfı tanımladık
        Scanner girdi=new Scanner(System.in);

        //Kullanıcılardan veri alma

        System.out.print("1. kenarı giriniz: ");
        a=girdi.nextInt();

        System.out.print("2.kenarı giriniz: ");
        b=girdi.nextInt();

        System.out.print("3.kenarı giriniz: ");
        c=girdi.nextInt();

        u=(a+b+c)/2;
        alan=Math.sqrt(u * (u-a)* (u-b) * (u-c));
        System.out.print("ALAN: "+alan);

    }
}