package clase_4.tarea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concesionario {
    private final List<Vehiculo> inventario;
    private final String nombreConcesionario;

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


                inventario.remove(i);

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
        int ventas = 0;

        /*
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null)
                ventas++; //ventas = ventas + 1;
        }
        */

        return ventas;
    }

    public void visualizarInventarioPrecioAscendente() {
        int n = this.inventario.size();
        if(n == 0){
            //Mostramos por pantalla el mensaje y cortamos la ejecución del método (return)
            System.out.println("Se vendió todo");
            return;
        }

        List<Vehiculo> autosOrdenados = null;

        /*
        //En caso que tenemos stock (sinStock=false)
        //Creamos un array temp con valor null
        AutoConcesionario[] autosOrdenados = new AutoConcesionario[n];

        // Se copian todos los elementos del array original en el nuevo array utilizando un bucle for
        for (int i = 0; i < n; i++) {
            autosOrdenados[i] = this.inventario[i];
        }


        // Se recorre desde el primer elemento hasta el penúltimo del array nuevo
        for (int i = 0; i < n - 1; i++) {
            // Indice que tiene al Auto con menor precio
            int minIndex = i;

            // Este bucle interno es encontrar el índice del elemento con el precio mínimo en el array
            for (int j = i + 1; j < n; j++) {

                // Verifica que el
                // - elemento en el índice actual no sea nulo
                // - y que el elemento en el índice de precio mínimo sea nulo o tenga un precio mayor al del elemento actual
                if (autosOrdenados[j] != null && (autosOrdenados[minIndex] == null || autosOrdenados[j].getPrecio() < autosOrdenados[minIndex].getPrecio())) {
                    // Indice mínimo se actualiza al índice actual
                    minIndex = j;
                }
            }

            // Se verifica si es diferente del índice actual
            if (minIndex != i) {
                // Si son diferentes, se intercambian los elementos en los índices actuales y mínimos utilizando una variable temporal
                AutoConcesionario temp = autosOrdenados[i];
                autosOrdenados[i] = autosOrdenados[minIndex];
                autosOrdenados[minIndex] = temp;
            }
        }

         */


        //Imprimimos el inventario
        System.out.println("El inventario actual es: ");
        for (int i = 0; i < autosOrdenados.size(); i++) {
            if(autosOrdenados.get(i) != null){
                System.out.println("Marca: " + autosOrdenados.get(i).getMarca() +
                        " - Modelo: " + autosOrdenados.get(i).getModelo() +
                        " - Año: " + autosOrdenados.get(i).getAnio() +
                        " - Precio: $ " + autosOrdenados.get(i).getPrecio()
                );
            }
        }
    }
}
