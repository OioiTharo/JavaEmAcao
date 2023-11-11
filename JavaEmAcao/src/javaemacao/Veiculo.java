
package javaemacao;

class Veiculo extends Motor {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    
    public Veiculo(int qtdPist, int potencia, String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas){
        super(qtdPist, potencia);
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
    }
    
    public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }
    
    public String getmarca(){
        return marca;
    }
    
    public void setmarca(String marca){
        this.marca = marca;
                
    }
    
    public String getmodelo(){
        return modelo;
    }
    
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getcor(){
        return cor;
    }
    
    public void setcor(String cor){
        this.cor = cor;
    }
    
    public float getvelocMax(){
        return velocMax;
    }
    
    public void setvelocMax(float velocMax){
        this.velocMax = velocMax;
    }
    
    public int getqtdRodas(){
        return qtdRodas;
    }
    
    public void setqtdRodas(int qtdRodas){
        this.qtdRodas = qtdRodas;
    }
}
