package VisitorPatternTutorialsPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultClass implements IDefaultClass{
	List<IDefaultClass> defaultCLassesList;
	
	DefaultClass()
	{
		defaultCLassesList = new ArrayList<>(Arrays.asList(new DefaultClassA(),new DefaultClassB()));
	}
	@Override
	public void accept(IVisitor visitor) {
		for(IDefaultClass defaultClass:defaultCLassesList)
		{
			defaultClass.accept(visitor);
		}
		
	}

}
