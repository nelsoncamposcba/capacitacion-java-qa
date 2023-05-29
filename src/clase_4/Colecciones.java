package clase_4;

import clase_4.herencia.Automovil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Colecciones {

    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("Manzanas"); //posicion: 0
        frutas.add("Peras"); //posicion: 1

        //No funcionan ya que no son tipo String
        //frutas.add(123);
        //frutas.add(new Automovil("Ford", "Escort", 1989, 4));

        System.out.println("Listado de frutas: " + frutas);

        System.out.println("Obteniendo un elemento puntual: " + frutas.get(1));

        frutas.set(1, "Sandia");
        System.out.println("Obteniendo un elemento puntual recien modificado: " + frutas.get(1));

        //[Manzanas, Peras]
        frutas.remove(0);
        //[Peras]
        System.out.println("Listado de frutas eliminando previamente una: " + frutas);


    }
}
