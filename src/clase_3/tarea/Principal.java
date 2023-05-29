package clase_3.tarea;

public class Principal {
    public static void main(String[] args) {
        //Creación del concesionario
        Concesionario concesionario = new Concesionario("Tu-Tu");

        System.out.println("----- BIENVENIDO AL CONCESIONARIO " + concesionario.getNombreConcesionario() + " -----");

        //Creación de los autos
        AutoConcesionario autoConcesionarioUno = new AutoConcesionario("Fiat", "Pulse", 2023, 5000000);
        AutoConcesionario autoConcesionarioDos = new AutoConcesionario("Fiat", "Cronos", 2020, 4978210);
        AutoConcesionario autoConcesionarioTres = new AutoConcesionario("Ford", "Escort", 1989, 1000000);
        AutoConcesionario autoConcesionarioCuatro = new AutoConcesionario("Peugeot", "206", 2000, 2100000);
        AutoConcesionario autoConcesionarioCinco = new AutoConcesionario("Honda", "CR-V", 2022, 7014999);

        //Se agregan los autos al inventario
        concesionario.agregarAuto(autoConcesionarioUno);
        concesionario.agregarAuto(autoConcesionarioDos);
        concesionario.agregarAuto(autoConcesionarioTres);
        concesionario.agregarAuto(autoConcesionarioCuatro);
        concesionario.agregarAuto(autoConcesionarioCinco);

        //Stock actual
        concesionario.visualizarInventarioPrecioAscendente();


        //Buscamos un auto existente
        System.out.println("Existe el auto Peugeot - 206 - 2000: " + concesionario.existeAutoInventario("Peugeot", "206", 2000));

        //Buscamos un auto que NO existente
        System.out.println("Existe el auto Honda - CR-V - 2023: " + concesionario.existeAutoInventario("Honda", "CR-V", 2023));


        //Vendemos un auto correctamente
        concesionario.venderAuto("Peugeot", "206", 2000);
        concesionario.venderAuto("Peugeot", "206", 2000);


        //Consultamos la cantidad de autos en stock
        System.out.println("La cantidad de autos en stock es: " + concesionario.cantidadStockInventario());
        //Consultamos la cantidad de autos vendidos
        System.out.println("La cantidad de autos vendidos son: " + concesionario.cantidadVendido());

        //Visualización de los autos en stock segun su precio
        concesionario.visualizarInventarioPrecioAscendente();
    }
}