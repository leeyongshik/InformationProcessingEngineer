package Package;

import java.util.HashSet;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set a = new HashSet();
		
		a.add(7);
		System.out.println(a);
		
		a.add(5);
		System.out.println(a);
		
		a.add(5);
		System.out.println(a);
		
		a.remove(5);
		System.out.println(a);
		
		System.out.println(a.size());
		
//		해시셋은 중복된 원소를 허용하지 않는 성질은 가진 클래스이며, 순서에 구애받지 않습니다.
//		5가 삽입되었을때 중복이 되므로 추가되지 않는것이 포인트입니다.
	}

}
