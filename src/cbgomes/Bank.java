package cbgomes;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Bank {

	public static void main(String[] args) {
		
		List<Transaction> tras = new  ArrayList<>();

		Client mario = new Client();
		mario.setId(1L);
		mario.setName("Mario Sergio");
		mario.setEmail("seucuca@gmail.com");
		mario.setPhone("242424242424");
		
		Client paulo = new Client();
		paulo.setId(1L);
		paulo.setName("Mario Sergio");
		paulo.setEmail("seucuca@gmail.com");
		paulo.setPhone("242424242424");
		
		Account accountMario = new Account();
		accountMario.setId(1L);
		accountMario.setNumber("0001-x");
		accountMario.setAgency("0001");
		accountMario.setClient(mario);
		accountMario.setBalance(500.00);
	
		
		Account accountPaulo = new Account();
		accountPaulo.setId(1L);
		accountPaulo.setNumber("0002-x");
		accountPaulo.setAgency("0002");
		accountPaulo.setClient(paulo);
		accountPaulo.setBalance(200.00);
		
		
		// Transferia DE MARIOOO SERGIO
		accountMario.transferencia(accountMario, 100.00);
		
		//Classezinha basica para formatar a data usando o metodo ofPattern que serve para isso.
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		//ForEach Basico para informar o resultado da lista
		accountMario.getTransacoes().forEach( x -> System.out.println("Tipo Transa��o ==== "+ x.getTypeTransaction()+ " " + "Horario === " + x.getDateTimeTrasaction().format(dt)));
	}

}
