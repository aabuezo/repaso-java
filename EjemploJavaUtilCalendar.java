
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        // Calendar es abstracta, por eso se usa getInstance(). Obtiene un calendario.
        Calendar calendar = Calendar.getInstance();

        // para customizar una fecha en el pasado o en el futuro
        // el mes arranca de cero. Enero = 0
        calendar.set(2020, 7, 26);
        // tambien se pueden usar constantes
        calendar.set(1974, Calendar.DECEMBER, 20);

        // tambien se pueden setear por separado
        calendar.set(Calendar.YEAR, 2001);
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        calendar.set(Calendar.DAY_OF_MONTH, 6);

        Date fecha = calendar.getTime();
        System.out.println("fecha sin formato: " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd-MM-yyyy");
        String fechaString = df.format(fecha);
        System.out.println("fecha con formato: " + fechaString);
    }
}
