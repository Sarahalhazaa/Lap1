import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);


//Q1---------------------------------------------------------
        System.out.println("Enter First Number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second Number:");
        double num2 = scanner.nextDouble();
        double sum = num1+num2;
        double subtraction =num1-num2;
        double multiplication = num1*num2;
        double division  = num1/num2;
        double mod = num1%num2;
        System.out.printf("%n sum="+sum+"%n subtraction="+subtraction+"%n multiplication="+multiplication+"%n division="+division+"%n mod=" +mod+"%n %n");

//Q2----------------------------------------------------------
        System.out.println("Enter Number:");
        double num3 = scanner.nextDouble();
        for (int i = 1; i<=10 ;i++){
        System.out.printf("%n result "+num3+" * "+i+"= "+num3*i); }

//Q3----------------------------------------------------------
        System.out.printf("%n %n Enter Radius of circle:%n");
        scanner.nextDouble();
        double Radius= scanner.nextDouble();
        double A = 3.14;
        double area = A * Radius * Radius;
        double perimeter = 2 * A * Radius;
        System.out.printf("area="+area+"%nperimeter="+perimeter+"%n %n");

//Q4----------------------------------------------------------
       double sum1=0;
       double num4=0;
       int cont =-1;
        do {
            System.out.printf("%n Enter Number , if to exit enter 0 :%n");
            num4 = scanner.nextDouble();
           sum1+=num4;
           cont++;
        }while (num4!=0);
        System.out.printf("average="+sum1/cont+"%n");
//Q5----------------------------------------------------------
        System.out.println("Enter First Number:");
        int num5 = scanner.nextInt();
        System.out.println("Enter second Number:");
        int num6 = scanner.nextInt();
        System.out.println("Enter third Number:");
        int num7 = scanner.nextInt();
         int sum2= num5+num6;
          if (sum2==num7){
              System.out.printf(num5+"+"+num6+"="+num7+" ( true )%n");
          } else System.out.printf(num5+"+"+num6+"!="+num7+"( false )%n");

//Q6(A)----------------------------------------------------------
        System.out.printf("%n Enter a sentence:");
        String sentence = scanner.nextLine();
        String reversed = "";
        int s=0;
        for ( s = sentence.length(); s>0; s--) {
            reversed += sentence.charAt(s-1);}
        System.out.println(" Reverse string:" +reversed);
//Q6(B)------------------------------------------------------------
        System.out.printf("%n Enter a sentence:");
        String sentence9 = scanner.nextLine();
        String reversed9 = "";
        char string1;
        for (int q = 0; q<=sentence9.length()-1; q++) {
            string1 = sentence9.charAt(q);
           reversed9= string1+reversed9; }
        System.out.printf("Reverse string:" +reversed9+"%n %n");
//Q7----------------------------------------------------------
        System.out.println("Enter a number:");
       int num8 = scanner.nextInt();
        if (num8 % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
//Q8----------------------------------------------------------
        System.out.printf("%nEnter temperature in Centigrade:%n");
        double Centigrade = scanner.nextDouble();
        double fahrenheit = (Centigrade* 9/5)+32;
        System.out.printf("%ntemperature in Fahrenheit:"+fahrenheit+"%n %n");
//Q9----------------------------------------------------------
        System.out.println("Enter a number:");
        int num9 = scanner.nextInt();
        System.out.println("Enter a string:");
        scanner.nextLine();
        String string = scanner.nextLine();
        if(string.length()>= num9){
       String B = String.valueOf(string.charAt(num9-1));
        System.out.println("char is :"+B);}
        else  System.out.println("The entered number is greater than the number of letters in the word" );

//Q10----------------------------------------------------------
        System.out.printf("%n Enter Width:%n");
        int Width = scanner.nextInt();
        System.out.printf("%n Enter Height:%n");
        int Height = scanner.nextInt();
        int Area = Width* Height;
        int Perimeter = 2* (Width+Height);
        System.out.printf("%n  Area is = "+Width+" * "+Height+" = "+Area+"%n");
        System.out.printf("%n  Perimeter is = 2 * ("+Width+" * "+Height+") = "+Area+"%n");

//Q11----------------------------------------------------------
        System.out.println("Enter First Number:");
        int num10 = scanner.nextInt();
       System.out.println("Enter second Number:");
        int num11 = scanner.nextInt();

        if(num10==num11){
            System.out.println(num10+"=="+num11);
        }else { System.out.println(num10+"!="+num11);}

        if (num10>num11){
            System.out.println(num10+">"+num11);
        } else if (num10<num11){
            System.out.println(num10+"<"+num11);}

        if (num10>=num11) {
            System.out.println(num10+">="+num11);
        } else if (num10<=num11) {
            System.out.println(num10+"<="+num11);}

//Q12----------------------------------------------------------
        System.out.println("Enter Seconds:");
        int numSecond = scanner.nextInt();

        int RemainingSecond=numSecond % 3600;
        int Hours= numSecond/3600;
        int Minutes= RemainingSecond/60;
        int Seconds= RemainingSecond%60;

        System.out.printf("%n"+Hours+":"+Minutes+":"+Seconds+"%n");
//Q13----------------------------------------------------------
        System.out.println("Enter First Number:");
        int num12 = scanner.nextInt();
       System.out.println("Enter second Number:");
        int num13 = scanner.nextInt();
        System.out.println("Enter Third Number:");
        int num14 = scanner.nextInt();
        System.out.println("Enter four Number:");
        int num15 = scanner.nextInt();

        if((num12==num13)&&(num14==num15)&&(num12==num14)){
            System.out.println("Numbers are equal");
        }else { System.out.println("Numbers are not equal");}
//Q14----------------------------------------------------------
        System.out.println("Enter  Number:");
        int num16 = scanner.nextInt();
        if(num16==0){
            System.out.println("zero");}
        else if (num16>0) {
            System.out.println("Positive");
        } else if (num16<0) {
            System.out.println("Negative");
        }

//Q15----------------------------------------------------------

       int contZero =0;
        int contPositive =0;
        int contNegative =0;
        System.out.printf("%n Enter Number , if to exit enter -100 :%n");
       int num17 = scanner.nextInt();
        while (num17!=-100){

            if(num17==0){
                contZero++;
            } else if (num17>0) {
                contPositive++;
            } else if (num17<0) {
                contNegative++;}
                System.out.printf("%n Enter Number , if to exit enter -100 :%n");
                num17 = scanner.nextInt();
            }
        System.out.printf( contZero+"Zero %n"+contPositive+"Positive %n"+contNegative+"Negative %n");

//Q16----------------------------------------------------------

        System.out.printf("%n Enter Number:");
       int num18 = scanner.nextInt();
       int reversed1=0;
        while (num18!=0){
            int g =num18%10;
            reversed1=reversed1*10+g;
            num18/=10;}
            System.out.println(reversed1);

//Q17----------------------------------------------------------
        System.out.printf("%n Enter Number , if to exit enter -100 :%n");
       int num19 = scanner.nextInt();
        int max = 0;
        int min=num19;
        while (num19!=-100){
        System.out.printf("%n Enter Number , if to exit enter -100 :%n");
                num19 = scanner.nextInt();
            if(num19> max){
                max =num19;
            } else if (num19<min) {
              min = num19;

            }
        }
        System.out.printf("%n large number = "+max+"small number = "+min+"%n");
//Q18----------------------------------------------------------

        System.out.printf("%n Enter a sentence:");
       String sentence3 = scanner.nextLine();
        System.out.printf("%n Enter a Char:");
         char ch = 'a';
         int cont1=0;
       for (int q = 0; q<sentence3.length(); q++) {
        if (sentence3.charAt(q)== ch){
            cont1++;
        }}
        System.out.println(cont1);

    }
}