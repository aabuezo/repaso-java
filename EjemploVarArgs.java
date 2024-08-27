public class EjemploVarArgs {
    public static void main(String[] args) {
        System.out.println(sumar(1, 3, 5, 7, 9));
    }

    public static int sumar(int... nums) {
        int suma = 0;
        for (int i : nums) {
            suma += i;
        }
        return suma;
    }
}
