import java.util.*;
// 선택 정렬로 해결 -> 시간초과 (코드 찾아서 작성함.)
public class baek_2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		baek_2751 bk = new baek_2751();
		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}

		bk.selectionSort(array);

		for(int i=0; i<n; i++) {
			System.out.println(array[i]);
		}

		sc.close();
	}
// 선택 정렬 메소드 
	private static void selectionSort(int[] arr) {
		int size = arr.length;
		int min;
		int temp;

		for(int i=0; i<size-1; i++) {
			min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
// 시간 초과로 아래 적혀진 코드로 작성함.
	//	public static void main(String[] args) {
	//
	//		Scanner sc = new Scanner(System.in);
	//		StringBuilder sb = new StringBuilder();
	//
	//		int n = sc.nextInt();
	//
	//		ArrayList<Integer> list = new ArrayList<>();
	//
	//		for(int i=0; i<n; i++) {
	//			list.add(sc.nextInt());
	//		}
	//
	//		Collections.sort(list);
	//
	//		for(int value : list) {
	//			sb.append(value).append('\n');
	//		}
	//		System.out.println(sb);
	//		
	//		sc.close();
	//	}

}
