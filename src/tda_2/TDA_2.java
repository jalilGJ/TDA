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
public class TDA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo per = new Circulo();//se instancia el objeto
        System.out.println("Calcular perimetro de un circulo");//mensaje 
        per.setRadio(34.23);//metodo set para ingresar el valor del radio
        per.cal_perimetro_circulo();//metodo para calcular el valor del perimetro
        System.out.println(per.getPerimetro());//metodo get para mostrar el valor obtenido
    }
}
