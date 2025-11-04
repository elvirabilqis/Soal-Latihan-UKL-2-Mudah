import java.util.Scanner;

public class LatihanUKL2Mudah {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     
    System.out.println("Masukkan sebuah bilangan: ");
    int bilangan = input.nextInt();

    if (bilangan % 2 == 0) {
        System.out.println("Bilangan " + bilangan + " adalah GENAP.");
    } else {
        System.out.println("Bilangan " + bilangan + " adalah GANJIL.");
    }

    input.close();
   }
    
    
    
}
