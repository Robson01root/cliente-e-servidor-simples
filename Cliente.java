package comunication;

import java.io.PrintStream;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) {
		
		
		
	try {
		//cliente
		Socket cliente = new Socket("127.0.0.1", 7000);
		System.out.println("cliente iniciado");
		
		//fluxo de dados a enviar
		PrintStream ps = new PrintStream(cliente.getOutputStream());
		
		ps.println("oooiiiiii");
		
		cliente.close();		
		System.out.println("cliente finalizado");
		
	}catch(Exception e) {
		System.out.println("erro");
	}

 }
}
