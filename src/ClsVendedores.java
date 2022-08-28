import java.util.Scanner;

public class ClsVendedores {
    private String nombre;
    private double enero;
    private double febrero;
    private double marzo;

    private double abril;



    public void llenarInformacion(){
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        setNombre(t.nextLine());

        System.out.println("Ingrese Enero: ");
        setEnero((double) Double.valueOf(t.nextLine()));

        System.out.println("Ingrese Febrero");
        setFebrero(t.nextDouble());

        System.out.println("Ingrese Marzo");
        setMarzo(t.nextDouble());

        System.out.println("Ingrese Abril");


    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the enero
     */
    public double getEnero() {
        return enero;
    }

    /**
     * @param enero the enero to set
     */
    public void setEnero(double enero) {
        this.enero = enero;
    }

    /**
     * @return the febrero
     */
    public double getFebrero() {
        return febrero;
    }

    /**
     * @param febrero the febrero to set
     */
    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    /**
     * @return the marzo
     */
    public double getMarzo() {
        return marzo;
    }

    /**
     * @param marzo the marzo to set
     */
    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }
    /**
     * @return the abril
     */
    public double getAbril() {
        return abril;
    }

    /**
     * @param abril the marzo to set
     */
    public void setAbril(double abril) {
        this.abril = abril;
    }
}
