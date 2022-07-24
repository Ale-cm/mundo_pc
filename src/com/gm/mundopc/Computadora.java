package com.gm.mundopc;

public class Computadora {
    int idComputadora;
    String nombre;
    Monitor monitor;
    Teclado teclado;
    Raton raton;


    public Computadora() {
    }

    public Computadora(int idComputadora, String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this.idComputadora = idComputadora;
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }
}
