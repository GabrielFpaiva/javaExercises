import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu nome : ");
        String nome_completo = input.nextLine();
        String [] separador = nome_completo.split(" ");
        String nome = separador[0];
        String sobrenome = separador[1];
      
        if(sobrenome.equals("wayne") && nome.equals("bruce") || sobrenome.equals("Wayne") && nome.equals("Bruce") || sobrenome.equals("wayne") && nome.equals("Bruce")){
            System.out.printf("Seja bem-vindo Sr. %s",sobrenome);
        }
        else if (sobrenome.equals("kent") && nome.equals("clark") || sobrenome.equals("Kent") && nome.equals("Clark")) {
            System.out.println("Sai fora, kryptoniano !");
        }
        else if(nome.equals("Diana") || nome.equals("diana")) {
            System.out.println("Bem vinda, Princesa de Themyscara");
        }
        else{
            if(nome.equals("Tony") && sobrenome.equals("Stark")){
                System.out.println("Volta pro MCU cara!");
            }
            else {
                System.out.println("Sujeito não identificado , ativar armadilhas !");
            }
        }
    }
}