package clase_3.tarea;

public class Concesionario {
    private final AutoConcesionario[] inventario;
    private final String nombreConcesionario;

    public Concesionario(String nombreConcesionario) {
        this.inventario = new AutoConcesionario[5];
        this.nombreConcesionario = nombreConcesionario;
    }

    public String getNombreConcesionario() {
        return nombreConcesionario;
    }

    public void agregarAuto(AutoConcesionario nuevoAutoConcesionario) {
        //inventario -> [null, null, null, null, null]
        //inventario -> [AutoUno, null, null, null, null]
        //inventario -> [AutoUno, AutoDos, null, null, null]


        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                inventario[i] = nuevoAutoConcesionario;
                break;
            }
        }
    }

    public boolean existeAutoInventario(String marca, String modelo, int anio) {
        //inventario -> [AutoUno, null, null, null, null]

        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getModelo() == modelo && inventario[i].getMarca() == marca && inventario[i].getAno() == anio) {
                return true;
            }
        }

        return false;
    }

    public void venderAuto(String marca, String modelo, int anio) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null && inventario[i].getModelo() == modelo && inventario[i].getMarca() == marca && inventario[i].getAno() == anio) {
                inventario[i] = null;

                System.out.println("Auto VENDIDO");

                return;
            }
        }

        System.out.println("Auto NO VENDIDO. No se encontro en el inventario.");
    }

    public int cantidadStockInventario() {
        int stock = 0;

        //inventario -> [AutoUno, AutoDos, null, null, AutoCinco]
        //stock = 3
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null)
                stock++; //stock = stock + 1;
        }

        return stock;
    }

    public int cantidadVendido() {
        int ventas = 0;

        //inventario -> [AutoUno, AutoDos, null, null, AutoCinco]
        //ventas = 2
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null)
                ventas++; //ventas = ventas + 1;
        }

        return ventas;
    }

    public void visualizarInventarioPrecioAscendente() {
        int n = this.inventario.length;

        //Nos indicará si tenemos stock o no
        boolean sinStock = true;

        //Recorremos el inventario
        for (int i = 0; i < n; i++) {
            if(this.inventario[i] != null) {
                //Si existe algo en el stock, actualizamos la variable y cortamos la ejecución del ciclo
                sinStock = false;
                break;
            }
        }

        //Si no hay stock (sinStock=true)
        if(sinStock == true){
            //Mostramos por pantalla el mensaje y cortamos la ejecución del método (return)
            System.out.println("Se vendió todo");
            return;
        }

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


        //Imprimimos el inventario
        System.out.println("El inventario actual es: ");
        for (int i = 0; i < autosOrdenados.length; i++) {

            if(autosOrdenados[i] != null){
                System.out.println("Marca: " + autosOrdenados[i].getMarca() +
                        " - Modelo: " + autosOrdenados[i].getModelo() +
                        " - Año: " + autosOrdenados[i].getAno() +
                        " - Precio: $ " + autosOrdenados[i].getPrecio()
                );
            }
        }
    }
}
