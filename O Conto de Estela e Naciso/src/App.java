import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String titulo = "\nO CONTO DE ESTELA E NARCISO";
        String textoCapituloA ="Naquela cidade pequena\n" + 
        "Sentia que pra mim não havia alguém\n" +
        "Até que um dia, reparei numa cena\n" +
        "E pensei em talvez existir um porém\n\n";
        String escolhaA1 = "nao existe um porem";
        String escolhaA2 = "prosseguir e ir alem";

        System.out.println(titulo);
        System.out.println("______________________________________\n\n");
        System.out.println(textoCapituloA);
        System.out.println("-" + escolhaA1);
        System.out.println("-" + escolhaA2);

        System.out.println("\nO que pensar?\n");
        Scanner escaneador = new Scanner(System.in); //capturar a entrada do usuário com a variável do tipo Scanner que se chama escaneador
        String escolha1 = escaneador.nextLine(); //capturar o que o usuário escolheu/escreveu

        if (escolha1.equals(escolhaA1)){ //comparando a escolha      
            System.out.println("\nApesar de querer ir além\n" +
            "Recordo como da paixão é ser refém\n" +
            "E da promessa de me entregar a ninguém\n" +
            "Resolvi fazer jus e esquecer de um provável porém\n\n");    
        }
        else if (escolha1.equals(escolhaA2)){ //.equals é uma maneira de comparar string já que esse tipo não é primitivo não podendo assim usar ==
            String textoCapituloB =("\nEla era bela\n" +
            "Tão bela quanto a energia dela\n" +
            "Mesmo à distância sentia sua confiança\n" + 
            "E o sorriso, ah…\n" +
            "Por ele me faria o prisioneiro se ela fosse a Lisbela\n\n");
            String escolhaB1 = "a vida não e uma novela";
            String escolhaB2 = "quem e ela?";

            System.out.println(textoCapituloB);
            System.out.println("-" + escolhaB1);
            System.out.println("-" + escolhaB2);
           
            System.out.println("\nO que pensar?\n");
            escaneador = new Scanner(System.in); //capturar a entrada do usuário com a variável do tipo Scanner que se chama escaneador
            String escolha2 = escaneador.nextLine(); 

            if (escolha2.equals(escolhaB1)){              
                System.out.println("\nEssa reflexão me lembrou Caetano\n" +
                "E ele me lembrou que me encontrar ainda estou tentando\n" +
                "Então passado alguns segundo me peguei cogitando\n" +
                "Talvez a melhor opção seja seguir SOZINHO o meu plano\n\n");
            }
            else if (escolha2.equals(escolhaB2)){
                System.out.println("\nE como diria Baco\n" + 
                "\"Quem é ela? Quem é ela?\"\n" +
                "Reflexivo acendi um cigarro\n" +
                "Até que ouvi gritarem um nome\n" +
                "Estela\n\n");
            }
            
        else{
            System.out.println("Opção incorreta");
        }
    escaneador.close();
    }
}
}

