package refactoringExcercise;

final class BagImpl implements Bag {
	/**
	 * 
	 */
	private final BagExample example;

	/**
	 * @param bagExample
	 */
	BagImpl(BagExample bagExample) {
		this.example = bagExample;
	}

	Object o;

	public Object get() {
		return o;
	}

	public void set(Object o) {
		this.o = o;
	}
}