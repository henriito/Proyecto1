import java.util.*;

public class Ventas {

    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {

        List<ClsVendedores> misEmp = new ArrayList();
        ClsVendedores ven = new ClsVendedores();
        ven.setNombre("Ivan");
        ven.setEnero(generateRandomIntIntRange(100,800));
        ven.setFebrero(generateRandomIntIntRange(100,600));
        ven.setMarzo(generateRandomIntIntRange(200,900));
        ven.setAbril(generateRandomIntIntRange(100,500));
        misEmp.add(ven);

        ven = new ClsVendedores();
        ven.setNombre("Juan");
        ven.setEnero(generateRandomIntIntRange(100,800));
        ven.setFebrero(generateRandomIntIntRange(100,600));
        ven.setMarzo(generateRandomIntIntRange(200,900));
        ven.setAbril(generateRandomIntIntRange(100,500));
        misEmp.add(ven);

        ven = new ClsVendedores();
        ven.setNombre("Henry");
        ven.setEnero(generateRandomIntIntRange(100,800));
        ven.setFebrero(generateRandomIntIntRange(100,600));
        ven.setMarzo(generateRandomIntIntRange(200,900));
        ven.setAbril(generateRandomIntIntRange(100,500));
        misEmp.add(ven);

        ven = new ClsVendedores();
        ven.setNombre("María");
        ven.setEnero(generateRandomIntIntRange(100,800));
        ven.setFebrero(generateRandomIntIntRange(100,600));
        ven.setMarzo(generateRandomIntIntRange(200,900));
        ven.setAbril(generateRandomIntIntRange(100,500));
        misEmp.add(ven);

        ven = new ClsVendedores();
        ven.setNombre("Fernando");
        ven.setEnero(generateRandomIntIntRange(100,800));
        ven.setFebrero(generateRandomIntIntRange(100,600));
        ven.setMarzo(generateRandomIntIntRange(200,900));
        ven.setAbril(generateRandomIntIntRange(100,500));
        misEmp.add(ven);

        ven = new ClsVendedores();
        ven.setNombre("Bruno");
        ven.setEnero(generateRandomIntIntRange(100,800));
        ven.setFebrero(generateRandomIntIntRange(100,600));
        ven.setMarzo(generateRandomIntIntRange(200,900));
        ven.setAbril(generateRandomIntIntRange(100,500));
        misEmp.add(ven);

        ven = new ClsVendedores();
        ven.setNombre("Nidia");
        ven.setEnero(generateRandomIntIntRange(100,800));
        ven.setFebrero(generateRandomIntIntRange(100,600));
        ven.setMarzo(generateRandomIntIntRange(200,900));
        ven.setAbril(generateRandomIntIntRange(100,500));
        misEmp.add(ven);

        ven = new ClsVendedores();
        ven.setNombre("Lucia");
        ven.setEnero(generateRandomIntIntRange(100,800));
        ven.setFebrero(generateRandomIntIntRange(100,600));
        ven.setMarzo(generateRandomIntIntRange(200,900));
        ven.setAbril(generateRandomIntIntRange(100,500));
        misEmp.add(ven);

        double sumaEnero, sumaFebrero, sumaMarzo, sumaAbril, sumaTotal;
        sumaTotal = sumaEnero = sumaFebrero = sumaMarzo = sumaAbril = 0;

        for (ClsVendedores v : misEmp) {
            System.out.println("Nombre = " + v.getNombre());
            System.out.println("Enero = "+v.getEnero());
            System.out.println("Febrero = "+v.getFebrero());
            System.out.println("Marzo = "+v.getMarzo());
            System.out.println("Abril = "+v.getAbril());
            sumaEnero += v.getEnero();
            sumaFebrero += v.getFebrero();
            sumaMarzo += v.getMarzo();
            sumaAbril += v.getAbril();
        }
        sumaTotal = sumaEnero + sumaFebrero + sumaMarzo + sumaAbril;
        System.out.println("Las ventas de enero son: " + sumaEnero);
        System.out.println("Las ventas de febrero son: " + sumaFebrero);
        System.out.println("Las ventas de marzo son: " + sumaMarzo);
        System.out.println("Las ventas de abril son: " + sumaAbril);
        System.out.println("Las ventas totales por todos los meses son: "+ sumaTotal);
    }
}