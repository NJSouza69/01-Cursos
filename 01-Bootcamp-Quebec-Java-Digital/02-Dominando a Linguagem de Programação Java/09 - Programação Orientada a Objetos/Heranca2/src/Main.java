public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        // Upcast implicito
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcast de forma explícita (evitar vide aula 06 de Herança)
//        Vendedor vendedor1 = (Vendedor) new Funcionario();

    }
}