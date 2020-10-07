/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_2;

/**
 *
 * @author hp
 */
public class Circulo {

    double perimetro;//atributos o variables a utilizar 
    double radio;//atributos o variables a utilizar 

    public void setRadio(double radio) {//metodo set para poder ingresar el valor del radio
        this.radio = radio;
    }

    public double cal_perimetro_circulo() {//metodo para calcularel perimetro del circulo
        perimetro = 2 * Math.PI * radio;//formula 
        return perimetro;//se retorna el valor obtenido

    }

    public double getPerimetro() {// metodo para poder mostrar el valor del perimetro
        return perimetro;
    }

}
