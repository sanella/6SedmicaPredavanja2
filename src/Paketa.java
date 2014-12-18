public class Paketa {
	private double width;
	private double height;
	private double lenght;
	private double weight;

	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(this.width < 0)
			throw new IllegalArgumentException("Width nije ispravan");
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(this.height < 0)
			throw new IllegalArgumentException("Height nije ispravan");
		this.height = height;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		if(this.lenght < 0)
			throw new IllegalArgumentException("Lenght nije ispravan");
		this.lenght = lenght;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(this.weight < 0){
			throw new IllegalArgumentException("Weight nije ispravan");
		} else {
		this.weight = weight;
	}
	}
	public double getPrice() {
		double price = getWeight() * 3;
		return price;
	}

	public String toString() {
		String ispis =  "PaketTest [Width=" + width + ", height=" + height + ", lenght="
				+ lenght + ", weight=" + weight + ", price=" + getPrice() + "]";
		return ispis;
	}

	
}
