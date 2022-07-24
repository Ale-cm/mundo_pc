package com.gm.mundopc;

public class Monitor {
    int idMonitor;
    String marca;
    double tamaño;
    int contadorMonitores;


    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamaño=" + tamaño +
                ", contadorMonitores=" + contadorMonitores +
                '}';
    }
    public Monitor() {
    }

    public Monitor(int idMonitor, String marca, double tamaño, int contadorMonitores) {
        this.idMonitor = idMonitor;
        this.marca = marca;
        this.tamaño = tamaño;
        this.contadorMonitores = contadorMonitores;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setContadorMonitores(int contadorMonitores) {
        this.contadorMonitores = contadorMonitores;
    }
}
