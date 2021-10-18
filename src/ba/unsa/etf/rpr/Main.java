package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {
    public static int sumaCifara(int k){
     int suma=0, pomocni;
     while(k!=0){
         pomocni=k%10;
         suma=suma+pomocni;
         k=k/10;
     }
     return suma;
    }
    public static void main(String[] args) {
	    System.out.println("Unesite broj n:\n");
        Scanner ulaz = new Scanner(System.in);
        int dokle = ulaz.nextInt();
        System.out.println("Brojevi koji su djeljivi sa sumom svojih cifara su: \n");
        for (int i=1; i<=dokle; i++) {
            if(i%sumaCifara(i)==0)
                System.out.println(i + "\n");
        }
    }
}
