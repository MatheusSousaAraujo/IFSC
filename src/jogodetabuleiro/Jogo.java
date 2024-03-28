package jogodetabuleiro;

import javax.swing.JOptionPane;


public class Jogo {
    private Tabuleiro meuTabuleiro;
    private Dado meuDado;
    private Jogador[] meusJogadores;
    private int proximoJogador;

    public Jogo(int numeroJogadores, int numeroCasas) {
        this.meuTabuleiro = new Tabuleiro(numeroCasas);
        this.meuDado = new Dado();
        this.meusJogadores = new Jogador[numeroJogadores];
        for (int i = 0; i < meusJogadores.length; i++) {
            this.meusJogadores [i] = new Jogador (i+1); 
        }
        this.proximoJogador = 0;
    }
    public void proximaJogada(){
        Jogador jogadorAtual = getMeusJogadores()[getProximoJogador()];
        jogadorAtual.jogar(meuDado); 
        
        if(jogadorAtual.getCasaAtual() >= getMeuTabuleiro().getNumeroCasas()){
        JOptionPane.showMessageDialog(null, "O jogador " +
                jogadorAtual.getMeuNumero()+ " venceu!");
    }
        proximoJogador++;
        if(proximoJogador >= meusJogadores.length){
            proximoJogador = 0 ;
           
        }
    }

    @Override
    public String toString() {
        String tabuleiro = "";
        String vazia = "";
        for (int i = 0; i < meuTabuleiro.getNumeroCasas(); i++) {
            tabuleiro += "=" ;
            vazia += "_";
            
        }
        String retorno = tabuleiro +"\n";
        for (Jogador jogador : meusJogadores) {
            String numJ = jogador.getMeuNumero()+ vazia;
            StringBuilder sb = new StringBuilder(numJ);
            
            if (jogador.getCasaAtual() < getMeuTabuleiro().getNumeroCasas())
                sb.setCharAt(jogador.getCasaAtual() + 1, 'X');
            else
                sb.setCharAt(getMeuTabuleiro().getNumeroCasas(), 'x');
           retorno +=sb + "\n";
        }
    return retorno;        
    }
    
    

    public Tabuleiro getMeuTabuleiro() {
        return meuTabuleiro;
    }

    public void setMeuTabuleiro(Tabuleiro meuTabuleiro) {
        this.meuTabuleiro = meuTabuleiro;
    }

    public Dado getMeuDado() {
        return meuDado;
    }

    public void setMeuDado(Dado meuDado) {
        this.meuDado = meuDado;
    }

    public Jogador[] getMeusJogadores() {
        return meusJogadores;
    }

    public void setMeusJogadores(Jogador[] meusJogadores) {
        this.meusJogadores = meusJogadores;
    }

    public int getProximoJogador() {
        return proximoJogador;
    }

    public void setProximoJogador(int proximoJogador) {
        this.proximoJogador = proximoJogador;
    }
    

}
