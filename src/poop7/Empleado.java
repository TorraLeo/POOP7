/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author darwi
 */
public class Empleado extends Object {
    private String nombre;
    private int NumEmpleado, sueldo;

    public Empleado() {
        this.sueldo = 10000; // incializa desde su creacion con este monto
    }

    public Empleado(String nombre, int NumEmpleado, int sueldo) {
        this.nombre = nombre;
        this.NumEmpleado = NumEmpleado;
        this.sueldo = sueldo;
    }
    /**
     * 
     * @return Regresa el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @return Regresa el numero del empleado
     */
    public int getNumEmpleado() {
        return NumEmpleado;
    }

    /**
     * 
     * @return Regresa el numero del empleado
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * Método que modifica el valor del nombre
     * 
     * @param nombre Nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que modifica el valor del nombre
     * @param NumEmpleado
     */
    public void setNumEmpleado(int NumEmpleado) {
        this.NumEmpleado = NumEmpleado;
    }

    /**
     * Metofo que modifica el valor del sueldo
     * @param porcentaje
     */
    public void setSueldo(int porcentaje) {
        this.sueldo += (int) (sueldo * porcentaje / 100); // Se hace un casteo para convetirlo de float a int
        // sueldo hace alusion al atributo principal
    }

    @Override
    public String toString() {
        return "Empleado" + super.toString() + "{nombre=" + nombre + ", NumEmpleado=" + NumEmpleado + ", sueldo="
                + sueldo + '}';
    }
}
