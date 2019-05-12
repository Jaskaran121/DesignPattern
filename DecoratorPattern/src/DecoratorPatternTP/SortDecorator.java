package DecoratorPatternTP;

import java.util.List;

public abstract class SortDecorator implements ISubject{
	protected ISubject subjectSort;
	
	SortDecorator(ISubject subjectSort)
	{
		this.subjectSort = subjectSort;
	}
	public void attach(IObserver observer) {
		this.subjectSort.attach(observer);
	}
	protected List<String> preProcessing(List<String> aList){
		return aList;
	}
	//Parent class telling to perform template Pattern
	public final List<String> sort(List<String> aList){
		List<String> lowerCaseList = this.preProcessing(aList);
		List<String> sortedList = this.subjectSort.sort(lowerCaseList);
		return sortedList;
	}
}
