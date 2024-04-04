package cliente;

public class Circulo implements FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI*raio*raio;
        //ou return Math.PI * Math.pow(raio,2);
        
    }

}
