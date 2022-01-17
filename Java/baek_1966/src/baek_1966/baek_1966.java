package baek_1966;

import java.util.Arrays;
import java.util.Scanner;

public class baek_1966 {
	private static final int DEFAULT_CAPACITY = 64; // 최소(기본) 용적 크기
	
    private int front,rear, size;
    private Object[] array;
	
    public baek_1966() {
    	this.array = new Object[DEFAULT_CAPACITY];
		this.size = 0;
		this.front = 0;
		this.rear = 0;
	}
    
    public baek_1966 (int data) {
    	this.array = new Object[data];
    	this.size = 0;
		this.front = 0;
		this.rear = 0;
    }

	public void resize (int newData) {
    	int arrayData = array.length;
    	
    	Object[] newArray = new Object[newData];
    	
    	for (int i = 1, j = front + 1; i <= size; i++, j++) {
			newArray[i] = array[j % arrayData];
		}
 
		this.array = null;
		this.array = newArray; // 새 배열을 기존 array의 배열로 덮어씌움
 
		front = 0;
		rear = size;
    }
	
    public boolean queueisEmpty() {    // 큐가 비어 있을 때 
        if(front == 0  && rear == 0) {
            return true;
        }else {
            return false;
        }
    }
    
	public boolean push(int value) {  // 값 넣기 
		// 용적이 가득 찼을 경우 
		if((rear + 1) % array.length == front) {
			resize(array.length * 2);	// 용적을 두 배 늘려준다. 
		}
				
		rear = (rear + 1) % array.length;	// rear을 rear의 다음 위치로 갱신 
		
		array[rear] = value;
		size++;	// 사이즈 1 증가 
		
		return true;
    }
	
    public Integer pop() {    // 삭제 
        if(queueisEmpty()) {
            return null;
        }

        front = (front + 1) % array.length; // front 를 한 칸 옮긴다.
		
		int value = (int) array[front];	// 반환할 데이터 임시 저장 
		
		array[front] = null;	// 해당 front의 데이터 삭제
		size--;	// 사이즈 감소 
		
		return value;
    }
    
    public Integer peek() {   // 탐색 
        if(queueisEmpty()) {
            return null;
        }

        int value = (int) array[(front + 1) % array.length];
		return value;
    }
    
    public int size() {
    	return size;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 테스트 개수 입력받기
		int[] results = new int[t];
		sc.nextLine();
		
		for(int i = 0; i < t; i++) { //테스트 개수만큼 반복

			String input = sc.nextLine();
			int count = 0;        // 출력 순서 체크 
			int n = Integer.parseInt(input.split(" ")[0]); // 문서의 개수 입력받기
			int m = Integer.parseInt(input.split(" ")[1]); // 위치를 알고자 하는 문서의 현재 위치
			
			input = sc.nextLine();
			
			baek_1966 queue = new baek_1966();// 문서의 중요도를 순서대로 담을 큐
			baek_1966 sortedQueue = new baek_1966();// 문서를 중요도 순으로 정렬 후 담을 큐 
			
			int[] sortedNumbers = new int[n];
			
			for(int j = 0; j < n; j++) { // 문서의 개수만큼 반복
				queue.push(Integer.parseInt(input.split(" ")[j]));
				sortedNumbers[j] = Integer.parseInt(input.split(" ")[j]);
			}
			
			Arrays.sort(sortedNumbers);    // sortedNumbers 배열 정렬 
			
			for (int j=0; j < n; j++) {
				sortedQueue.push(sortedNumbers[n - j - 1]);
			}
		
			while(!queue.queueisEmpty()) {  // 큐에서 값을 다 꺼낼 때까지 실행 
				int importance = sortedQueue.pop();  // 큐에 남아있는 문서 중 중요도가 가장 높은 문서의 중요도
				
				while (queue.peek() != importance) {
					int document = queue.pop();
					queue.push(document);
					
					if (--m < 0) { // 해당 문서의 큐 순서가 달라질 때마다 나타내는 위치를 같이 이동 시킴.
                        m = queue.size() - 1;  //0보다 작은 경우는 뒤로 넘어간 상황이기 때문에 다음과 같이 처리
                    }
				}
				
				queue.pop();
				count++;
				
				if (--m < 0) { // 0보다 작아졌다는 것은 지켜보던 문서가 출력되었다는 것. 이 때의 출력 횟수가 답.
                    results[i] = count;
                    break;
                }
			}
		}
		
		for (int i = 0; i < t; i++) {
			System.out.println(results[i]);
		}
		sc.close();
	}
}