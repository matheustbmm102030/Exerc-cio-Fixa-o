
public class TestaFuncionarioV3 {
    
        public static void main(String[] args){
        
        FuncionarioV3 F3 = new FuncionarioV3();
        F3.RG= "1683384687";
        F3.ativo=true;
        F3.departamento="Vendas";
        Data data1=new Data();
        data1.dia=23;
        data1.mes=04;
        data1.ano=2019;
        F3.entradaBanco=data1;
        F3.funcionario="Querolayne";
        F3.salario=3000;
        
        
        F3.bonifica(3);
        F3.demite();
        F3.mostrar();

        
}
    
}
