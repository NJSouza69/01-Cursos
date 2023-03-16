public class Main {

    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5d,5d);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

        double areaLosango = Quadrilatero.area(5f,5f);
        System.out.println("Área do losango:" + areaLosango);

    }
}