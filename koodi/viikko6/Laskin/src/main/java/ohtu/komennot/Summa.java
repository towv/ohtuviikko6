/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.komennot;

import javax.swing.JTextField;
import ohtu.Sovelluslogiikka;

/**
 *
 * @author twviiala
 */
public class Summa implements Komento {

    private Sovelluslogiikka sovellus;
    private JTextField tulos;
    private JTextField syote;

    public Summa(Sovelluslogiikka sovellus, JTextField tulos, JTextField syote) {
        this.sovellus = sovellus;
        this.tulos = tulos;
        this.syote = syote;
    }

    @Override
    public void suorita() {

        int b = Integer.parseInt(this.syote.getText());
        sovellus.plus(b);

        this.tulos.setText("" + sovellus.tulos());
    }

}
