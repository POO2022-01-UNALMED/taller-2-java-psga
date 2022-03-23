package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos() {
        int c = 0;
        for (Asiento asi:this.asientos){
            if (asi != null){
                c++;
            }
        }
        return c;
    }

    String verificarIntegridad() {

        if (this.motor.registro != this.registro) {
            return "Las piezas no son originales";
        }

        for (Asiento asi:this.asientos){
            if(asi != null && (asi.registro != this.registro)){
                return "Las piezas no son originales";
            }
        }
        return "Auto original";
    }


}