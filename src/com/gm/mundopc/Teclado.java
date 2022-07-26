package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private final int idTeclados;
    private static int contadorTeclados;
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclados= ++contadorTeclados;
    }

    @Override
    public String toString() {
        return "{ Id Teclado : " +this.idTeclados +" "+ super.toString()+"}";
    }
}
