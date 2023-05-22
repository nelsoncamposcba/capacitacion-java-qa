package clase_3.tarea;

public class Concesionario {
    private String nombre = "Pip-Pip";
    private AutoConcesionaria[] autos;

    public Concesionario(){
        this.autos = new AutoConcesionaria[5];
    }

    public AutoConcesionaria[] getAutos() {
        return autos;
    }

    public void setAutos(AutoConcesionaria[] autos) {
        this.autos = autos;
    }
}
