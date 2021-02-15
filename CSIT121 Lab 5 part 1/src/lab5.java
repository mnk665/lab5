import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) throws IOException {

        FileReader fr=new FileReader("C:\\Users\\Nihal\\Desktop\\UOWD\\Winter 2021\\CSIT121\\text files\\numbers.txt");
        Scanner scan=new Scanner(fr);
        int sum=0;
        while(scan.hasNext())
        {
            sum+=scan.nextInt();
        }
        System.out.println("The sum of numbers in number.txt is "+sum);
        fr.close();

        File f= new File("text.txt");
        FileWriter fw = new FileWriter(f);
        Scanner scan1= new Scanner(System.in);

        String str="";
        while(!str.equals(null))
        {
            System.out.print("Write a text: ");
            str=scan1.next();
            if(str.equalsIgnoreCase("quit"))
                break;
            fw.write(str+" ");

        }
        fw.close();


        FileReader fmark=new FileReader("C:\\Users\\Nihal\\Desktop\\UOWD\\Winter 2021\\CSIT121\\text files\\marks.txt");
        FileWriter fgrade=new FileWriter("grades.txt");
        Scanner scan_marks=new Scanner(fmark);
        while(scan_marks.hasNextLine())
        {
            String[] arr=scan_marks.nextLine().split(" ");
            String name=arr[0];
            fgrade.write(name+" "+getGrade(arr)+'\n');
        }
        fgrade.close();
        fmark.close();

    }
    public static String getGrade(String[] arr)
    {
        int total_asign=Integer.parseInt(arr[1]);
        double avg=0,sum=0;
        for(int i=2;i<arr.length;i++)
        {
            sum+=Double.parseDouble(arr[i]);
        }
        avg=sum/total_asign;
        return calcGrade(avg);
    }

        public static String calcGrade(double avg)
        {
            if(avg>=85&&avg<=100)
                return "HD";
            else if(avg>=75&&avg<85)
                return "D";
            else if(avg>=65&&avg<75)
                return "C";
            else if(avg>50&&avg<65)
                return "P";
            else if(avg==50)
                return "PS";
            else if(avg>=0&&avg<50)
                return "F";
            else
                return "TF";
        }



}
