package pessoa;

public class Trabalhador extends Pessoa{
    private int empId;

    public Trabalhador(String nome, String sexo, int empId) {
        super(nome, sexo);
        this.empId = empId;
        
    }

    @Override
    public void trabalho() {
        if (empId == 0){
            System.out.println("Não trabalha");
        }else {
            System.out.println("Está empregado");
        }
        
    }
    
}

