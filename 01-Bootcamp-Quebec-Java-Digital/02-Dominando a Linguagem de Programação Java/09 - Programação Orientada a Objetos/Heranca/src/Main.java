public class Main {
    public static void main(String[] args) {

        // Criação de Objetos
        Veiculo veiculo1 = new Veiculo();

        veiculo1.setCor("Vermelho");
        veiculo1.setModelo("Fiat");
        veiculo1.setCapacidadeTanque(55);


        System.out.println(veiculo1.getModelo());
        System.out.println(veiculo1.getCor());
        System.out.println(veiculo1.getCapacidadeTanque());
        System.out.println(veiculo1.totalValorTanque(5.98));

        // Criação Objeto 2

        Veiculo veiculo2 = new Veiculo("Cinza", "Mercedes-Benz Classe C ", 66);

        System.out.println(veiculo2.getModelo());
        System.out.println(veiculo2.getCor());
        System.out.println(veiculo2.getCapacidadeTanque());
        System.out.println(veiculo2.totalValorTanque(6.98));
    }
}