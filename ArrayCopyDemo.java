class ArrayCopyDemo {
	public static void main(String[] args) {
		char[] copyFrom = {'d', 'e', 'c', 'a','f', 'f',
		 'e', 'i', 'n', 'a', 't', 'e', 'd'};

		 // char[] copyTo = new char[7];

		 // System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		 // shortened syntax using java.util.Arrays
		 char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

		 System.out.println(new String(copyTo));
	}
}