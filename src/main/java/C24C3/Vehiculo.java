package C24C3;

public interface Vehiculo {
    void acelerar(int velocidad);
    void frenar();
}

class Coche implements Vehiculo {
    private int velocidadActual;

    public Coche() {
        this.velocidadActual = 0;
    }

    @Override
    public void acelerar(int velocidad) {
        velocidadActual += velocidad;
        System.out.println("El coche ha acelerado a " + velocidadActual + " km/h.");
    }

    @Override
    public void frenar() {
        if (velocidadActual > 0) {
            System.out.println("El coche ha frenado.");
            velocidadActual = 0;
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }
}



