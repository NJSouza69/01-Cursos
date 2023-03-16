public class rodarAplicacao {
    public static void main(String[] args) {

        // Criação de Objetos
        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("Fiat");
        carro1.setCapacidadeTanque(55);


        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.98));

        // Criação Objeto 2

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.98));

        
    }
}
