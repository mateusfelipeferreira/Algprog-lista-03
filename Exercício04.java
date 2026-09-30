import java.util.Scanner;
public class Exercicio04 {
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    double pi = 3.141592;

    System.out.print("Digite o código da operação: ");
    int operacao = entrada.nextInt();

    System.out.print("Digite o raio: ");
    double raio = entrada.nextDouble();

    if (operacao == 1) {

    double perimetro = 2 * pi * raio;

    System.out.println("Perímetro do círculo: " + perimetro);

    } else if (operacao == 2) {

    double area = pi * raio * raio;

    System.out.println("Área do círculo: " + area);

    } else if (operacao == 3) {

    double volume = (4.0 / 3.0) * pi * raio * raio * raio;

    System.out.println("Volume da esfera: " + volume);

    } else {

    System.out.println("Código da operação é inválido.");
     }

    entrada.close();
    }
}
