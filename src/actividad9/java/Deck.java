/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author LyrisseC
 */
public class Deck {

    public String[]palodeck={"Corazones", "Diamantes", "Trebol", "Picas"};
    public String[]colordeck={"Rojo", "Negro"};
    public String[]valordeck={"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
    
    public ArrayList<Card1> deck;

    public Deck(){
        deck = new ArrayList<>();

        for (int palo = 0; palo < 2; palo++){
            for (String valordeck1 : valordeck) {
                deck.add(new Card1(palodeck[palo], colordeck[0], valordeck1));
            }
        }

        for (int palo = 2; palo < 4; palo++){
            for (String valordeck1 : valordeck) {
                deck.add(new Card1(palodeck[palo], colordeck[1], valordeck1));
            }
        }
    }

    public int getSize() {
        return deck.size();
    }

    public ArrayList<Card1> getDeck() {
        return deck;
    }

    public void suffle() {
        Collections.shuffle(deck);
        System.out.println("Se mezcló el Deck.");
        deck.forEach((elemento) -> {
            System.out.print(elemento + " / ");
        });
    }

    public void head(){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas");
        
    }


    public void pick() {
        Random random = new Random();
        System.out.println(deck.get(random.nextInt(deck.size())));
        deck.remove(random.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas");
    }

    public void hand() {
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
        }
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
    }

    void suflle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
