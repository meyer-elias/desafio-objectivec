package br.com.objective;

import br.com.objective.printer.PrintMultiploFive;
import br.com.objective.printer.PrintMultiploThree;
import br.com.objective.printer.PrintNoMultiplo;
import br.com.objective.printer.Printable;

public class Main {

	static void main() {
		int minimo = 1;
		int maximo = 30;

		Printable printableMultiplos = new PrintMultiploThree(
			new PrintMultiploFive(new PrintNoMultiplo(null)));

		for (int i = minimo; i <= maximo; i++) {
			System.out.println("Imprime: " + printableMultiplos.print(i));
		}
	}
}
