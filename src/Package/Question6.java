package Package;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperObject a = new SubObject();
		a.paint();
	}
}

class SuperObject {
	public void paint() {
		draw();
	}
	public void draw() {
		draw();
		System.out.println("Super Object");
	}
}

class SubObject extends SuperObject {
	public void paint() {
		super.draw();
	}
	public void draw() {
		System.out.println("Sub Object");
	}
}

//클래스 SubObject를 정의하고 부모 클래스로 SuperObject를 지정하면 SuperObject에 속한 
//변수와 메서드를 상속받습니다.
//
//자식 클래스 생성자로 인스턴스를 생성할 때 자료형을 부모 클래스로 지정하면 생성된 인스턴스는 부모 클래스로 
//묵시적 클래스 형 변환이 됩니다. 부모와 자식 클래스간 같은 메서드가 존재하면 호출되는 메서드는 생성된 
//인스턴스에 따라 결정됩니다.
//
//a.paint()는 클래스 형 변환을 수행하였고 print()메서드가 자식 클래스에서 재정의를 통해 오버라이딩 된 
//메서드이므로 자식 클래스의 paint 메서드가 수행됩니다.
// 
//부모 클래스를 호출하는 super를 사용했으므로 부모 클래스의 draw() 메서드를 수행합니다.
// 
//부모 클래스 draw()에서 처음에 클래스 형 변환을 수행하였고 draw()메서드가 자식 클래스에서 재정의를 통해 
//오버라이딩 된 메서드이므로 자식 클래스의 draw()메서드를 수행합니다.
// 
//자식 메서드 draw를 수행하면서 'Sub Object가 수행되고' 다시 부모 draw()로 돌아가 나머지 
//'Super Object'를 수행합니다.