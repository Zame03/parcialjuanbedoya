import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cantidad;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Hola, de que dimension deseas la matriz?");
        cantidad = sc.nextInt();

        ObjEstudiante[][] Estudiantes = new ObjEstudiante[cantidad][cantidad];

        Estudiantes = Metodos.Llenado(cantidad, sc);
        
        System.out.println("Organizando Matrices...");

        System.out.println("\n-----------------------------------------------------");
        Metodos.MostrarMayor4(Estudiantes);


        System.out.println("\n-----------------------------------------------------");
        Metodos.MostrarMayor3Menor4(Estudiantes);

        System.out.println("\n-----------------------------------------------------");
        Metodos.MostrarMenor3(Estudiantes);

        sc.close();
    }
}