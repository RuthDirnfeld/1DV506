package rd222dv_assign3;

public class AlarmClockMain {

	public static void main(String[] args) {

		AlarmClock clock = new AlarmClock(23, 48);

		clock.displayTime();
		clock.setAlarm(6, 15);
		clock.displayAlarmTime();
		for (int i = 1; i <= 500; i++) {
			clock.timeTick();
		}
		clock.displayTime();
	}

}
