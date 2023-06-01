package clase_4.tarea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Concesionario {
    private final List<Vehiculo> inventario;
    private final String nombreConcesionario;

    private int cantidadVehiculosVendidos;

    public Concesionario(String nombreConcesionario) {
        this.inventario = new ArrayList<>();
        this.nombreConcesionario = nombreConcesionario;
    }

    public String getNombreConcesionario() {
        return nombreConcesionario;
    }

    public void agregarVehiculo(Vehiculo nuevoVehiculoConcesionario) {
        this.inventario.add(nuevoVehiculoConcesionario);
    }

    public boolean existeAutoInventario(String marca, String modelo, int anio) {
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getModelo() == modelo
                    && inventario.get(i).getMarca() == marca
                    && inventario.get(i).getAnio() == anio) {

                return true;
            }
        }

        return false;
    }

    public void venderAuto(String marca, String modelo, int anio) {
        for (int i = 0; i < this.inventario.size(); i++) {
            if (inventario.get(i).getModelo() == modelo
                    && inventario.get(i).getMarca() == marca
                    && inventario.get(i).getAnio() == anio) {

                //Eliminamos el elemento de la lista
                inventario.remove(i);

                //Aumente en 1 cada vez que venda.
                this.cantidadVehiculosVendidos++; //this.cantidadVehiculosVendidos = this.cantidadVehiculosVendidos + 1;

                System.out.println("Auto VENDIDO");

                return;
            }
        }

        System.out.println("Auto NO VENDIDO. No se encontro en el inventario.");
    }

    public int cantidadStockInventario() {
        return this.inventario.size();
    }

    public int cantidadVendido() {
        return this.cantidadVehiculosVendidos;
    }

    public void visualizarInventarioPrecioAscendente() {
        int n = this.inventario.size();
        if(n == 0){
            //Mostramos por pantalla el mensaje y cortamos la ejecución del método (return)
            System.out.println("Se vendió todo");
            return;
        }
/*
        Collections.sort(this.inventario, new Comparator<Vehiculo>() {
            @Override
            public int compare(Vehiculo o1, Vehiculo o2) {
                // positivo -> o1 > o2
                // negativo -> o1 < o2
                // cero -> o1 == o2
                // Si queremos ordenar de forma ascendente, devuelve un valor negativo si o1 < o2

                return Double.compare(o1.getPrecio(), o2.getPrecio());
            }
        });
        */

        this.inventario.sort((v1, v2) -> Double.compare(v1.getPrecio(), v2.getPrecio()));

        //this.inventario.sort(Comparator.comparingDouble(Vehiculo::getPrecio));

        //Imprimimos el inventario
        System.out.println("El inventario actual es: ");
        for (int i = 0; i < this.inventario.size(); i++) {
            if(this.inventario.get(i) != null){
                System.out.println("Marca: " + this.inventario.get(i).getMarca() +
                        " - Modelo: " + this.inventario.get(i).getModelo() +
                        " - Año: " + this.inventario.get(i).getAnio() +
                        " - Precio: $ " + this.inventario.get(i).getPrecio()
                );
            }
        }
    }
}
