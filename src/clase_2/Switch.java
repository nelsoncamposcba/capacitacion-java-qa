package clase_2;

public class Switch {
    public static void main(String[] args) {
        int nro_dpto = 0;

        switch(nro_dpto){
            case 0:
                System.out.println("Planta Baja");
                break;
            case 1:
                System.out.println("1° Piso");
                break;
            case -1:
                System.out.println("Subsuelo");
                break;
            case 2:
                System.out.println("2° Piso");
                break;
            case 12:
                System.out.println("Contaduria");
                break;

            default:
                System.out.println("Piso inexistente");
                break;
        }
    }
}
