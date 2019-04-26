package VisitorPattern;

public class Statement implements ICompiler{

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
