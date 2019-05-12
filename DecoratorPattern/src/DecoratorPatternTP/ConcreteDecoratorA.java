package DecoratorPatternTP;

import java.util.List;
import java.util.stream.Collectors;

public class ConcreteDecoratorA extends SortDecorator{

	ConcreteDecoratorA(ISubject subjectSort) {
		super(subjectSort);
	}
	
	protected List<String> preProcessing(List<String> aList)
	{
		List<String> lowerCaseList = aList.stream().map(i->i.toLowerCase()).collect(Collectors.toList());
		return lowerCaseList;
	}
}
