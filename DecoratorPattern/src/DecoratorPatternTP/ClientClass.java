package DecoratorPatternTP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientClass {

	public static void main(String[] args) {
		
		ISubject subject = new ConcreteSubject();
		SortDecorator decorator = new ConcreteDecoratorA(subject);
		new ObserverA(decorator);
		List<String> myList = new ArrayList<>(Arrays.asList("Venus", "Earth", "Mars"));
		decorator.sort(myList);

	}

}
