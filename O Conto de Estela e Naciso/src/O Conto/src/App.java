import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner escaneador = new Scanner (System.in);

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
            "prosseguir e ir alem",
            escaneador); //passando o escaneador como parâmetro para todos os capítulos

        capitulo capB1 = new capitulo(
            "TRAUMAS", 
            "Apesar de querer ir além\n" +
            "Recordo como da paixão é ser refém\n" +
            "E da promessa de me entregar a ninguém\n" +
            "Resolvi fazer jus e esquecer de um provável porém\n", 
            Narciso,
            -100,
            null,
            null,
            null, //passando o parâmetro como nulo
            escaneador);

        capitulo capB2 = new capitulo(
            "LISBELA E O PRISIONEIRO", 
            "Ela era bela\n" +
            "Tão bela quanto a energia dela\n" +
            "Mesmo à distância sentia sua confiança\n" + 
            "E o sorriso, ah…\\n" +
            "Por ele me faria o prisioneiro se ela fosse a Lisbela\n", 
            Narciso,
            15,
            "\nO que pensar?\n", 
            "a vida não e uma novela", 
            "quem e ela?",
            escaneador);
         
        capitulo capC1 = new capitulo(
            "CAETANO ME AVISOU", 
            "Essa reflexão me lembrou Caetano\n" +
            "E ele me lembrou que me encontrar ainda estou tentando\n" +
            "Então passado alguns segundo me peguei cogitando\n" +
            "Talvez a melhor opção seja seguir SOZINHO o meu plano\n", 
            Narciso,
            -100, 
            null, 
            null,
            null,
            escaneador);

        capitulo capC2 = new capitulo(
            "QUEM É ELA", 
            "E como diria Baco\n" + 
            "\n\"Quem é ela? Quem é ela?\"\n" +
            "Reflexivo acendi um cigarro\n" +
            "Até que ouvi gritarem um nome\n" +
            "Estela\n",
            Narciso,
            15, 
            null, 
            null, 
            null,
            escaneador);
    
        capA.mostrar();
        int escolha = capA.escolher(); //guada a escolha na variável de tipo int

        if (escolha == 1){ //comparando a escolha      
            capB1.mostrar();  
        }

        else if (escolha == 2){ //.equals é uma maneira de comparar string já que esse tipo não é primitivo não podendo assim usar ==
            capB2.mostrar();
            escolha2 = capB2.escolher(); 

            if (escolha2 == 1){        
                capC1.mostrar();
            }
            else if(escolha2 == 2){
                capC2.mostrar();
            }
            }

        else{
            System.out.println("\nOpção incorreta");
        }
        escaneador.close();
}
}
