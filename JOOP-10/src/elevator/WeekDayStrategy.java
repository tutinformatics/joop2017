package elevator;

import java.time.LocalDate;

public class WeekDayStrategy implements StopStrategy {

	@Override
	public boolean stopRequired(int floorNumber) {
		if (LocalDate.now().getDayOfWeek().getValue() > 5)
			return false;
		return true;
	}

}
