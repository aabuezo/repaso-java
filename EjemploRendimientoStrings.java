public class EjemploRendimientoStrings {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // c = c.concat(a).concat(b).concat("\n");
            // c += a + b + "\n";
            sb.append(a).append(b).append("\n");
        }

        // invocamos al Garbage Collector para liberar memoria
        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println("Took: " + (fin - inicio) + "ms.");
        System.out.println("c: " + c);
        // System.out.println("sb: " + sb.toString());

        System.exit(0);
    }
}
