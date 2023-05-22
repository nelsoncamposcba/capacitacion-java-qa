package clase_3;

public class Auto {
    //Atributos
    private String marca;
    private String modelo;
    private int anio;
    private double precio;
    private boolean estaEncendido;
    public double litrosCombustibleDisponible;


    //Constructores
    public Auto(){
        marca = "Autito";
        modelo = "Sedan";
        anio = 1970;
        precio = -1;
        estaEncendido = false;
    }

    public Auto(String marcaAuto, String modelo, int anio, double precio){
        marca = marcaAuto;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.estaEncendido = false;
        this.litrosCombustibleDisponible = 10;
    }

    //Metodos accesores
    //Para RETORNAR el valor
    public String getMarca(){
        return this.marca;
    }
    //Para MODIFICAR el valor
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public double getLitrosCombustibleDisponible() {
        return litrosCombustibleDisponible;
    }



    public void agregarCombustible(double litros){
        if(litros >= 0) {
            this.litrosCombustibleDisponible = this.litrosCombustibleDisponible + litros;
        }
        else {
            System.out.println("La cantidad de combustible a agregar debe ser positiva");
        }
    }

    public void quitarCombustible(double litros){
        if(litros <= 0){
            if((this.litrosCombustibleDisponible + litros) <= 0){
                this.litrosCombustibleDisponible = 0;
            }
            else{
                //this.litrosTanque = 5 + (-4) = 1
                this.litrosCombustibleDisponible = this.litrosCombustibleDisponible + litros;
            }
        }
        else{
            System.out.println("La cantidad de litros a quitar debe ser negativa");
        }
    }


    //Metodo sin retorno
    public void encenderAuto(){
        System.out.println("Se esta encendido el auto");

        if(this.litrosCombustibleDisponible > 1){
            this.estaEncendido = true;
        }
        else{
            this.estaEncendido = false;
        }
    }

    //Metodo con retorno
    public String estadoAuto(){
        if(this.estaEncendido == true){
            return "Auto encendido";
        }
        else{
            return "Auto apagado";
        }
    }




}
