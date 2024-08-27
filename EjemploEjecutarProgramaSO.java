import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process process;

        try {
            if (System.getProperty("os.name").startsWith("Win")) {
                process = rt.exec("notepad");
            } else if (System.getProperty("os.name").startsWith("Mac")) {
                process = rt.exec("code");
            } else {
                process = rt.exec("gedit");
            }
            process.waitFor();
        } catch (IOException e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
