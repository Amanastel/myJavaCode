package Day007;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.*;

public class FileOperationDemo {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        String filename = "A.txt";
        String contentToWrite = "Originally formed in 1600 purely to trade with the Mughal Empire, the Company needed to secure its commercial posts at Calcutta, Bombay and Madras. It purchased land from Indian rulers to build its settlements on, and recruited native armed forces to protect them. Eventually, these evolved into the Bengal, Bombay and Madras Armies.";
        String contentToAppend = "\nAfter successfully battling the French for trading supremacy, and simultaneously involving itself in local politics, the Company became India’s leading power following Robert Clive’s victory at Plassey in 1757. In the years that followed, it expanded its Indian domains.";

        Problem02 readWriteCenter = new Problem02(filename, contentToWrite, contentToAppend);


        Thread writeThread = new Thread(readWriteCenter::writeToFile);


        Thread appendThread = new Thread(readWriteCenter::appendToFile);


        writeThread.start();


        writeThread.join();


        appendThread.start();


        ExecutorService executor = Executors.newFixedThreadPool(1);
        Callable<List<Integer>> callable = readWriteCenter::getAnalysis;

    }
}