
package cliente;

public class Cliente {

    public static void main(String[] args) {
       FormaGeometrica f = new Circulo(2);
        System.out.println("Area Circulo " + f.calcularArea());
        
       f = new Quadrado(3);
        System.out.println("Area Quadrado " + f.calcularArea());
        
      
    }
    
}
