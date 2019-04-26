package VisitorPatternTutorialsPoint;

public class DefaultClassA implements IDefaultClass
{

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
