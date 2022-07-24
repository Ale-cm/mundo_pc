package com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    int idRaton;
    int contadorRatones;
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }

    @Override
    public String toString() {
        return "Raton{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
