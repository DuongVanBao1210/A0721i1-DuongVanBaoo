package ss4_class_and_oop_in_java.bai_tap.bai2_xay_dung_lop_stopwatch;

public class StopWatch {
	private long startTime, endTime;
	
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	

    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
