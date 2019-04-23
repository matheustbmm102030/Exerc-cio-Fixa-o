
public class TestaFuncionarioV1 {
    public static void main(String[] args){
        
        FuncionarioV1 F1 = new FuncionarioV1();
        F1.RG= "172352353";
        F1.ativo=true;
        F1.departamento="Cobranças";
        F1.entradaBanco="22.04.2019";
        F1.funcionario="Evangivaldo";
        F1.salario=2000;
        
        
        F1.bonifica(5);
        System.out.println(F1.salario);

        F1.demite();
        System.out.println(F1.ativo); 
    }
}


