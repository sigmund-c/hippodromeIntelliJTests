import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RacerDFixBenchmark {
    final int SUCCESS_VALUE = 0;

    @Test
    public void airlineBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/airline/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }

    @Test
    public void alarmclockBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/alarmclock/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }

    @Test
    public void buggyprogramBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/buggyprogram/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }

    @Test
    public void consisitencyBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/consisitency/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }

    @Test
    public void dataraceBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/datarace/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }

    @Test
    public void linkedlistBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/linkedlist/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }

    @Test
    public void mergesortBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/mergesort/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }

    @Test
    public void nestedclasses1Benchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/nestedclasses1/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }

    @Test
    public void nestedclasses2Benchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/nestedclasses2/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }

    @Test
    public void nestedclasses3Benchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/nestedclasses3/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }

    @Test
    public void pingpongBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/pingpong/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }

    @Test
    public void wronglock2Benchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /RacerDFix-1.0-jar-with-dependencies.jar " +
                "--config_file=src/main/java/wronglock2/CONFIG.json");
        int returnValue = pr.waitFor(); // RacerDFix returns 0 when no more bugs are detected.

        assertEquals(returnValue, SUCCESS_VALUE);
    }
}
