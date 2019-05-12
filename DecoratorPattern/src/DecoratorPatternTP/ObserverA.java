package DecoratorPatternTP;

public class ObserverA implements IObserver{
	ISubject subject;
	ObserverA(ISubject subject)
	{
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		System.out.println();
	}

	public void updateSwap(String element1,String element2) {
		System.out.println("Swapping values "+ element1 +" "+ element2);
	}
	public void updateCompare(String element1,String element2)
	{
		System.out.println("Comparing values "+ element1 +" "+ element2);
	}
}
