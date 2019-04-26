package VisitorPatternTutorialsPoint;

public class VisitorA implements IVisitor{

	@Override
	public void visit(IDefaultClass defaultClass) {
		// TODO Auto-generated method stub
		if(defaultClass.getClass().equals(DefaultClassA.class))
			System.out.println("Applying visitor algorithm to Default Class A");
		else
			System.out.println("Applying visitor algorithm to Default Class B");
		
	}

}
