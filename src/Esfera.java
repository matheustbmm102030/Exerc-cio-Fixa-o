
public class Esfera {
    double raio;
    
    double volume(){
        double total;
        total= (4/3)*3.14*Math.pow(this.raio, 3);
        return total;
    }
}
