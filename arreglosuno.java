import java.util.Scanner;

public class arreglosuno {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.println("Ingrese 5 datos numericos");

        int num1 = numeros.nextInt();
        int num2 = numeros.nextInt();
        int num3 = numeros.nextInt();
        int num4 = numeros.nextInt();
        int num5 = numeros.nextInt();

        System.out.println(" "+num1+
        " "+num2+
        " "+num3+
        " "+num4+
        " "+num5);


        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
            System.out.println("La mejor nota es:  " +num1);

            if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
                System.out.println("La mejor nota es:  " +num2);

                if (num3 > num2 && num3 > num1 && num3 > num4 && num3 > num5)
                    System.out.println("La mejor nota es:" +num3);

                    if (num4 > num2 && num4 > num3 && num4 > num1 && num1 > num5)
                        System.out.println("La mejor nota es: " +num4);

                        if (num5 > num2 && num5 > num3 && num5 > num4 && num5 > num1)
                            System.out.println("La mejor nota es:" +num5+ " Y tu promedio es: "
                            +(num1+num2+num3+num4+num5) / 5);


        }

}
