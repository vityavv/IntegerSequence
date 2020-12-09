import java.util.NoSuchElementException;
public class Range implements IntegerSequence {
	private int start, end, current;
	public Range(int start, int end) {
		this.start = start;
		this.end = end;
		if (end < start) {
			/*
				this.end = start;
				this.start = end;
			*/
			throw new IllegalArgumentException("Can't have an end before the start!");
		}
		this.current = start;
	}
	public void reset() {
		current = start;
	}
	public int length() {
		return end - start + 1;
	}
	public boolean hasNext() {
		return current <= end;
	}

	public int next() throws NoSuchElementException {
		if (current > end) throw new NoSuchElementException("No such element");
		current++;
		return current - 1;
	}
}
