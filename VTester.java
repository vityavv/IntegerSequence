public class VTester {
	public static void main(String[] args) {
		IntegerSequence r = new Range(10, 15);
		while(r.hasNext()) {
			System.out.print(r.next());
			if (r.hasNext()) {
				System.out.print(", ");
			}
		}
		System.out.println();

		int[] nums = {1, 3, 5, 0, -1, 3, 9};
		IntegerSequence as = new ArraySequence(nums);
		consumePrintIS(as);

		IntegerSequence empty = new ArraySequence(as);
		System.out.println("Blank line: ");
		consumePrintIS(as);

		IntegerSequence b = new ArraySequence(nums);
		b.next(); b.next(); b.next();
		IntegerSequence c = new ArraySequence(b);
		consumePrintIS(c);
	}
	public static void consumePrintIS(IntegerSequence as) {
		while(as.hasNext()) {
			System.out.print(as.next());
			if (as.hasNext()) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
