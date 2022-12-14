package ch12shapes;

import java.util.Objects;

public class Square extends Shape{
	
	int x;
	
	@Override
	public int hashCode() {
		return Objects.hash(x);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return x == other.x;
	}
	@Override
	void draw() {
		System.out.println(shape+"Square is drawing.");
	}
	@Override
	void erase(int x, int y) {
		System.out.println("Square is erasing.");
	}

}
