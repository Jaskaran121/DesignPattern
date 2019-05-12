package ObserverPatternTP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteSubject implements ISubject{
	private List<IObserver> listofObservers;
	
	ConcreteSubject()
	{
		this.listofObservers = new ArrayList<>();
	}
	
	@Override
	public void update() {
		Iterator iterator = this.listofObservers.iterator();
		while(iterator.hasNext())
		{
			IObserver observer = (IObserver) iterator.next();
			observer.update();
		}
	}

	public void updateSwap(String element1,String element2) {
		Iterator iterator = this.listofObservers.iterator();
		while(iterator.hasNext())
		{
			IObserver observer = (IObserver) iterator.next();
			observer.updateSwap(element1,element2);
		}
	}
	
	public void updateCompareValues(String element1,String element2) {
		Iterator iterator = this.listofObservers.iterator();
		while(iterator.hasNext())
		{
			IObserver observer = (IObserver) iterator.next();
			observer.updateCompare(element1,element2);
		}
	}
	@Override
	public void attach(IObserver observer) {
		this.listofObservers.add(observer);		
	}

	public List<String> sort(final List<String> aList) {
		 final int listSize = aList.size();
		 for (int i = 0; i < listSize - 1; i++) {
		 for (int j = 0; j < listSize - 1; j++) {
		 if (this.compareValues(aList, j)) {
			 this.swapValues(aList, j);
		 }
		 }
		 }
		 return aList;
		}
	
	public void swapValues(List<String> aList,int j)
	{
		updateSwap(aList.get(j),aList.get(j+1));
		String temp;
		temp = aList.get(j);
		 aList.set(j, aList.get(j+1));
		 aList.set(j+1, temp);
		 
	}

	public boolean  compareValues(List<String> aList,int j)
	{
		updateCompareValues(aList.get(j),aList.get(j+1));
		return aList.get(j).compareTo(aList.get(j+1)) > 0;
	}

}
