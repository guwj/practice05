package prob2;

public class Duck extends Bird {
	public void setName(String name){
		super.setName(name);
	}

	public void fly() {
		System.out.println(getName() + "는 날지 않습니다");
	}

	public void sing() {
		super.sing();
	}

	public String toString() {
		return "오리의 이름은 " + getName() + "입니다";
	}
}
