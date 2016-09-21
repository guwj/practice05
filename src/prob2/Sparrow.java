package prob2;

public class Sparrow extends Bird {
	public void setName(String name){
		super.setName(name);
	}

	public void fly() {
		System.out.println(getName() + "가 날아다닙니다");
	}

	public void sing() {
		super.sing();
	}

	public String toString() {
		return "참새의 이름은 " + getName() + "입니다";
	}
}
