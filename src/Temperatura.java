
public class Temperatura {
    
    double converterParaFarenheit(double tc){
        double tf;
        tf=((tc/5)*9)+32;
        return tf;
    }
    
    double converterParaCelsius(double tf){
       double tc;
       tc=((tf-32)/9)*5;
       return tc;
    }
}
