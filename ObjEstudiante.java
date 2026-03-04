public class ObjEstudiante {
    private String Nombre;
    private String Apellido;
    private int Carnet;
    private int Semestre;
    private float PromedioActual;


    
    public ObjEstudiante(String nombre, String apellido, int carnet, int semestre, float promedioActual) {
        Nombre = nombre;
        Apellido = apellido;
        Carnet = carnet;
        Semestre = semestre;
        PromedioActual = promedioActual;
    }


    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public int getCarnet() {
        return Carnet;
    }
    public void setCarnet(int Carnet) {
        this.Carnet = Carnet;
    }
    public int getSemestre() {
        return Semestre;
    }
    public void setSemestre(int semestre) {
        Semestre = semestre;
    }
    public float getPromedioActual() {
        return PromedioActual;
    }
    public void setPromedioActual(float promedioActual) {
        PromedioActual = promedioActual;
    }
}
