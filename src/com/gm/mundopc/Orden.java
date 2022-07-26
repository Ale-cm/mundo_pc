package com.gm.mundopc;

import java.util.Arrays;

public class Orden {
    private final int idOrden;
    private Computadora computadora[];
    private int contadorComputadoras;
    private  static int contadorOrdenes;
    private  static final int MAX_COMPUTADORA = 10;
    public Orden(){
    this.idOrden= ++contadorOrdenes;
    this.computadora = new Computadora[10];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras <10) {
            this.computadora[this.contadorComputadoras++] = computadora;
        }else {
            System.out.println(" Te pasaste de la raya. ");

        }

    }

    public void mostrarOrden () {
        System.out.println("Orden id " +this.idOrden);
        System.out.println(" Computadoras de la orden :# "+ this.idOrden);
        for (int j=0; j< this.contadorComputadoras; j++) {
            System.out.println(" A :"+ this.computadora[j]);

        }
        }
}
