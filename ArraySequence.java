import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
	int currentIndex;
	int []data;

	public ArraySequence(int[] other) {
		data = new int[other.length];
		for (int i = 0; i < other.length; i++) {
			data[i] = other[i];
		}
		currentIndex = 0;
	}
	public ArraySequence(IntegerSequence othersq) {
		othersq.reset();
		// The following datatemp code is no longer necessary. Originally, I misread
		// the part where ALL values would be copied, and assumed that partially-consumed
		// sequences' consumed values would not be copied, necessitating this code:
		/*
			int[] datatemp = new int[othersq.length()];
			int i = 0;
			while (othersq.hasNext()) {
				datatemp[i] = othersq.next();
				i++;
			}
			data = new int[i];
			for (int j = 0; j < data.length; j++) {
				data[j] = datatemp[j];
			}
		*/
		data = new int[othersq.length()];
		int i = 0;
		while (othersq.hasNext()) {
		 data[i] = othersq.next();
		 i++;
		}
		currentIndex = 0;
		othersq.reset();
	}

	public void reset() {
		currentIndex = 0;
	}
	public int length() {
		return data.length;
	}
	public boolean hasNext() {
		return currentIndex < data.length;
	}
	public int next() throws NoSuchElementException {
		if (currentIndex >= data.length) throw new NoSuchElementException("No such element");
		currentIndex++;
		return data[currentIndex - 1];
	}
}
