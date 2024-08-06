package Common;

import java.time.LocalDate;

public class StopWatch {
   private long startTime ;
   private long endTime ;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return  endTime - startTime ;
    }

    public void map(){
        System.out.println("+---------------+\n" +
                "| StopWatch     |\n" +
                "+---------------+\n" +
                "- startTime: long\n" +
                "- endTime: long\n" +
                "+---------------+\n" +
                "+ StopWatch()   |\n" +
                "+ start(): void |\n" +
                "+ stop(): void  |\n" +
                "+ getElapsedTime(): long\n" +
                "+---------------+");
    }
}
