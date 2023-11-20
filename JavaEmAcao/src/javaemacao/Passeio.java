
package javaemacao;

class Passeio extends Veiculo{
    private int qtdPassageiros;
    
    public Passeio() {
        super(0, 0, "", "", "", "", 0.0f, 0);
        this.qtdPassageiros = 0;
    }
    
    public int getqtdPassageiros(){
        return qtdPassageiros;
    }
    public void setqtdPassageiros(int qtdPassageiros){
        this.qtdPassageiros = qtdPassageiros;
    }
    
    public float calcVel() {
        return getvelocMax() * 1000 / 3600;
    }
}
