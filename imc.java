import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kilogramos = new Scanner(System.in);




        System.out.println("Ingrese su peso");
        double peso = kilogramos.nextDouble();
        System.out.println("Ingrese su altura en centimetros");
        double altura = kilogramos.nextDouble();
        double imc = peso / (altura*altura);

        if(imc <= 18.5){
            System.out.println("El indice de masa corporal es bajo");
        }if (imc > 18.5 && imc <= 24.9){
            System.out.println("El indice de masa corporal está estable, es normal");
        }if (imc >=25 && imc <= 29.9){
            System.out.println("El indice de masa coporte es elevado, está con sobrepeso");
        }if (imc >= 30){
            System.out.println("Usted tiene un indice de masa demasiado elevado, tiene sobrepeso");
        }
    }

     }
