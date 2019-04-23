
public class FuncionarioV4 {
    
    String funcionario;
    String departamento;
    double salario;
    Data entradaBanco;
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
        System.out.println(entradaBanco.dia +"/"+ entradaBanco.mes +"/"+ entradaBanco.ano);
        System.out.println(RG);
        System.out.println(ativo);
    }

    void Equals(FuncionarioV4 test){
        if((this.RG.equals(test.RG))&&(this.funcionario.equals(test.funcionario))){
            System.out.println("Funcionario ja existente");
        }
        else{
            System.out.println("Funcionarios distintos");
        }
        }
    }

