
public class FuncionarioV2 {
    
    String funcionario;
    String departamento;
    double salario;
    String entradaBanco;
    String RG;
    boolean ativo;

    void bonifica(double aumento){
        salario+=salario*(aumento/100);
    }
    void demite(){
        ativo=false;
    }
    
    void mostrar(){
        System.out.println(funcionario);
        System.out.println(departamento);
        System.out.println(salario);
        System.out.println(entradaBanco);
        System.out.println(RG);
        System.out.println(ativo);
    }
}

