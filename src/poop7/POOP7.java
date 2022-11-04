/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7;

/**
 *
 * @author darwi
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente ger = new Gerente();
        ger.setNombre("Wawa");
        ger.setNumEmpleado(24287);
        System.out.println("Nombre: " +ger.getNombre());
        System.out.println("Numero de empleado " +ger.getNumEmpleado());
        System.out.println("Sueldo: " +ger.getSueldo());

        ger.setSueldo(10);
        System.out.println("Sueldo aumentado: " + ger.getSueldo());

        ger.setPresupuesto(100_000);
        System.out.println("Presupuesto: " + ger.getPresupuesto());

        System.out.println(ger);
    }
    
}
