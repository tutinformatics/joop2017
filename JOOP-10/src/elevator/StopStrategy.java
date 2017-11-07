package elevator;

/*
 * interface for elevator stopping strategy
 * 
 * */
public interface StopStrategy {

	boolean stopRequired(int floorNumber);

}
