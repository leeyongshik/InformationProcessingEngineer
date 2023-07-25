package Package;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(10);
	}

}

class A{
	int a;
	public A(int a) {
		this.a = a;
	}
	void display() {
		System.out.println("a=" + a);
	}
}

class B extends A{
	public B(int a) {
		super(a);
		super.display();
	}
}

//객체 B의 생성자를 호출하면서 10을 넘깁니다.
//부모클래스의 생성자에게 10을 넘깁니다.
//맴버변수 a에 10을 저장합니다.
//부모클래스의 display() 함수를 호출합니다.