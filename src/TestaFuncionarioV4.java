
public class TestaFuncionarioV4 {
     public static void main(String[] args){
        
        FuncionarioV4 F4 = new FuncionarioV4();
        F4.RG= "000333666";
        F4.ativo=true;
        F4.departamento="ocultimo";
        Data data2=new Data();
        data2.dia=30;
        data2.mes=02;
        data2.ano=2012;
        F4.entradaBanco=data2;
        F4.funcionario="Morninstar";
        F4.salario=2666.66;
        
        F4.bonifica(3);
        F4.demite();
        F4.mostrar();
        
        FuncionarioV4 F41 = new FuncionarioV4();
        F4.RG= "666333000";
        F4.ativo=false;
        F4.departamento="ocultimo";
        Data data21=new Data();
        data21.dia=32;
        data21.mes=01;
        data21.ano=1999;
        F4.entradaBanco=data21;
        F4.funcionario="Belzi";
        F4.salario=2666.66;
        
        F4.Equals(F41);
        F4.Equals(F4);
}
}