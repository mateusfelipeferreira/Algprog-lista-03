   
    public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();
        
        int menor;
        int maior;
        
        if (numero1 < numero2) {
        
        menor = numero1;
        maior = numero2;
        
        } else {
        
        menor = numero2;
        maior = numero1;
          }
        
        int numeroSorteado = aleatorio.nextInt(maior - menor + 1) + menor;
        
        System.out.println("Número sorteado: " + numeroSorteado);
        
        if (numeroSorteado % 2 == 0) {
        
        System.out.println("O número é par.");
        
        } else {
        
        System.out.println("O número é ímpar.");
         }
        
        entrada.close();
        }
        }
        