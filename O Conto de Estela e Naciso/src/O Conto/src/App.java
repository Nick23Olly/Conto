import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Personagem Narciso = new Personagem ("Narciso",100);
        Personagem Estela = new Personagem ("Estela", 100);

        capitulo capA = new capitulo(
            "O POSSÍVEL PORÉM",
            "Naquela cidade pequena\n" + 
            "Sentia que pra mim não havia alguém\n" +
            "Até que um dia, reparei numa cena\n" +
            "E pensei em talvez existir um porém\n", 
            Narciso,
            0,
            "\nO que pensar?\n", 
            "nao existe um porem", 
            "prosseguir e ir alem\n");

        capitulo capB1 = new capitulo(
            "\nTRAUMAS", 
            "\nApesar de querer ir além\n" +
            "Recordo como da paixão é ser refém\n" +
            "E da promessa de me entregar a ninguém\n" +
            "Resolvi fazer jus e esquecer de um provável porém\n", 
            Narciso,
            -100,
            null,
            null,
            null); //passando o parâmetro como nulo

        capitulo capB2 = new capitulo(
            "\nLISBELA E O PRISIONEIRO", 
            "\nEla era bela\n" +
            "Tão bela quanto a energia dela\n" +
            "Mesmo à distância sentia sua confiança\n" + 
            "E o sorriso, ah…\\n" +
            "Por ele me faria o prisioneiro se ela fosse a Lisbela\n", 
            Narciso,
            15,
            "\nO que pensar?\n", 
            "a vida não e uma novela", 
            "quem e ela?\n");
         
        capitulo capC1 = new capitulo(
            "\n CAETANO ME AVISOU", 
            "\nEssa reflexão me lembrou Caetano\n" +
            "E ele me lembrou que me encontrar ainda estou tentando\n" +
            "Então passado alguns segundo me peguei cogitando\n" +
            "Talvez a melhor opção seja seguir SOZINHO o meu plano\n", 
            Narciso,
            -100, 
            null, 
            null,
            null);

        capitulo capC2 = new capitulo(
            "\nQUEM É ELA", 
            "\nE como diria Baco\n" + 
            "\n\"Quem é ela? Quem é ela?\"\n" +
            "Reflexivo acendi um cigarro\n" +
            "Até que ouvi gritarem um nome\n" +
            "Estela\n",
            Narciso,
            15, 
            null, 
            null, 
            null);
    
        capA.mostrar();

        Scanner escaneador = new Scanner(System.in); //capturar a entrada do usuário com a variável do tipo Scanner que se chama escaneador
        String escolha1 = escaneador.nextLine(); //capturar o que o usuário escolheu/escreveu

        if (escolha1.equals(capA.escolha1)){ //comparando a escolha      
            capB1.mostrar();  
        }

        else if (escolha1.equals(capA.escolha2)){ //.equals é uma maneira de comparar string já que esse tipo não é primitivo não podendo assim usar ==
            capB2.mostrar();

            escaneador = new Scanner(System.in); //capturar a entrada do usuário com a variável do tipo Scanner que se chama escaneador
            String escolha2 = escaneador.nextLine(); 

            if (escolha2.equals(capB2.escolha1)){        
                capC1.mostrar();
            }
            else if(escolha2.equals(capB2.escolha2)){
                capC2.mostrar();
            }
            }

        else{
            System.out.println("Opção incorreta");
        }
    escaneador.close();
}
}
