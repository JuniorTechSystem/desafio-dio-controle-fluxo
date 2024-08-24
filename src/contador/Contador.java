package contador;

import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException(String mensagem) {
		super(mensagem);
	}
}

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();

		try {
			contagemParametro(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {

			System.out.println(e.getMessage());
		}
		terminal.close();
	}

	public static void contagemParametro(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		int contagem = parametroDois - parametroUm;

		for (int i = parametroUm; i < parametroDois; i++) {
			
			System.out.println("Imprimindo o número: " + contagem );
			contagem++;
			
			
		}
	}
}
