package ObserverPatternTP;

public interface IObserver {
	public void update();
	public void updateCompare(String element1,String element2);
	public void updateSwap(String element1,String element2);
}
