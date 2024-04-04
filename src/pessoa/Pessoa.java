package pessoa;

public abstract class Pessoa {
    
    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public abstract void trabalho();

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ":: sexo=" + sexo + '}';
    }
    
    public void alterarNome(String newNome){
        this.nome = newNome;
        
    }
}
