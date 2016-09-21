package prob4;

public class Rectangle extends Shape implements Resizable{

	public Rectangle(double width, double height){
		super(width, height);
		
	}
	@Override
	public double getArea() {
		return getWidth() * getHeight();
	}

	@Override
	public double getPerimeter() {
		return 2 * (getWidth() + getHeight());
	}

	@Override
	public void resize(double s) {
		setWidth(getWidth() * s);
		setHeight(getHeight() * s);
	}

}
