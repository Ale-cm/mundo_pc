package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    int idTeclados;
    int contadorTeclados;
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
