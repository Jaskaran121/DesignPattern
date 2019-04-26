package VisitorPatternTutorialsPoint;

public class ClientClass {

	public static void main(String[] args) {
		IDefaultClass object = new DefaultClass();
		object.accept(new VisitorA());
	}

}
