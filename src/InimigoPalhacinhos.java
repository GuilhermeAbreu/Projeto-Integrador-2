/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lgdfj
 */
public class InimigoPalhacinhos implements Inimigo{

    int vida = 15;
    int xp = 5;
    
    @Override
    public void atacar(Personagem p) {
        p.vida -= 2;
    }

    @Override
    public void levarDano(int quantidade) {
        this.vida -= quantidade;
    }
    
    public String toString() {
        return "Goblin >> Vida: " + this.vida;
    }
    
}
