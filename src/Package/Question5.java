package Package;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0, hap = 0;
		do {
			++i;
			hap += i;
		} while (i<5);
		//i=1,hap=1 / i=2,hap=3 / i=3,hap=6 / i=4,hap=10 / i=5,hap=15
		System.out.printf("%d, %d\n", i, hap);
		
//		do ~ while 반복문의 시작점이며 이 안에 문장을 반복하여 수행합니다.
//		i = i + 1과 동일하므로 i의 값을 1씩 누적 시킵니다.
//		hap = hap +i 와 동일하므로 i의 값을 hap에 누적시킵니다.
//		i가 5보다 작은 동안 문장을 반복 수행합니다.i가 5가 되었을때 5를 hap에 누적한 다음 
//		do~while문을 탈출하기 때문에 i는 5로 끝납니다.
	}

}
