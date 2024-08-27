enum Color {
    ROJO,
    AMARILLO,
    VERDE
}

class Semaforo {
    Color color;

    public Semaforo(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

public class EjemploEnum {
    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo(Color.VERDE);
        System.out.println("Semaforo: " + semaforo.getColor());

        if (semaforo.getColor() == Color.ROJO) {
            System.out.println("Stop!");
        } else if (semaforo.getColor() == Color.AMARILLO) {
            System.out.println("Cambiando de color");
        } else {
            System.out.println("Pueden cruzar");
        }
    }
}
