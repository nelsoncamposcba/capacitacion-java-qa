package clase_4;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Automovil("Ford", "Escort",1989, 4);
        Vehiculo moto = new Motocicleta("Honda", "XR-600", 2021, 600);

        System.out.println("Modelo del auto: " + auto.getModelo());
        System.out.println("Año de la moto: " + moto.getAnio());


        if(moto instanceof Motocicleta){
            Motocicleta motoAux = (Motocicleta) moto;

            System.out.println("Cilindrada de la moto: " + motoAux.getCilindrada());
        }

        if(auto instanceof Automovil){
            System.out.println("Cantidad de puertas del auto: " + ((Automovil) auto).getNumPuertas());
        }
    }
}
