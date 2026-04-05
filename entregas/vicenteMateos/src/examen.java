public class Cine {
}

public class Sala {
    public int capacidad;

    public int disponibles(int vendidas) {
        return capacidad - vendidas;
    }
}

public class Pelicula {
    public String titulo;
    public int duracion;
    public String director;
    public int clasificacion;
}

public class Proyeccion {
    public int hora;
    public int fecha;
    public String sala;
    public int precio;
    public int costEntrada;

    public void vender(int cantidad) {
        costEntrada += cantidad;
    }

    public int recaudacion() {
        return costEntrada * precio;
    }
}

public class Recaudacion {
    public int total;
    public int entradasVendidas;

    public void calcular(int precio) {
        total = entradasVendidas * precio;
    }
}

public class Main {
    public static void main(String[] args)  {

        Cine cine = new Cine();
        Pelicula p1 = new Pelicula();
        p1.titulo = "Dune: Parte 2";
        p1.director = "Denis Villeneuve";
        p1.duracion = 166;
        p1.clasificacion = 13;
        Pelicula p2 = new Pelicula();
        p2.titulo = "Oppenheimer";
        p2.director = "Christopher Nolan";
        p2.duracion = 180;
        p2.clasificacion = 16;
        Sala s1 = new Sala();
        s1.capacidad = 100;
        Sala s2 = new Sala();
        s2.capacidad = 150;
        Proyeccion pr1 = new Proyeccion();
        pr1.sala = "Sala 1";
        pr1.fecha = 20250401;
        pr1.hora = 1800;
        pr1.precio = 10;
        pr1.costEntrada = 85;
        Proyeccion pr2 = new Proyeccion();
        pr2.sala = "Sala 2";
        pr2.fecha = 20250402;
        pr2.hora = 2000;
        pr2.precio = 12;
        pr2.costEntrada = 120;
        Recaudacion r1 = new Recaudacion();
        r1.entradasVendidas = pr1.costEntrada;
        r1.calcular(pr1.precio);
        Recaudacion r2 = new Recaudacion();
        r2.entradasVendidas = pr2.costEntrada;
        r2.calcular(pr2.precio);
        System.out.println("Sala 1: " + r1.total + "€");
        System.out.println("Sala 2: " + r2.total + "€");
        System.out.println("Libres Sala 1: " + s1.disponibles(pr1.costEntrada));
        System.out.println("Libres Sala 2: " + s2.disponibles(pr2.costEntrada));
    }
}