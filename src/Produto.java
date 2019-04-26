
public class Produto {
    
    String nome;
    double preco;
    
    void diminuir10(){
        this.preco-=this.preco*0.10;
    }
    
    void aumenta25(){
        this.preco+=this.preco*0.25;
    }
}
