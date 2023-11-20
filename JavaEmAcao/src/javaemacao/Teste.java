
package javaemacao;

public class Teste {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Passeio passeio = new Passeio();
            passeio.setplaca("ABC123" + i);
            passeio.setmarca("Marca" + i);
            passeio.setmodelo("Modelo" + i);
            passeio.setcor("Cor" + i);
            passeio.setvelocMax(120.0f + i * 10);
            passeio.setqtdRodas(4);
            passeio.setqtdPassageiros(5 + i);

            System.out.println("Detalhes do Veículo de Passeio " + i + ":");
            System.out.println("Placa: " + passeio.getplaca());
            System.out.println("Marca: " + passeio.getmarca());
            System.out.println("Modelo: " + passeio.getmodelo());
            System.out.println("Cor: " + passeio.getcor());
            System.out.println("Velocidade Máxima: " + passeio.getvelocMax() + " km/h");
            System.out.println("Quantidade de Rodas: " + passeio.getqtdRodas());
            System.out.println("Quantidade de Passageiros: " + passeio.getqtdPassageiros());
            System.out.println("Velocidade Convertida: " + passeio.calcVel() + " m/h");
            System.out.println("------------");
        }

        for (int i = 1; i <= 5; i++) {
            Carga carga = new Carga();
            carga.setplaca("XYZ789" + i);
            carga.setmarca("Marca" + i);
            carga.setmodelo("Modelo" + i);
            carga.setcor("Cor" + i);
            carga.setvelocMax(80.0f + i * 10);
            carga.setqtdRodas(8);
            carga.setcargaMax(500 + i * 100);
            carga.settara(200 + i * 20);
            
            System.out.println("Detalhes do Veículo de Carga " + i + ":");
            System.out.println("Placa: " + carga.getplaca());
            System.out.println("Marca: " + carga.getmarca());
            System.out.println("Modelo: " + carga.getmodelo());
            System.out.println("Cor: " + carga.getcor());
            System.out.println("Velocidade Máxima: " + carga.getvelocMax() + " km/h");
            System.out.println("Quantidade de Rodas: " + carga.getqtdRodas());
            System.out.println("Carga Máxima: " + carga.getcargaMax() + " kg");
            System.out.println("Tara: " + carga.gettara() + " kg");
            System.out.println("Velocidade Convertida: " + carga.calcVel() + " cm/h");
            System.out.println("------------");
        }
    }
    
}
