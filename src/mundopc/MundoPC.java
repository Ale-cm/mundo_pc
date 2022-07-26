package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        System.out.println("HOla mundo ");

        Raton rato=new Raton("bluth","tas");
        Teclado tecla= new Teclado("bldu","asd");

        Monitor monitor= new Monitor(" nub",23);

        Monitor monitor1= new Monitor("monica",22);
        Computadora compu= new Computadora("miPC",monitor,tecla,rato);
        Computadora compu1= new Computadora("miPc",monitor1,tecla,rato);


        Orden orden1= new Orden();
        orden1.agregarComputadora(compu);
        orden1.agregarComputadora(compu1);
        orden1.mostrarOrden();
    }
}
