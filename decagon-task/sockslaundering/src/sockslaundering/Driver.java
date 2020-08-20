package sockslaundering;

public class Driver {

	public static void main(String[] args) {
		SockLaundry s = new SockLaundry();
		
		int[] cleanPile = new int[] { 50, 50, 50, 37, 38, 37, 49, 39, 38, 45, 43 };
		int[] dirtyPile = new int[] { 50 };
		int i = s.getMaximumPairOfSocks(20, cleanPile, dirtyPile);
		System.out.println(i);

	}

}
