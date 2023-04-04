import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual escala de temperatura voce quer usar?\n [C] Para usar celsius \n " +
                "[F] Para usar Farenheit \n [K] Para usar Kelvin");

        char escala = input.next().charAt(0);

        System.out.println("Digite a temperatura na escala escolhida :");

        float temperatura = input.nextFloat();

        switch (Character.toUpperCase(escala)){
            case 'C':{
                double farenheit = (temperatura*1.8)+32;
                double kelvin = temperatura+273.15;

                System.out.printf("Temperatura em celsius [%f]\nTemperatura em farenheit [%f]\n" +
                        "Temperatura em Kelvin [%f]",temperatura,farenheit,kelvin);

                break;
            }
            case 'F':{
                double celsius = (temperatura-32)*(5/9);
                double kelvin = (((5/9)*celsius)+273.15);

                System.out.printf("Temperatura em celsius [%.2f]\nTemperatura em farenheit [%.2f]\n" +
                        "Temperatura em Kelvin [%.2f]",celsius,temperatura,kelvin);
                break;
            }
            case 'K':{
                double celsius = temperatura-273.15;
                double farenheit = (celsius * 1.8) + 32 ;

                System.out.printf("Temperatura em celsius [%.2f]\nTemperatura em farenheit [%.2f]\n" +
                        "Temperatura em Kelvin [%.2f]",celsius,farenheit,temperatura);
                break;
            }
        }
    }
}