package VisitorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Method implements ICompiler{
	List<Statement> statementsList = new ArrayList<>(Arrays.asList(new Statement()));
	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.open(this);
		Iterator iterator = statementsList.iterator();
		while(iterator.hasNext())
		{
			Statement aStatement = (Statement) iterator.next();
			aStatement.accept(visitor);
		}
		visitor.close(this);
	}

}