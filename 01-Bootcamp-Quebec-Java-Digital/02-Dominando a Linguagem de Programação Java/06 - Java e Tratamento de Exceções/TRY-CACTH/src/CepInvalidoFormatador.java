public class CepInvalidoFormatador {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("8157017");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e){
            System.out.println("O CEP náo corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
        throw new CepInvalidoException();
        // simulando um cep formatado

        return "81.520-350";

    }
}
