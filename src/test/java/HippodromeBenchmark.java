import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HippodromeBenchmark {
    final int SUCCESS_VALUE = 0;

    @Test
    public void airlineBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /hippodrome-1.0-jar-with-dependencies.jar " +
                "--config_file=src/test/java/airline/CONFIG.json");
        int returnValue = pr.waitFor(); // hippodrome returns 0 when no more bugs are detected.

        assertEquals(SUCCESS_VALUE, returnValue);
    }

    @Test
    public void alarmclockBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /hippodrome-1.0-jar-with-dependencies.jar " +
                "--config_file=src/test/java/alarmclock/CONFIG.json");
        int returnValue = pr.waitFor(); // hippodrome returns 0 when no more bugs are detected.

        assertEquals(SUCCESS_VALUE, returnValue);
    }

    @Test
    public void buggyprogramBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /hippodrome-1.0-jar-with-dependencies.jar " +
                "--config_file=src/test/java/buggyprogram/CONFIG.json");
        int returnValue = pr.waitFor(); // hippodrome returns 0 when no more bugs are detected.

        assertEquals(SUCCESS_VALUE, returnValue);
    }

    @Test
    public void consisitencyBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /hippodrome-1.0-jar-with-dependencies.jar " +
                "--config_file=src/test/java/consisitency/CONFIG.json");
        int returnValue = pr.waitFor(); // hippodrome returns 0 when no more bugs are detected.

        assertEquals(SUCCESS_VALUE, returnValue);
    }

    @Test
    public void dataraceBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /hippodrome-1.0-jar-with-dependencies.jar " +
                "--config_file=src/test/java/datarace/CONFIG.json");
        int returnValue = pr.waitFor(); // hippodrome returns 0 when no more bugs are detected.

        assertEquals(SUCCESS_VALUE, returnValue);
    }

    @Test
    public void linkedlistBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /hippodrome-1.0-jar-with-dependencies.jar " +
                "--config_file=src/test/java/linkedlist/CONFIG.json");
        int returnValue = pr.waitFor(); // hippodrome returns 0 when no more bugs are detected.

        assertEquals(SUCCESS_VALUE, returnValue);
    }

    @Test
    public void nestedclasses1Benchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /hippodrome-1.0-jar-with-dependencies.jar " +
                "--config_file=src/test/java/nestedclasses1/CONFIG.json");
        int returnValue = pr.waitFor(); // hippodrome returns 0 when no more bugs are detected.

        assertEquals(SUCCESS_VALUE, returnValue);
    }

    @Test
    public void nestedclasses2Benchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /hippodrome-1.0-jar-with-dependencies.jar " +
                "--config_file=src/test/java/nestedclasses2/CONFIG.json");
        int returnValue = pr.waitFor(); // hippodrome returns 0 when no more bugs are detected.

        assertEquals(SUCCESS_VALUE, returnValue);
    }

    @Test
    public void nestedclasses3Benchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /hippodrome-1.0-jar-with-dependencies.jar " +
                "--config_file=src/test/java/nestedclasses3/CONFIG.json");
        int returnValue = pr.waitFor(); // hippodrome returns 0 when no more bugs are detected.

        assertEquals(SUCCESS_VALUE, returnValue);
    }

    @Test
    public void pingpongBenchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /hippodrome-1.0-jar-with-dependencies.jar " +
                "--config_file=src/test/java/pingpong/CONFIG.json");
        int returnValue = pr.waitFor(); // hippodrome returns 0 when no more bugs are detected.

        assertEquals(SUCCESS_VALUE, returnValue);
    }

    @Test
    public void wronglock2Benchmark() throws IOException, InterruptedException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("java -jar /hippodrome-1.0-jar-with-dependencies.jar " +
                "--config_file=src/test/java/wronglock2/CONFIG.json");
        int returnValue = pr.waitFor(); // hippodrome returns 0 when no more bugs are detected.

        assertEquals(SUCCESS_VALUE, returnValue);
    }
}
