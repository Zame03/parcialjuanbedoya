import java.util.Scanner;

public class Metodos {
        public static ObjEstudiante[][] Llenado(int cantidad, Scanner sc) {
            ObjEstudiante[][] Lista = new ObjEstudiante[cantidad][cantidad];
            String temp = "";
            String Nombre = "";
            String Apellido = "";
            int Carnet = 0;
            int Semestre = 0;
            float PromedioActual = 0;

            for (int i = 0; i < Lista.length; i++) {
                for (int j = 0; j < Lista[0].length; j++) {
                    temp = sc.nextLine();

                    System.out.println("Escribe el nombre del estudiante: ");
                    Nombre = sc.nextLine();

                    System.out.println("Escribe el apellido del estudiante: ");
                    Apellido = sc.nextLine();

                    System.out.println("Escribe el carnet del estudiante: ");
                    Carnet = sc.nextInt();

                    System.out.println("Escribe el semestre actual del estudiante: ");
                    Semestre = sc.nextInt();

                    System.out.println("Escribe el promedio hasta la fecha del estudiante: ");
                    PromedioActual = sc.nextFloat();

                    ObjEstudiante item = new ObjEstudiante(Nombre, Apellido, Carnet, Semestre, PromedioActual);
                    Lista[i][j] = item;
                }
            }

        return  Lista;

    }

public static   void MostrarMayor4(ObjEstudiante[][] m) {
        System.out.println("Mostrando estudiantes con calificacion mayor a 4: ");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getPromedioActual() >= 4) {
                    System.out.println(m[i][j].getNombre());
                    System.out.println(m[i][j].getApellido());
                    System.out.println(m[i][j].getCarnet());
                    System.out.println(m[i][j].getSemestre());
                    System.out.println(m[i][j].getPromedioActual());
            }
       }}
    }

    public static  void MostrarMayor3Menor4(ObjEstudiante[][] m) {
        System.out.println("Mostrando estudiantes con calificacion entre 3 y 4: ");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getPromedioActual() >= 3 && m[i][j].getPromedioActual() < 4 ) {
                    System.out.println(m[i][j].getNombre());
                    System.out.println(m[i][j].getApellido());
                    System.out.println(m[i][j].getCarnet());
                    System.out.println(m[i][j].getSemestre());
                    System.out.println(m[i][j].getPromedioActual());
            }
       
        }
    }
    }

        public static  void MostrarMenor3(ObjEstudiante[][] m) {
        System.out.println("Mostrando estudiantes con calificacion enor a 3: ");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getPromedioActual() < 3) {
                    System.out.println(m[i][j].getNombre());
                    System.out.println(m[i][j].getApellido());
                    System.out.println(m[i][j].getCarnet());
                    System.out.println(m[i][j].getSemestre());
                    System.out.println(m[i][j].getPromedioActual());
            }
       
        }
    }
    }
    

    
}
