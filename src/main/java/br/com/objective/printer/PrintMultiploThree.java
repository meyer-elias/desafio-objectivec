package br.com.objective.printer;

import br.com.objective.checker.MultiploAbstractChecker;
import br.com.objective.checker.MultiploCheckerThree;
import java.util.Objects;

public class PrintMultiploThree extends ChainPrintable {

	private final MultiploAbstractChecker checkerThree;

	public PrintMultiploThree(Printable nextPrintable) {
		super(nextPrintable);
		this.checkerThree = new MultiploCheckerThree();
	}

	@Override
	public String print(Integer numero) {
		String result = "";

		if (checkerThree.isMultiplo(numero)) {
			result = checkerThree.output();
		}

		if (Objects.nonNull(nextPrintable)) {
			result += nextPrintable.print(numero);
		}

		return result;
	}
}
