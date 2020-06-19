import java.io.Console;
import java.util.Scanner;
public class JogoV7 {
    public static void main(String[] args) throws Exception  {
        
        
        Scanner scanner = new Scanner(System.in);
        
        Goblin g1 = new Goblin();
        Zumbi g2 = new Zumbi();
        
        
        
        
        System.out.println("Digite o nome do seu personagem: ");
        String nome = scanner.next();
        Personagem jogador = new Personagem(nome);
        
        //Criando um personagem guerreiro:
        
        System.out.println("Seja bem vindo: " + jogador.getNome());
        
        System.out.println("Você acaba de comprar um simulador, qual Terra você deseja jogar primeiro? ");
        
        
        Quests quests = new Quests(jogador);
        System.out.println("Escolha entre 1)Terra 4-169 1   2)TerraClownPlanet  ou  3)Universo 3 ");
        System.out.print("Opção: ");
        String opcao = new java.util.Scanner(System.in).next();
        java.lang.reflect.Method method;       
        method = quests.getClass().getMethod("quest" + opcao);
        method.invoke(quests);
        
        
        
        
        
        
        System.out.println(method.toString() + "method = ");  
        
        
        /*
          public Method getMethod(String name, Class<?>... parameterTypes)
        throws NoSuchMethodException, SecurityException {
        checkMemberAccess(Member.PUBLIC, Reflection.getCallerClass(), true);
        Method method = getMethod0(name, parameterTypes, true);
        if (method == null) {
            throw new NoSuchMethodException(getName() + "." + name + argumentTypesToString(parameterTypes));
        }
        return method;
    }
        /*
        
        
        
        
        */
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        //System.out.println(jogador.status());
        /*
        System.out.println(g1);
        
        System.out.println("--------------------------------------");
        jogador.bater(g1);
        g1.atacar(jogador);
        
        System.out.println(jogador.status());
        System.out.println(g1);
        System.out.println("---------------------------------------------");
        jogador.bater(g1);
        g1.atacar(jogador);
        System.out.println(jogador.status());
        System.out.println(g1);
        */
        
    }
}
