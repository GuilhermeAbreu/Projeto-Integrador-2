
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lgdfj
 */
public class Quests {
        Terra4169 terra4169 = new Terra4169();
        TerraClownPlanet terraClownPlanet;                        
        
    public Quests(Personagem p){
        terraClownPlanet = new TerraClownPlanet(p);
    }
    
    public Quests(){
    }    
        
    public void quest1() throws IOException, IndexOutOfBoundsException {
        System.out.println("Vc escolheu a quest 01!");
        terra4169.Historia1();
    }
    public void quest2() throws IOException, IndexOutOfBoundsException {
        System.out.println("Vc escolheu a quest 02!");
        terraClownPlanet.HistoriaInicio();
    }
    public void quest3() throws IOException, IndexOutOfBoundsException {
        System.out.println("Vc escolheu a quest 03!");
    }
}

