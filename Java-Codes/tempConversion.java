import java.util.Scanner;
class tempConversion{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //Code for Farenite to celcius
        System.out.println("Enter Farenite Value");
        int intF = sc.nextInt();
        float C = (intF - 32)/ 1.8f;
        System.out.println(C);

        //Code for Celcius to Farenite
        System.out.println("Enter Celsius Value");
        int intC = sc.nextInt();
        float F = (intC * 1.8f) + 32;
        System.out.println(F);
    }
}