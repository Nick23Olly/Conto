import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String titulo = "\n    O CONTO DE ESTELA E NARCISO\n" +
                          "            Capítulo 1            ";
        String resposta = "\nO que pensar?\n";
        String textocapA ="Naquela cidade pequena\n" + 
        "Sentia que pra mim não havia alguém\n" +
        "Até que um dia, reparei numa cena\n" +
        "E pensei em talvez existir um porém\n";
        String escolhaA1 = "nao existe um porem";
        String escolhaA2 = "prosseguir e ir alem";
        String textocapB1 = "\nApesar de querer ir além\n" +
        "Recordo como da paixão é ser refém\n" +
        "E da promessa de me entregar a ninguém\n" +
        "Resolvi fazer jus e esquecer de um provável porém\n";
        String textocapB2 = "\nEla era bela\n" +
        "Tão bela quanto a energia dela\n" +
        "Mesmo à distância sentia sua confiança\n" + 
        "E o sorriso, ah…\n" +
        "Por ele me faria o prisioneiro se ela fosse a Lisbela\n";
        String escolhaB2_1 = "a vida não e uma novela";
        String escolhaB2_2 = "quem e ela?";
        String textocapC1 = "\nEssa reflexão me lembrou Caetano\n" +
        "E ele me lembrou que me encontrar ainda estou tentando\n" +
        "Então passado alguns segundo me peguei cogitando\n" +
        "Talvez a melhor opção seja seguir SOZINHO o meu plano\n";
        String textocapC2 = "\nE como diria Baco\n" + 
        "\"Quem é ela? Quem é ela?\"\n" +
        "Reflexivo acendi um cigarro\n" +
        "Até que ouvi gritarem um nome\n" +
        "Estela\n";

        Personagem Narciso = new Personagem ("Narciso",100);
        Personagem Estela = new Personagem ("Estela", 100);

        System.out.println(titulo);
        System.out.println("______________________________________\n\n");
        System.out.println(textocapA);
        Narciso.alterarCoragem(100);
        System.out.println("-" + escolhaA1);
        System.out.println("-" + escolhaA2);
        System.out.println(resposta);

        Scanner escaneador = new Scanner(System.in); //capturar a entrada do usuário com a variável do tipo Scanner que se chama escaneador
        String escolha1 = escaneador.nextLine(); //capturar o que o usuário escolheu/escreveu

        if (escolha1.equals(escolhaA1)){ //comparando a escolha      
            System.out.println(textocapB1);
            Narciso.alterarCoragem(-101);  
        }

        else if (escolha1.equals(escolhaA2)){ //.equals é uma maneira de comparar string já que esse tipo não é primitivo não podendo assim usar ==
            System.out.println(textocapB2);
            Narciso.alterarCoragem(15);
            System.out.println("-" + escolhaB2_1);
            System.out.println("-" + escolhaB2_2);
            System.out.println(resposta);

            escaneador = new Scanner(System.in); //capturar a entrada do usuário com a variável do tipo Scanner que se chama escaneador
            String escolha2 = escaneador.nextLine(); 

            if (escolha2.equals(escolhaB2_1)){        
                System.out.println(textocapC1);
                Narciso.alterarCoragem(-101);
            }
            else if(escolha2.equals(escolhaB2_2)){
                System.out.println(textocapC2);
                Narciso.alterarCoragem(15);
                Estela.alterarCoragem(100);
            }
            }

        else{
            System.out.println("Opção incorreta");
        }
    escaneador.close();
}
}
