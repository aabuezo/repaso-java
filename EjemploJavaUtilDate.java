
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha: " + fecha);

        // MMMM imprime el nombre del mes, MM para numeros, m para minutos
        // SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        // SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        // SimpleDateFormat df = new SimpleDateFormat("E dd-MM-yyyy 'at' HH:mm:ss z");
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd-MM-yyyy 'at' HH:mm:ss z");
        String fechaString = df.format(fecha);
        System.out.println(fechaString);

        // Timestamp (milisegundos desde 1/1/1970)
        long inicio = System.currentTimeMillis();
        long j = 0;
        for (int i = 0; i < 1_000_000_000; i++) {
            j += i;
        }
        System.out.println("j: " + j);
        long fin = System.currentTimeMillis();
        System.out.println("Took: " + (fin - inicio) + "ms.");

        // otra forma de calcular los milisegundos
        // Date fecha2 = new Date();
        // long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("");
    }
}