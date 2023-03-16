public class Main {

    // Exercício 01


    public static void main(String[] args) {

        int i;
//        int 1;
        int I;
//        int_1a;
        int _1a;                            // Não recomendado
        int $aq;                            // Não recomendado

        i = 5;
        I = 10;
        _1a = 20;                           // Não recomendado
        $aq = 7;                            // Não recomendado

        final int j = 10;
//        j = 15;                           // Definida como constante não é possivel alterar valor
        int asrn24678md;
//        int asrn246 78md;                 // Erro de conceito
        int asrn24678_md;
//        int asrn246%78_md;                // Erro de conceito

        int quantidadeProduto =50;
        int QuantidadeProduto;              // Não recomendado
        final int NUMERO_TENTATIVAS = 5;
        final int numeroTentativas = 5;     // Não recomendado
        int QUANTIDADE_OPCOES = 25;         // Não recomendado
        int qtdProd;                        // Não recomendado

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
//        System.out.println(asrn24678md);  // Variáveis não inicializadas
//        System.out.println(asrn24678_md); // Variáveis não inicializadas

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }

    // Exercício 02

    public class TiposVariaveis {

        byte b1 =10;
        byte b2 =20;

        short s1 = 20000;
//    short s2 = 40000;                       // Estoura o limite da variavel declarada

        //    int i1 = 10000000000;                   // Estoura o limite da variavel declarada
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004000000000000000L;

        //    float f1 = 4.5;                           // Falta deffinir o tipo de variavel no final
        float f2 = 10.68F;

        double d1 = 85.69;                           // Opcional deffinir o tipo de variavel no final
        double d2 = 99.84D;

        char c1 = 'W';
        //   char c2 = 'Tw';                            // Somente um carcter
        char c3 = '\u0057';                          // Caracter padrão ASCII

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "Texto descritivo de dados é permitido";

//    String dt1 = "Fulano";


        boolean bo1 = true;
        boolean bo2 = false;

//    System.out.println(b1);

    }
// Exercício 03


}