/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lgdfj
 */
public class Escolhas {
    public int EscolhasJogador(String opcao) throws Exception 
    {
        TerraClownPlanet terraClownPlanet = new TerraClownPlanet();
        
        //System.out.println("Escolha entre 2)floresta   2)entrevista");
        //System.out.print("Opção: ");
        java.lang.reflect.Method method;       
        method = terraClownPlanet.getClass().getMethod("Historia" + opcao);
        method.invoke(terraClownPlanet);
        return 0;
    
    }
    
}
