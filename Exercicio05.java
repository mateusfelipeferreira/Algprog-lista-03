import java.util.Scanner;
public class exercicio05 {
public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

System.out.print("Digite o primeiro número: ");
double numero1 = entrada.nextDouble();

System.out.print("Digite o segundo número: ");
double numero2 = entrada.nextDouble();

System.out.print("Digite a operação (+, -, *, / ou ^): ");
String operacao = entrada.next();

if (operacao.equals("+")) {

double resultado = numero1 + numero2;

System.out.println("Resultado: " + resultado);

} else if (operacao.equals("-")) {

double resultado = numero1 - numero2;

System.out.println("Resultado: " + resultado);

} else if (operacao.equals("*")) {

double resultado = numero1 * numero2;

System.out.println("Resultado: " + resultado);

} else if (operacao.equals("/")) {

double resultado = numero1 / numero2;

System.out.println("Resultado: " + resultado);

} else if (operacao.equals("^")) {

double resultado = Math.pow(numero1, numero2);

System.out.println("Resultado: " + resultado);

} else {

System.out.println("Símbolo da operação é inválido.");
}

entrada.close();
    }
}
