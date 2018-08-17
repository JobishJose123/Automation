package baseClasses;

public class TimeoutImpl {

	private long startTime;
	private long currentTime;
	public void startTimer() {
		startTime = System.currentTimeMillis();
	}
	public boolean checkTimerMin(double min) {
		currentTime = System.currentTimeMillis();
		min = min*60*1000;
		if((currentTime-startTime)>=min)
			return false;
		else
		    return true;
	}
	public static void main(String[] args) throws InterruptedException {
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		while(true&&t.checkTimerMin(0.1)){
			System.out.println(t.checkTimerMin(0.1));
			Thread.sleep(1000);
		}
	}

}