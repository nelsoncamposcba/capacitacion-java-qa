package clase_4.tarea;

public class Principal {
    public static void main(String[] args) {
        //Creación del concesionario
        Concesionario concesionario = new Concesionario("Tu-Tu");

        System.out.println("----- BIENVENIDO AL CONCESIONARIO " + concesionario.getNombreConcesionario() + " -----");

        //Creación de los autos
        Vehiculo autoConcesionarioUno = new Automovil("Fiat", "Pulse", 2023, 5000000, 4);
        Vehiculo autoConcesionarioDos = new Automovil("Fiat", "Cronos", 2020, 4978210, 4);
        Vehiculo autoConcesionarioTres = new Automovil("Ford", "Escort", 1989, 1000000, 4);
        Vehiculo autoConcesionarioCuatro = new Automovil("Peugeot", "206", 2000, 2100000, 4);
        Vehiculo autoConcesionarioCinco = new Automovil("Honda", "CR-V", 2022, 7014999, 4);

        //Creación de las motocicletas
        Vehiculo motoUno = new Motocicleta("Yamaha", "YBR Z 125", 2023, 825000, 124);
        Vehiculo motoDos = new Motocicleta("Honda", "NC 750", 2021, 4978210, 745);

        //Se agregan los autos al inventario
        concesionario.agregarVehiculo(autoConcesionarioUno);
        concesionario.agregarVehiculo(autoConcesionarioDos);
        concesionario.agregarVehiculo(autoConcesionarioTres);
        concesionario.agregarVehiculo(autoConcesionarioCuatro);
        concesionario.agregarVehiculo(autoConcesionarioCinco);

        //Se agregar las motos al inventario
        concesionario.agregarVehiculo(motoUno);
        concesionario.agregarVehiculo(motoDos);


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