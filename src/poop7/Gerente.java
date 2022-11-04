/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author darwi
 */
public class Gerente extends Empleado {
    private int presupuesto;
    //insertar un super constructor, de la clase superior

    public Gerente() {
    }
    

    public Gerente(String nombre, int NumEmpleado, int sueldo, int presupuesto) {
        super(nombre, NumEmpleado, sueldo); //incializa los atributos del padre e inicia la info
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        if(presupuesto < 0)
            presupuesto =0;
        this.presupuesto=presupuesto;
    }


    @Override
    public String toString() {
        return "Gerente [" + super.toString() + "presupuesto=" + presupuesto + "]"; //Hereda el metodo to string de la superclase Empleado
    }
}
