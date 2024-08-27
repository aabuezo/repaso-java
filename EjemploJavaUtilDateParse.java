
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd':");
            try {
                Date fecha = format.parse(sc.next());
                System.out.println("fecha: " + fecha);
                System.out.println("format: " + format.format(fecha));

                Date fecha2 = new Date();
                if (fecha.after(fecha2)) {
                    System.out.println("La fecha ingresada esta en el futuro.");
                } else if (fecha.before(fecha2)) {
                    System.out.println("La fecha ingresada esta en el pasado.");
                } else {
                    System.out.println("Ingreso la fecha de hoy.");
                }

                if (fecha.compareTo(fecha2) > 0) {
                    System.out.println("La fecha ingresada esta en el futuro.");
                } else if (fecha.compareTo(fecha2) < 0) {
                    System.out.println("La fecha ingresada esta en el pasado.");
                } else {
                    System.out.println("Ingreso la fecha de hoy.");
                }

            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
