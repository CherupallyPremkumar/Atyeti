package Harish;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyingFile {
    public static void main(String[] args) throws IOException {
        String str="premkumar123456789";
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Cherupally Premkumar\\OneDrive - Atyeti Inc\\SpringbootPremkumar\\Datastrucutre\\src\\premk.txt");

        FileOutputStream fileOutputStream=new FileOutputStream(new File("pre.txt"));

        int n;
        while((n=fileInputStream.read()) !=-1)
        {
        fileOutputStream.write(n);
        }
       /* BufferedReader bufferedReader=new BufferedReader(new FileReader("C:\\Users\\Cherupally Premkumar\\OneDrive - Atyeti Inc\\SpringbootPremkumar\\Datastrucutre\\src\\premk.txt"));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("premkum.txt"));
        String l;
        while((l=bufferedReader.readLine()) != null)
        {
            System.out.println(l);
            bufferedWriter.write(l);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }*/
      //  FileReader fileReader=new FileReader("C:\\Users\\Cherupally Premkumar\\OneDrive - Atyeti Inc\\SpringbootPremkumar\\Datastrucutre\\src\\premk.txt");
        FileWriter fileWriter=new FileWriter("premkum.txt");
       /* int i;
        while((i=fileReader.read()) != -1)
        {
            fileWriter.write(i);
            fileWriter.flush();
        }
        fileWriter.append(str);
        fileWriter.flush();*/
        String s= new String(Files.readAllBytes(Paths.get("C:\\Users\\Cherupally Premkumar\\OneDrive - Atyeti Inc\\SpringbootPremkumar\\Datastrucutre\\prem.txt")));
        fileWriter.write(s);
        fileWriter.flush();

    }
}
