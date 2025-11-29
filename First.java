import java.util.Scanner;

 class One
{
    public static void main(String arr[])
   {

// int option;
// Scanner obj=new Scanner(System.in);
// option=obj.nextInt();


// String result = switch(option)
// {
//     case 1-> "case1";
//     case 2-> "case2";
//     case 3-> "case3";
//     default-> "invailid";
// };
// System.out.println(result);

// //genrate password pin
//      int pin;
//     System.out .println("enter your pin");
//     pin=obj.nextInt();

//     if(pin==1234)
//     {
//         System.out .println("cw");
//     }

//      else
//      {
//          System.out .println("invailid password again");
//          pin=obj.nextInt();
//         if (pin==1234)
//     {
//         System.out .println("cw");
//     }
//     else{

//     System.out .println("invailid password try again");
//     pin=obj.nextInt();
//     if(pin==1234)
//     {
//     System.out .println("cw");
//     }

//     else
//     {
//     System.out .println("card blocked");
//      }
//         }
//      }

//          System.out.println("enter a number");
//     int number;

//     if(number<0)
//     {
//         System.out.println(number*-1);
//     }

//     else{
//         System.out.println(number);
//     }

//     int cp;
// int sp;

// cp=obj.nextInt();
// sp=obj.nextInt();

// if(cp<sp)
// {
// String option;
// System.out.println("chose option yes or no");
// option=obj.next();
// if(option=="yes")
// {
// System.out.println("profit= "+""+(sp-cp)+"your discount is 100");
// }

// else
// {
// System.out.println("profit= "+""+(sp-cp));
// }
// }

// else if(cp>sp)
//     {
//     String option;
//     System.out.println("chose option mrp yes or no");
//     option=obj.next();
// if(option.equals("yes"))
// {
// System.out.println("loss= "+""+(cp-sp)+"your discount ids 100");
// }

// else
// {
// System.out.println("loss= "+""+(cp-sp)); 
// }    
        
// }



// System.out .println("enter your choice 1.f-c 2.c-f");
// int option=obj.nextInt();

// if(option==1)
// {
//     int temp;
//     System.out.println("enter a tempreture");
//     temp=obj.nextInt();
//     int ans=((temp-32)*5)/9;
//     System.out.println(ans+" "+"temp in celcius");
// }

// else if(option==2)
// {
//     int temp;
//     System.out.println("enter a tempreture");
//     temp=obj.nextInt();
//     int ans=(temp*9)/5+32;
//     System.out.println(ans+" "+"temp in farenhit");
// }

// else{
//     System.out.println("invailid ");
// }

// / check the number of days.

// int mn;
// System.out.println("enter a month 1-12");
// mn=obj.nextInt();

// if(mn==1 || mn==3 || mn==5 || mn==7 || mn==8 || mn==10 || mn==12)
// {
//     System.out.println("31 days");
// }

// else if(mn==4 || mn==6 || mn==9 || mn==11)
// {
//     System.out.println("30 dasy");
// }

// else if(mn==2)
// {
//     System.out .println("28/29 days");
// }

// else{
//     System.out.println("invailid");
// }

// char ab;
// System.out.println("enter a charctar");
// ab=obj.next().charAt(0);

// if(ab>='A' && ab<='Z')
// {
//     ab=(char)(ab+32);
//     System.out.println(ab);
// }

// else if(ab>='a' && ab<='z')
// {
//     ab=(char)(ab-32);
//     System.out.println(ab);
// }

// else 
// {
//     System.out.println("Spaical symbol");
// }

   
    
//     }

//     static int sum(int n)
// {
//     if(n==0)  return 0;
//     return sum(n-1)+n;//=>4+sum(3)=3+sum(2)=2+sum(1)=1+sum(0)
// }

// public static  void  main(String[] args){
//     System.out.println(sum(4));
// }


// public static int  calculatesum(int a, int b)
// {
//     int sum=a+b;
//     return sum;
// }
// public static void main(String arr[]){
//     Scanner sc=new Scanner(System.in);;
//     int a=sc.nextInt();
//     int b=sc.nextInt();

//     int sum=calculatesum(a,b);
//     System.out.println("sum of 2 number: "+  sum);
// }

// public static int  calculatemul(int a, int b)
// {
//     int mul=a*b;
//     return mul;
// }
// public static void main(String arr[]){
//     Scanner sc=new Scanner(System.in);;
//     int a=sc.nextInt();
//     int b=sc.nextInt();

//     int mul=calculatemul(a,b);
//     System.out.println("multiply of 2 number: "+  mul);
// }


// public static void factorial(int n)
// {
//     if(n<0)
//     {
//         System.out.println("invailid");
//         return;
//     }
//     int factorial=1;
    
//     for(int i=n; i>=1; i--){
//       factorial = factorial * i;
//     }

//     System.out.println(factorial);
//     return;

// }
// public static void main(String arr[]){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();

//     factorial(n);

    
// }

// //Enter 3 numbers from the user & make a function to print their average.
// public  static void sum(String arr[])
// {
//     Scanner sc=new Scanner(System.in);

//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     int c=sc.nextInt();

//     int average=(a+b+c)/3;
//    System.out.println(average);
    
// }

// //Write a function to print the sum of all odd numbers from 1 to n.
//  public static void main(int n) {
//        int sum = 0;


//       for(int i=1; i<=n; i++) {
//         if(i % 2 != 0) {
//             sum = sum + i;
//         }
//       }


//       System.out.println(sum);
      
//    }
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       Sum(n);
//    } 
// //4,5,6,7 table 
//    for loop
// Scanner sc=new Scanner(System.in);
// int n=4;
// for(int i=1;i<=10;++i){
//     System.out.println(n*i);
// }
// int j=5;
// for(int i=1;i<=10;++i){
//     System.out.println(j*i);
// }
// int k=6;
// for(int i=1;i<=10;++i){
//     System.out.println(k*i);
// }
// int l=7;
// for(int i=1;i<=10;++i){
//     System.out.println(l*i);
// }

// for(int i=1;i<=10;++i){
//     System.out.println(n*i);

// int ft=0;
// int st=1;
// int next=0;

// int n=0;
// while(n<6)
//     {
//         if(n==0)
//         {
//             System.out.println(ft);
//             ++n;
//             continue;
//         }

//         if(n==1)
//         {
//             System.out.println(st);
//             ++n;
//             continue;
//         }

//         next=ft+st;
//         ft=st;
//         st=next;
        

//     }
//     System.out.println(next);

//     ++n;

}
   }
