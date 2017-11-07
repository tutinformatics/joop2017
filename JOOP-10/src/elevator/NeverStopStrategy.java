package elevator;

public class NeverStopStrategy implements StopStrategy{

	@Override
	public boolean stopRequired(int floorNumber) {
		return false;
	}
}
