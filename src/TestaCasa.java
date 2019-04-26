
public class TestaCasa {
    public static void main(String[] args){
        
        Porta P1=new Porta();
        P1.aberta=false;
        P1.cor="marrom";
        P1.dx=5;
        P1.dy=40;
        P1.dz=0.2;
        
        Porta P2=new Porta();
        P2.aberta=false;
        P2.cor="azul";
        P2.dx=5;
        P2.dy=40;
        P2.dz=0.2;
        
        Porta P3=new Porta();
        P3.aberta=false;
        P3.cor="preta";
        P3.dx=5;
        P3.dy=40;
        P3.dz=0.2;
        
        Casa C1=new Casa();
        C1.cor="Vermelha";
        C1.porta1=P1;
        C1.porta2=P2;
        C1.porta3=P3;
        
        C1.pinta("Preto");
        P1.fecha();
        P2.abre();
        P3.fecha();
        
        System.out.println(C1.quantasPortasEstaoAbertas());
    }
}
