package AlteracoesNilson;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                // Mostra o erro no console
                e.printStackTrace();
                // Mostra mensagem com o comentario e o tipo de exception
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
            }
            finally {
                System.out.println("Chegou no finally!");
            }
        } while(continueLooping);


        System.out.println("O código continua...");
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}