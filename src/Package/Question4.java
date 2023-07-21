package Package;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b=9, c;
		c = b % 5 < 5 ? 1 : 0;
		//c =1;
		c = c | c << 3;
		// 00001001 << 3 => c = 9;
		c = a < 5 || c >= 10 ? c-a : c + a;
		// false || false => 9+5
		System.out.printf("%d",c);
		
		
		
//		삼항연산자가 적용되어 c값은 1이 됩니다.
//		1<<3은 왼쪽 시프트 연산자이므로, c에 저장된 값을 왼쪽으로 3비트 이동시키므로 정수형(4바이트) 
//		2진수로 변환하여 계산하고 10진수로 변환하면 8이 됩니다.
//		1 | 8 은 9가 되므로 c에는 9가 저장되게 됩니다.
//		이번 역시 삼항연산자로써 ||는 하나라도 참이면 참이지만 두랃 거짓이므로 9+5를 적용하여 
//		14가 됩니다.
	}

}
