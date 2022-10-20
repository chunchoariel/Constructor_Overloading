package com.open_bootcamp;

//Un constructor es lo primero que se ejecuta cuando tu instancias la clase.
//El constructor, es el mejor sitio para inicializar las propiedades de una clase. Y se puede sobrecargar las veces
    //que haga falta.
//Un constructor, puede inicializar a su padre.
//El constructor,
//Se invoca la misma funcion, lo unico que cambia es el numero de argumentos que le pasamos a la funcion. Con esto
    //hacemos la sobrecarga de funciones (Contructor_overloading)

//De buena practica, cuando tenemos un constructor con parametros y queremos inicializar variables internas. Habitual%
    //le vamos a dar como nombre de los parametros, los mismo nombres de parametros que tenga la clase. Esto antepo-
    //niendo this.

public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);

        Coche coche2 = new Coche(2, 90);
        System.out.println(coche2.numeroDePuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);
    }
}
class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche() {
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el Constructor ***SIN NADA***");
    }
    public Coche(int numeroDePuertas, int velocidadMaxima) {
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el Constructor ***CON PARAMETROS***");
    }
}