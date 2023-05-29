package clase_3.tarea;

public class AutoConcesionario {
    private String marca;
    private String modelo;
    private int ano;
    private double precio;

    public AutoConcesionario(String marca, String modelo, int ano, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precio = precio;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
