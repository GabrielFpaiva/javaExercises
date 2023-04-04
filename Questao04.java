import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero : ");
        double number = input.nextInt();

        if(number %2==0){//par
            System.out.printf("A raiz cúbica de %.2f é %.2f",number,Math.cbrt(number));
        }else{
            System.out.printf("A raiz quadrada de %.2f eh %.2f",number,Math.sqrt(number));
        }

    }
}