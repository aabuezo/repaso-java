
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        // obtiene todas las variables de entorno en un Map
        Map<String, String> varEnv = System.getenv();
        // for (String str : varEnv.keySet()) {
        // System.out.println(str + ": " + varEnv.get(str));
        // }
        System.out.println();

        // si lo quiero ordenar
        List<String> keys = new ArrayList<>();
        for (String str : varEnv.keySet()) {
            keys.add(str);
        }
        keys.sort(null);

        // para listar las variables de entorno en forma alfabetica
        for (String key : keys) {
            System.out.println(key + ": " + varEnv.get(key));
        }
        System.out.println();

        // asi obtengo una sola variable del Map
        System.out.println("JAVA_HOME: " + varEnv.get("JAVA_HOME"));

        // otra forma es obtener de a una variable
        String username = System.getenv("LOGNAME");
        System.out.println("username: " + username);

        String userHome = System.getenv("HOME");
        System.out.println("HOME: " + userHome);

    }
}
