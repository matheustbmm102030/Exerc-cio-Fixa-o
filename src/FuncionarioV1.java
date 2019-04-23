
public class FuncionarioV1 {
    
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
}

