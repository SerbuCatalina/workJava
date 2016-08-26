package shapes; /**
 * Created by Catalina on 6/12/2016.
 */
import java.util.*;

public class Dummy {
    public static void main(String[] args) throws InterruptedException {

        //ex1
        System.out.println("if-else instruction:");
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        System.out.println("switch instruction:");
        int month=8;
        String monthString;

        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println("Month "+month+" is "+monthString);

        System.out.println("while instruction:");
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        System.out.println("do-while instruction:");
        int countS = 1;
        do {
            System.out.println("Count is: " + countS);
            countS++;
        } while (countS < 11);

        System.out.println("for instruction:");
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int item : numbers){
            System.out.println("Count is:"+item);
        }

        //ex2
        System.out.println("Maximum of 2 numbers:");
        int x;
        int y;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();

        if(x<y) {
            System.out.println("Maximum("+x+","+y+") is:"+y);
        }
        else{
            System.out.println("Maximum("+x+","+y+") is:"+x);
        }

        System.out.println("Sorting random numbers:");

        //ex3
        double[] array = new double[10];
        for(int i=0;i<10;i++)
        {
            double randomDouble = Math.random();
            array[i] = randomDouble;
        }

        System.out.println("Unsorted numbers:");
        for(int i=0;i<10;i++)
        {
            System.out.println(array[i]);
        }

        Arrays.sort(array);

        System.out.println("Sorted numbers:");
        for(int i=0;i<10;i++)
        {
            System.out.println(array[i]);
        }

        //ex4
        double randomDouble = Math.random();
        int randomInt = ((int) randomDouble);


        while(randomInt>0)
        {

            Thread.sleep(1000);
            randomInt--;
        }

        System.out.println(Thread.currentThread().getName());

        //ex5
        int opt = 0;


        System.out.println("Choose:");
        System.out.println("+:1");
        System.out.println("-:2");
        System.out.println("*:3");
        System.out.println("/:4");


        opt = in.nextInt();

        System.out.println("Give 2 numbers:");
        int no1;
        int no2;
        int result=0;

        no1 = in.nextInt();
        no2 = in.nextInt();

        try {
            switch (opt) {
                case 1: {
                    result = no1 + no2;
                    break;
                }
                case 2: {
                    result = no1 - no2;
                    break;

                }
                case 3: {
                    result = no1 * no2;
                    break;
                }
                case 4: {
                    result = no1 / no2;
                    break;
                }
                default:
                    break;

            }
        } catch(IllegalArgumentException e) {
            System.out.println("Exception divide by 0!");
        }
        finally{
            System.out.println("The result is:"+result);
        }

        //ex 6

        System.out.println("Give a sentence");
        String sentence;

        in.useDelimiter("\\n");
        sentence = in.next();

        String[] splitedArray = sentence.split(" ");
        int charNo = 0;
        for ( String ss : splitedArray) {

            System.out.println(ss);

            charNo += ss.length();
        }

        System.out.println("The number of characters is "+ charNo);

    }
}