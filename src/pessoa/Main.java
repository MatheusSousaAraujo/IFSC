
package pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa estudante = new Trabalhador("Maria","F",0);
        Pessoa trabalhador = new Trabalhador ("Carlos","M",2);
        
        estudante.trabalho();
        trabalhador.trabalho();
        
        trabalhador.alterarNome("Carlos Eduardo");
        System.out.println(trabalhador.toString());
    }
}
