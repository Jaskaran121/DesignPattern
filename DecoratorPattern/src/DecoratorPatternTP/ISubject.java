package DecoratorPatternTP;

import java.util.List;

public interface ISubject {
	public void attach(IObserver observer);
	public List<String> sort(List<String> aList);
}
