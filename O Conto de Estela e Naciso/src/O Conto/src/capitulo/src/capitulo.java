public class capitulo {
   String título; //atributos do capítulo
   String texto;
   Personagem personagem;
   int alteracaoCoragem;
   String pergunta;
   String escolha1;
   String escolha2;

   capitulo (String título, String texto, Personagem personagem, int alteracaoCoragem, 
   String pergunta, String escolha1, String escolha2){ //construtor com parâmetros

    this.título = título;
    this.texto = texto;
    this.personagem = personagem;
    this.alteracaoCoragem = alteracaoCoragem;
    this.pergunta = pergunta;
    this.escolha1 = escolha1;
    this.escolha2 = escolha2;
    
}

    void mostrar (){ //método void sem retorno para mostrar as atribuições de e em cada cap.
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
}