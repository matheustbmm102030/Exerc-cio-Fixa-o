
public class MainProduto {
    public static void main(String[] args){
        
        Produto p1=new Produto();
        p1.nome="to nem ae";
        p1.preco=100;
        
        System.out.println(p1.nome);
        p1.diminuir10();
        System.out.println(p1.preco);
        p1.aumenta25();
        System.out.println(p1.preco);
        
    }
}
