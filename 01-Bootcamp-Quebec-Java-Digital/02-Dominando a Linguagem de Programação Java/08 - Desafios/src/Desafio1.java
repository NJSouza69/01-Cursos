public class Desafio1 {
    public static void main(String[] args) {
    // TODO: Crie um Array de números inteiros:
    int[] listaNumeros = {2,3,5,7,11,13,18,34};
        
    // TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:
        for (int i = 0 ; i < listaNumeros.length ; i++){
            if (listaNumeros[i]%2 == 0){
                System.out.println(listaNumeros[i]);
            }
        }
    }
       
}
