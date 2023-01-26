package org.losremedios.prog.ut4.actividades.act4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Persona p1= new Persona("Torcuato",21);
        Persona p2= new Persona("Pepermint",46);
        Persona p3= new Persona("Praxedes",18);

        Persona[] personas1={p1,p2,p3};


        System.out.println(Arrays.toString(personas1));
        System.out.println(personas1);

        //Para imrpimir el nombre

        System.out.println(personas1[0].nombre);
        System.out.println(personas1[0].edad);

        //Con foreach
        for (Persona p: personas1) {
            System.out.println(p.nombre);
            System.out.println(p.edad);
        }
        //Con for
        for (int i=0;i<personas1.length;i++){
            System.out.println(personas1[i].nombre);
            System.out.println(personas1[i].edad);
        }


    }
}
