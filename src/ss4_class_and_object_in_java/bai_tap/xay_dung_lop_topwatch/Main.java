package ss4_class_and_object_in_java.bai_tap.xay_dung_lop_topwatch;


public class Main {
    private static int LocalDate;

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long sum = 0;
        for (int i = 0; i < 1000000000; i++) {
            for (int j = 0; j < 100000000; j++) {
                sum += j;
            }
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime() + " milisecond");
    }
}
