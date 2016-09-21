package prob4;

public abstract class Shape {

	private double width;
	private double height;

	public abstract double getArea();

	public abstract double getPerimeter();

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}

}
