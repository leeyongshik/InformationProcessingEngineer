package Package;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b=5, sum =2;
		b *= a/=4;

		sum += ++a * b-- / 4;
		
		System.out.printf("%d",sum);
		
//		각 변수들을 초기화하고,
//		1.  b는 (12/4) * 5 = 15가 됩니다. - 변수들의 값을 대입하면 확인할 수 있습니다.
//		2.  sum은 (4*15) / 4 + 2 = 17이 되게 됩니다.- ++a는 전치 증가 연사자라 바로 
//			12에서 13로 반영이 되지만,b--는 후치 증가 연산자라 라인이 끝난 뒤에 반영되기에 
//			여기서는 반영되지 않습니다. 

	}

}
