package ObserverPatternTP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientClass {

	public static void main(String[] args) {
		ISubject subject = new ConcreteSubject();
		new ObserverA(subject);
		List<String> myList = new ArrayList<>(Arrays.asList("Venus", "Earth", "Mars"));
		subject.sort(myList);

	}

}
