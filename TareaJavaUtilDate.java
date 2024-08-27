import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TareaJavaUtilDate {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese su fecha de nacimiento con el formato dd-MM-yyyy:");

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            try {
                Date fechaNacimiento = sdf.parse(sc.next());

                System.out.println("Tu edad es: " + getEdad(fechaNacimiento));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

    }

    public static int getEdad(Date fechaNacimiento) {
        long milisegundos = System.currentTimeMillis() - fechaNacimiento.getTime();
        TimeUnit unit = TimeUnit.DAYS;
        long dias = unit.convert(milisegundos, TimeUnit.MILLISECONDS);
        return (int) dias / 365;
    }
}
