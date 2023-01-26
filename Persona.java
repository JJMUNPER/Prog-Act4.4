package org.losremedios.prog.ut4.actividades.act4;

public class Persona {

    String nombre;
    int edad;

    // Constructor por defecto
    Persona(){

    }
    // Constructor
    Persona (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    /**
     * La clase padre objet tiene un metodo toString que hace que imprima la referencia, sobreescribiendo
     * el metodo hacemos que en lugar de imprimir la refencia nos imprima el objeto, en este caso el nombre
     * de una persona
     * @return
     */

    @Override

    public String toString(){

        return nombre;
    }
}
