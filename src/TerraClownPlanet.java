
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TerraClownPlanet implements Terra{
    Personagem jogador;
    String nome;
    Escolhas escolhas = new Escolhas();   
    Scanner teclado = new Scanner(System.in);
    
    public TerraClownPlanet(Personagem p){
        jogador = p;
    }
    public TerraClownPlanet(){
    }    
    
    public void HistoriaInicio(){
        slowPrint("Entrando em ClownPlanet");
        System.out.println("------------------------------------");
        slowPrint("Iniciando simulação em 3,2,1... Carregamento concluido!");
        System.out.println("------------------------------------");
        slowPrint("Você já esta presente no ClownPlanet");
        System.out.println("------------------------------------");
        slowPrint("Você está em uma floresta povoada por palhacinhos, parece divertido, o que deseja fazer?");
        slowPrint("1) explorar 2)revirar meus itens");
        
        
        
        String opcao = teclado.next();
        try {
            escolhas.EscolhasJogador(opcao);
        } catch (Exception ex) {
            Logger.getLogger(TerraClownPlanet.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

    @Override
    public void Historia1() {
        System.out.println("VocÊ se aproxima e vê...");
        System.out.println("jogador: " + "CAramba!! Que diabos é isso?");
        System.out.println("Você vê diante de sua frente um hibrido cachorro com chifre de veado");
        System.out.println("1)atacar 2)Entrevistar");
        
        
        String opcao = teclado.next();
        try {
            EscolhasJogador(opcao,"Atacar","Entrevistar");
        } catch (Exception ex) {
            Logger.getLogger(TerraClownPlanet.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }
    
    public void Historia2() {
        //jogador.itens();
        System.out.println("Não tem nada na minha mochila");
        System.out.println("1) explorar 2)revirar meus itens");
        Scanner teclado = new Scanner(System.in);
        String opcao = teclado.next();
        try {
            escolhas.EscolhasJogador(opcao);
        } catch (Exception ex) {
            Logger.getLogger(TerraClownPlanet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //System.out.println(personagem.getNome()+ ": "+ );
    }
    public void Atacar(){
    
        System.out.println("atacando");
    }
    public void limpar(){
    System.out.println("\n\n\n");
    
    }
    
    
    public void Entrevistar() {
        
        limpar();
        slowPrint("Jogador: Boa noite, Sr...? " );
        slowPrint("Annie: Pode me chamar de Annie, com 2 ''N''");
        slowPrint("Jogador: "+"Se importa se eu entrevistar voce pra um video no meu espaçocast?");
        slowPrint("Annie: Pode ser, estou animada! Sempre quis fazer um espaçocast!");
        slowPrint("Jogador: "+" Seja bem vinda, 1) O que faz nessa floresta tão densa e perigosa?  2) Que tipo de criatura você é?");
        //EscolhaFalas(teclado.nextInt(),"pergunta1","pergunta2");
        EscolhaFalas(teclado.nextInt(),
            "Eu vivo aqui, aqui é minha casa, temos uma comunidade aqui perto cheio de seres inteligentes com historia pra contar. \n" + "Você quer que eu te conte algumas histórias? \n" + "1)Sim 2)Não" + 
                    EscolhaFalas(teclado.nextInt()
                            ,"Sim, porfavor, me conte \n" +" Tem uma historia de uma menininha que morre de medo de dormir no escuro, e ela fica chamando a mae dela. a mae vem e diz jesus esta aqui com vc. Não tenha medo. E a criança diz ''Preciso de alguém com pele.'' E então enquanto ela não tiver alguém com pele e sentir medo, ela morre! Inclusive, vc gostaria de enfrentar seu medo comigo? "  + 
                                    EscolhaFalas(teclado.nextInt(),"Eba, vamos nessa! ","Vamos continuar,Que tipo de criatura você é? \n " + "Annie: Sou um híbrido cachorro nobre e pacífico! \n" + "Todos aqui são assim?\n" + "A guande maioria, existem apenas outros seres como os palhacinhos, eles não são muito amigáveis, mas são apetitosos...Vc gostaria de caçar alguns comigo? \n " )//aqui sim ou nao? 
                            ," Fica para uma próxima")  
            ,"Annie: Sou um híbrido cachorro nobre e pacífico! \n" + "Todos aqui são assim?\n" + "A guande maioria, existem apenas outros seres como os palhacinhos, eles não são muito amigáveis, mas são apetitosos...Vc gostaria de caçar alguns comigo? \n " + "1)Sim 2)Não" + 
                    EscolhaFalas(teclado.nextInt()
                            ,"Sim, vamos nessa!!! \n" 
                            ," Acho que não temos escolha, eles estão VINDO EM NOSSA DIREÇÃOOO!!!")); 
               // entra metodo atacar palhacinho para os Sim. E para os Não, ainda nao estou pronto. Mas muito obrigado Anne  !  ** A entrevista acabou **
               // se ele escolher nao quero ouvir uma historia, o personagem é atacado por palhacinhos. 
        
        EscolhaFalas(teclado.nextInt(),"pergunta","pergunta");
               
    }
    
    public static void slowPrint(String mensagem) {
        char[] chars = mensagem.toCharArray();
        // Print a char from the array, then sleep for 1/10 second
        for (int i = 0; i < chars.length; i++) 
        {
            System.out.print(chars[i]);
            try{
            Thread.sleep(30);
        }
            catch(InterruptedException e){
            e.printStackTrace();
        }
        }
        System.out.println(" ");
        
        
        
        /*
    for (int i = 0;i < mensagem.length(); i++){
        System.out.print(mensagem.charAt(i));
        try{
            Thread.sleep(30);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        */
    }
  
    
    
    
    
    public int EscolhaFalas(int opcao,String fala1,String fala2){
        do{
            switch(opcao){
            case 1:
                System.out.println(fala1);
                break;
            case 2:
                System.out.println(fala2);
                break;
            default:
                System.out.println("opção inválida");
                break;
                }
        }while (opcao != 1 || opcao != 2);
        return 1;
        

    }
    public int EscolhasJogador(String opcao,String metodo1,String metodo2) throws Exception 
    {
        TerraClownPlanet terraClownPlanet = new TerraClownPlanet();
        String resposta;
        //System.out.println("Escolha entre 2)floresta   2)entrevista");
        //System.out.print("Opção: ");
        if(opcao == "1"){
            resposta = metodo1;
            System.out.println("executa metodo 1");
        }
        else{
            resposta = metodo2;
            System.out.println("executa metodo 2");
        }
        
        java.lang.reflect.Method method;       
        method = terraClownPlanet.getClass().getMethod(resposta);
        method.invoke(terraClownPlanet);
        return 0;
    
    }
    /*
     public int Escolhas(int opcao,String metodo,String metodo2) throws NoSuchMethodException{
        
        do{
            java.lang.reflect.Method method;      
            
            switch(opcao){
                case 1:
                        method = terraClownPlanet.getClass().getMethod(metodo);
                        System.out.println("escolhi metodo 1");
                        
                        
                    break;
                case 2:
                        method = terraClownPlanet.getClass().getMethod(metodo2);
                        System.out.println("escolhi metodo 1");
                    break;
                case 0:
                        break;
                default:
                    System.out.println("opção inválida");
                    
                    break;
            }
        }while (opcao != 0 || opcao != 1 || opcao != 2);
        return 0;
    }
        */
            /*
     Quests quests = new Quests();
        System.out.println("Escolha entre 1)Terra 4-169 1   2)Universo 2  ou  3)Universo 3 ");
        System.out.print("Opção: ");
        String opcao = new java.util.Scanner(System.in).next();
        java.lang.reflect.Method method;       
        method = quests.getClass().getMethod("quest" + opcao);
        method.invoke(quests);
    */ 
}
