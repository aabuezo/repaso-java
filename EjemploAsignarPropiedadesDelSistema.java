import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema {
    public static void main(String[] args) {

        try (FileInputStream archivo = new FileInputStream("config.properties")) {

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Mi valor personalizado");

            System.setProperties(p);
            System.getProperties().list(System.out);

        } catch (IOException e) {
            System.err.println("No existe el archivo.");
            e.printStackTrace();
        }
    }
}
