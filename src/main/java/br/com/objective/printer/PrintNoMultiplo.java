package br.com.objective.printer;

import br.com.objective.checker.MultiploAbstractChecker;
import br.com.objective.checker.MultiploCheckerFive;
import br.com.objective.checker.MultiploCheckerThree;

public class PrintNoMultiplo extends ChainPrintable {

	private final MultiploAbstractChecker checkerThree;
	private final MultiploAbstractChecker checkerFive;

	public PrintNoMultiplo(Printable nextPrintable) {
		super(nextPrintable);
		this.checkerThree = new MultiploCheckerThree();
		this.checkerFive = new MultiploCheckerFive();
	}

	@Override
	public String print(Integer numero) {
		String result = "";
		if (!checkerThree.isMultiplo(numero) &&
			!checkerFive.isMultiplo(numero)) {
			result = numero.toString();
		}

		return result;
	}
}
