
package javaemacao;

public class Teste {

    public static void main(String[] args) {
       Veiculo carrinho = new Veiculo(4,200,"FKA-5212","fiat","uno","roxo",250,4);
       
       System.out.println("Configurações do veiculo:");
       System.out.println("Quantidade de pistão: "+ carrinho.getqtdPist());
       System.out.println("Potencia: "+carrinho.getpotencia());
       System.out.println("Placa: "+carrinho.getplaca());
       System.out.println("Marca: "+carrinho.getmarca());
       System.out.println("Modelo:"+carrinho.getmodelo());
       System.out.println("Velocidade max: "+carrinho.getvelocMax());
       System.out.println("Quantidade de rodas: "+carrinho.getqtdRodas());
       
    }
    
}
