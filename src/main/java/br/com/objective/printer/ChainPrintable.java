package br.com.objective.printer;

public abstract class ChainPrintable implements Printable {

	protected final Printable nextPrintable;

	protected ChainPrintable(Printable nextPrintable) {
		this.nextPrintable = nextPrintable;
	}

	@Override
	public String print(Integer numero) {
		return nextPrintable.print(numero);
	}
}
