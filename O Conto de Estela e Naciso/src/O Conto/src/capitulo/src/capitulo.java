import java.util.Scanner;

public class capitulo {
   String título; //atributos do capítulo
   String texto;
   Personagem personagem;
   int alteracaoCoragem;
   String pergunta;
   String escolha1;
   String escolha2;
   Scanner escaneador;

   capitulo (String título, String texto, Personagem personagem, int alteracaoCoragem, 
   String pergunta, String escolha1, String escolha2, Scanner escaneador){ //construtor com parâmetros

    this.título = título;
    this.texto = texto;
    this.personagem = personagem;
    this.alteracaoCoragem = alteracaoCoragem;
    this.pergunta = pergunta;
    this.escolha1 = escolha1;
    this.escolha2 = escolha2;
    this.escaneador = escaneador;
    
}

    void mostrar (){ //método void sem retorno para mostrar as atribuições de e em cada cap.
        System.out.println("\n______________________________________\n");
        System.out.println(this.título);
        System.out.println("______________________________________\n\n");
        System.out.println(this.texto);
        this.personagem.alterarCoragem(this.alteracaoCoragem);
        if(this.pergunta != null){
        System.out.println(this.pergunta);
        }
        if (this.escolha1 != null){
        System.out.println("-" + this.escolha1);
        }
        if (this.escolha2 != null){
        System.out.println("-" + this.escolha2);
        }      
    }

    int escolher (){
        int escolha = -1; //um valor para representar um caso de erro

        if (escolha1 != null && escolha2 != null){
            Scanner escaneador = new Scanner(System.in); //capturar a entrada do usuário com a variável do tipo Scanner que se chama escaneador
            String escolhaDigitada = escaneador.nextLine(); //capturar o que o usuário escolheu/escreveu

            if (escolhaDigitada.equals(escolha1)){
                escolha = 1;
            }

            else if (escolhaDigitada.equals(escolha2)){
                escolha = 2;
            }
        escaneador.close(); //fechando o escaneador
        }
        return escolha;
    }
}