import java.util.Scanner;
public class Média {
public static void main (String [] args) {
   
    Scanner sc = new Scanner(System.in);
  
    System.out.println("Digite o primeiro número:");
  
    Double n1 = sc.nextDouble();
    System.out.println("Digite o segundo número:");
 
    Double n2 = sc.nextDouble();
    System.out.println("Digite o terceiro número:");
 
    Double n3 = sc.nextDouble();
    Double media = (n1 + n2 + n3) / 3;
 
    System.out.println("A média dos números digitados é: " + media);
}
    
}