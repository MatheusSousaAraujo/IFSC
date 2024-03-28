package jogodetabuleiro;

public class Dado {

    public Dado(){
        rolar();
    }
   
    public int getNumeroAtual() {
        return numeroAtual;
    }
    
    public void setNumeroAtual(int numeroAtual) {
        this.numeroAtual = numeroAtual;
    }
    private int numeroAtual;
    
    public int rolar(){
        numeroAtual=(int)(Math.random()*6) +1 ;
            return numeroAtual;
    }
}
