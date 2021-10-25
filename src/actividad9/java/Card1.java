/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9.java;

/**
 *
 * @author LyrisseC
 */
public class Card1 {
     public String palo;
    public String color;
    public String valor;
    
    public Card1(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }
    /**
     * @return
     */
    @Override
    public String toString(){
        return "Palo: " + palo + " | " + "Color: " + color +
                " | " + "Valor: " + valor;
    }
}
