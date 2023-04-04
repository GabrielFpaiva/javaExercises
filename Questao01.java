import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\tCalculadora Basica - Java Edition\n [1] Para somar \n [2] Para subtrair" +
                "\n [3] Para multiplicar \n [4] Para dividir \n [5] Potência \n [6] Raiz Quadrada \n " +
                "[7] Raiz cubica \n\n\n Digite a operação que vc deseja realizar : ");
        int operacao = input.nextInt();

        if (operacao== 5 || operacao == 6 || operacao == 7) {
            if (operacao == 5){
                System.out.println("Digite o numero a ser elevado (base):");
                double x=input.nextDouble();
                System.out.println("Digite o expoente:");
                double y=input.nextDouble();
                System.out.printf("A potenciação dos numeros digitados é %2f",Math.pow(x,y));
            }
            else if (operacao==6 ) {
                System.out.println("Digite o numero :");
                double x = input.nextDouble();
                System.out.printf("A raiz quadrada deste numero é: %2f",Math.sqrt(x));
            } else {
                System.out.println("Digite o numero :");
                double x = input.nextDouble();
                System.out.printf("A raiz quadrada deste numero é: %2f",Math.cbrt(x));
            }

        } else if (operacao<=4){
            System.out.println("Digite um numero:");

            int x = input.nextInt();
            System.out.println("Digite o outro numero:");
            int y = input.nextInt();

            switch (operacao) {
                case 1: {
                    System.out.printf("A soma dos numeros digitados é %d", x+y);
                    break;
                }
                case 2: {
                    System.out.printf("A subtração dos numeros digitados é %d", x-y);
                    break;
                }
                case 3: {
                    System.out.printf("A multiplicação dos numeros digitados é %d", x * y);
                    break;
                }
                case 4: {
                    System.out.printf("A divisão dos numeros digitados é %d", x/y);
                    break;
                }
            }
        } else{
            System.out.println("Codigo de operação inexistente !");
        }
    }
}