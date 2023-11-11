
package javaemacao;

class Motor{
    private int qtdPist;
    private int potencia;

    public Motor(int qtdPist, int potencia){
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }
    
    public int getqtdPist() {
        return qtdPist;
    }

    public void setqtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }
    
    public int getpotencia(){
        return potencia;
    }
    
    public void setpotencia(int potencia){
        this.potencia = potencia;
    }
    
}