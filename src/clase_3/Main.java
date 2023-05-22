package clase_3;

public class Main {
    public static void main(String[] args) {
        Auto auto_uno = new Auto();

        System.out.println("Marca: " + auto_uno.getMarca());
        System.out.println("Anio: " + auto_uno.getAnio());

        System.out.println("--------------------------------");

        Auto auto_dos = new Auto("Fiat", "4X4", 2022, 100000.98);
        System.out.println("Marca: " + auto_dos.getMarca());
        System.out.println("Anio: " + auto_dos.getAnio());

        String estado = auto_dos.estadoAuto();
        System.out.println("Auto encendido?: " + estado);

        System.out.println("Encendemos el auto...");
        auto_dos.encenderAuto();

        estado = auto_dos.estadoAuto();
        System.out.println("Auto encendido?: " + estado);

        System.out.println("--------------------------------");


        System.out.println("Cantidad de combustible: " + auto_dos.getLitrosCombustibleDisponible());
        System.out.println("Cargamos combustible....");
        auto_dos.agregarCombustible(-3);
        System.out.println("Cantidad de combustible: " + auto_dos.getLitrosCombustibleDisponible());

        System.out.println("Volvemos a intentar encender el auto...");
        auto_dos.encenderAuto();
        estado = auto_dos.estadoAuto();
        System.out.println("Auto encendido?: " + estado);



    }
}
