
package javaemacao;

class Carga extends Veiculo {
    private int cargaMax;
    private int tara;
    
    public Carga(){
        super(0, 0, "", "", "", "", 0.0f, 0);
        this.cargaMax = 0;
        this.tara = 0;
    }
    
    public int getcargaMax() {
        return cargaMax;
    }

    public void setcargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
    
    public int gettara(){
        return tara;
    }
    public void settara(int tara){
        this.tara = tara;
    }
    
    public float calcVel() {
        return getvelocMax() * 100000 / 3600;
    }
}
