
public class CircleMain {

	public static void main(String[] args) {
		Circle c1=new Circle(5);
		Circle c2=new Circle(10);
		Circle c3=new Circle(15);
		Circle[] circles = {c1,c2,c3};
		for(Circle circ:circles) {
			System.out.println(circ.ComputeArea());
		}

	}

}
