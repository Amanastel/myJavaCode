package Problem02;

import java.io.*;
import java.util.concurrent.*;

public class Problem02 {
    public static void main(String[] args) {
        Runnable writeThread = () ->{
            try (PrintWriter writer = new PrintWriter("student.txt")){writer.println("Anuj 56.25 77.58");writer.println("Bharat 66.25 57.58");writer.println("Chaman 70.25 66.74");writer.println("Dhanush 58.25 95.74");writer.println("Garv 58.62 95.74");
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        Thread firstThread = new Thread(writeThread, "First thread");
        Callable<String>  maxPrCall = () ->{
            String maxPreStu = "";
            double maxPre = 0.0;
            try(BufferedReader reader = new BufferedReader(new FileReader("student.txt"))){
                String str;
                while ((str = reader.readLine()) != null){
                    String [] stuData = str.split(" ");
                    double perCent = Double.parseDouble(stuData[2]);
                    if(perCent > maxPre){
                        maxPre = perCent;
                        maxPreStu = stuData[0];
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            return maxPreStu;
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> maxPerCentFu = executor.submit(maxPrCall);


        Callable<Double> avgAttCall = ()->{
            double sum = 0.0;
            int count = 0;
            try(BufferedReader reader = new BufferedReader(new FileReader("student.txt"))){
                String line;
                while ((line = reader.readLine())!=null){
                    String[] stuData = line.split(" ");
                    double attend = Double.parseDouble(stuData[2]);
                    sum += attend;
                    count++;
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            return sum/count;
        };
        Future<Double> avgAttFu = executor.submit(avgAttCall);

        try {
            firstThread.start();
            firstThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        try {
            String maxPreCnStu = maxPerCentFu.get();
            System.out.println("Student max Percentage: "+ maxPreCnStu);

            double avAtt = avgAttFu.get();
            System.out.println("Average Percentage: " + avAtt);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }
}
