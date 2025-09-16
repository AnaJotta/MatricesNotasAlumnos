import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    double[][] matriz  = new double[4][4];
    Scanner sc = new Scanner(System.in);
    double suma = 0.0;

    // for para cargar
    for(int f=0; f<4; f++){
        for(int c=0; c<3; c++){
            System.out.println("Introduzca las notas del alumno nº "+ f+1);
            matriz[f][c] = sc.nextDouble();
            suma+=matriz[f][c];

        }
        matriz [f][3] = suma/3;
        suma=0.0;
    }

    //for para recorrer
    for(int f=0; f<4; f++){
        System.out.println("Las notas del alumno nº " + (f+1) + " son: ");
        for(int c=0; c<3; c++){
            System.out.println("Nota nº " + c + " " + matriz[f][c]);
        }
        System.out.println("El promedio de las notas es: " + matriz[f][3]);
    }

    }
}