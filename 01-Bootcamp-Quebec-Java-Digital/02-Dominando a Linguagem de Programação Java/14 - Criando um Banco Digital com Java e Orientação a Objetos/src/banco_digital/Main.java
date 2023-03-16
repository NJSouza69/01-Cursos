package banco_digital;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		menu();
		
		while (true) {
	        int num = Integer.parseInt(extracted().nextLine());
	        
	        switch (num) {
	        	case 1:{
	        		System.out.println("LISTA DE CLIENTES");
	        		break;
	        	}
	        	case 2:{
	        		cc.depositar(100);
	        		break;
	        	}
	            case 3:{
	        		cc.sacar(50);
	                break;
	            }
	            case 4:{
	        		cc.transferir(32, poupanca);
	                break;
	            }
	            case 5:{
	        		cc.imprimirExtrato();
	        		poupanca.imprimirExtrato();
	                break;
	            }
			}
			if (num == 9) break;
		}
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
	
	static void menu() {
		System.out.println("== Escolha uma Opção ==");
		System.out.println("<1> - Listagem de Clientes");
		System.out.println("<2> - Depositar");
		System.out.println("<3> - Sacar");
		System.out.println("<4> - Transferência");
		System.out.println("<5> - Extrado Bancário");
		System.out.println("<9> - Finaliza Programa");		
	}
	
/*	static void menu() {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(32, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}*/
	
}
