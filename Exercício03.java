import java.util.Scanner;
public class Exercicio03 {
public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

System.out.print("Digite o valor de a: ");
double a = entrada.nextDouble();

System.out.print("Digite o valor de b: ");
double b = entrada.nextDouble();

System.out.print("Digite o valor de c: ");
double c = entrada.nextDouble();

if (a == 0 && b == 0 && c != 0) {

System.out.println("Coeficientes informados incorretamente.");

} else if (a == 0 && b != 0) {

double x = -c / b;

System.out.println("Essa é uma equação de primeiro grau");
System.out.println("Raiz real: " + x);

} else if (a != 0) {

double delta = (b * b) - (4 * a * c);

System.out.println("Delta: " + delta);

if (delta < 0) {

System.out.println("Esta equação não possui raízes reais.");

} else if (delta == 0) {

double x = -b / (2 * a);

System.out.println("Esta equação possui duas raízes reais iguais.");
System.out.println("Raiz: " + x);

} else {

double x1 = (-b + Math.sqrt(delta)) / (2 * a);
double x2 = (-b - Math.sqrt(delta)) / (2 * a);

System.out.println("Esta equação possui duas raízes reais diferentes.");
System.out.println("Raiz x1: " + x1);
System.out.println("Raiz x2: " + x2);
  }
  }

entrada.close();
    }
}
