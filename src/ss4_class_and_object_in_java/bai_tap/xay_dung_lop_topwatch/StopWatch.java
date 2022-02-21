package ss4_class_and_object_in_java.bai_tap.xay_dung_lop_topwatch;


import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        Date date = new Date();
        startTime = date.getTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        Date date = new Date();
        startTime = date.getTime();
    }

    public void end() {
        Date date = new Date();
        endTime = date.getTime();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
