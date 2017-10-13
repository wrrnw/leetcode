package array;

public class TestMain {
	public static void main(String[] args) {
		P35_SearchInsert a = new P35_SearchInsert();
		int[] b = {1, 3, 5, 6};
		System.out.println(a.searchInsert(b, 0));
		System.out.println(a.searchInsert(b, 2));
		System.out.println(a.searchInsert(b, 5));
		System.out.println(a.searchInsert(b, 7));
	}
}
