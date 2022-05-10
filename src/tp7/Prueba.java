/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author OzKuro
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia ingles1 = new Materia(1, "Ingles 1", 2022);
        Materia mat1 = new Materia(2, "Matematica 1", 2022);
        Materia lab1 = new Materia(3, "Laboratorio 1", 2022);
        
        Alumno a = new Alumno(1001, "Lopez", "Martin");
        Alumno b = new Alumno(1002, "Martinez", "Brenda");
        
        a.agregarMateria(ingles1);
        a.agregarMateria(mat1);
        a.agregarMateria(lab1);
        
        b.agregarMateria(ingles1);
        b.agregarMateria(mat1);
        b.agregarMateria(lab1);
        b.agregarMateria(lab1);
        
        System.out.println("A: " + a.cantidadMaterias());
        System.out.println("B: " + b.cantidadMaterias());
    }
    
}
