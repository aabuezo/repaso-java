class Persona {
    protected String nombre;
}

class Trabajador extends Persona {
    protected String profesion;
}

class Medico extends Trabajador {
    protected String hospital;
}

class Clinico extends Medico {
    protected String especializacion;
}

public class EjemploReflectionHerencia {
    public static void main(String[] args) {
        Clinico drClinico = new Clinico();

        Class dr = drClinico.getClass();
        while (dr.getSuperclass() != null) {
            String claseHija = dr.getName();
            String clasePadre = dr.getSuperclass().getName();
            System.out.println(claseHija + " es hija de " + clasePadre);
            dr = dr.getSuperclass();
        }
    }
}
