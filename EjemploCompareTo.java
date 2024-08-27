import java.util.Arrays;
import java.util.List;

class Auto implements Comparable<Auto> {
    private String marca;
    private String modelo;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // compara solo por marca
    @Override
    public int compareTo(Auto auto) {
        return this.marca.compareTo(auto.getMarca());
    }

}

public class EjemploCompareTo {
    public static void main(String[] args) {

        List<Auto> lst = Arrays.asList(
                new Auto("Honda", "CRV"),
                new Auto("Ford", "Ecosport"),
                new Auto("Chevrolet", "Tracker"),
                new Auto("Toyota", "Hilux"),
                new Auto("Toyota", "Corolla Cross"),
                new Auto("Ford", "Territory"),
                new Auto("VW", "Taos"));

        lst.sort(null);

        for (Auto auto : lst) {
            System.out.println(auto.getMarca() + " " + auto.getModelo());
        }
    }
}
