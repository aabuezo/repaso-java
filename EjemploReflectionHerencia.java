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
        Clinico dr = new Clinico();

        Class clase = dr.getClass();
        while (clase.getSuperclass() != null) {
            String claseHija = clase.getName();
            String clasePadre = clase.getSuperclass().getName();
            System.out.println(claseHija + " es hija de " + clasePadre);
            clase = clase.getSuperclass();
        }
    }
}
