import java.util.Scanner;
public class Practice{
    public static void main(String  args[]){

// duplicate value.

// int arr[] = {3,5,3,5,7,3,4,6,2,4,4,4};
// for(int i=0;i<arr.length-1;++i){
// boolean dup=false;
// int count=1;
// for(int j=i+1; j<arr.length;++j)
// {
//     if(arr[i]==arr[j] && arr[i]!=-1)
//     {
//         ++count;
//         arr[j]=-1;
//         dup=true;
//     }
// }
// if(dup && arr[i]!=1){
//     System.out.println(arr[i] + "count is" +count);
// }
// }

// Target value.

// int  arr[]={1,4,5,3,8};
// int target=9;

// for(int i=0; i<arr.length;i++){
//     for(int j=i+1;j<arr.length;j++){
//         if(arr[i]+arr[j] == target){
//             System.out.println(arr[i]);
//             System.out.println(arr[j]);
// }
        
            
        

//   }
//  }

// Ascending order and dscending order
// int arr[]={4,7,3,9,11,6,};
// for(int i=0; i<arr.length;++i){
//     for(int j=i+1;j<arr.length;++j){
//         if(arr[i]>arr[j])
//         {
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//         }
//     }
//     System.out.println("dscending"+arr[i]);
// }

// String str1="EFGH";
// String Str2="FG";
// int i=0;
// int j=0;

// while(i<str1.length() && j<str2.length()){
//     if(str1.charAt(i)==str2.charAt(j)){
//         ++j;
//     }
//     ++i;
// }
// if(j==str2.length()) System.out.println("subsequence");
// else System.out.println("not");

// //angram sequence.

// String str1="abcd";
// String str2="dcba";

// if(str1.length()!=str2.length()){
//     System.out.println(" not anagram");
//     return;
// }

// int count[] =new int[256];
// for(int i=0;i<str1.length();++i) count[str1.charAt(i)]++;
// for(int i=0;i<str1.length();++i) count[str1.charAt(i)]--;
// for(int i=0;i<256;++i) 
// {
//     if(count[i]!=0)
//     {
//         System.out.println("not anagram");
//         return;
//     }
// }

// System.out.println(" anagram");

// String str1="AbCdE";
// char arr[]=str1.toCharArray();
// for(int i=0;i<str1.length();++i)
// {
//     if(arr[i]>='A' && arr[i]<='Z')
//     {
//         arr[i]=(char)(arr[i]+32);
//     }
//     else if(arr[i]>='a' && arr[i]<='z')
//     {
//         arr[i]=(char)(arr[i]-32);
//     }
// }
// String obj=new String(arr);
// System.out.println(obj);

// class Suppercl
// {
// int a=4;
// }
// class in extends Suppercl
// {
// public static void main(String args[] )
// {
//     Subcl obj=new  Subcl();
//     System.out.println(obj.a);
// }
// }
//  class Subcl extends  Suppercl
// {

// }
 
// interface i1
// {
//     void sum();
// }
// interface i2
// {
//     void display();
// } 

// class One implements i1,i2
// {
//     public void sum()
//     {
//         System.out.println("abhsihek mishra");
        
//     }


// public void display()
// {
//     System.out.println("avinash mishra");
// }  

// public static void main(String args[])
// {
//     One obj=new One();
//     obj.sum();
//     obj.display();


// }
// }



// interface Mahindra
// {
//     void  data();
// }

// class thar implements Mahindra
// {
//     public void data()
//     {
//         int price=125000;
//         String model="xpp";
//         System.out.println(price+""+model);
//     }
// }

// class nexon implements Mahindra{
//     public void data()
//     {
//        int price=156000;
//     String model="xuv";
//     System.out.println(price+""+model); 
//     }
    
// }

// int num=153;
// int sum=0;
// int temp=num;
// while(num>0)
// {
//     int digit=num%10;
//     sum=sum+(digit*digit*digit);
//     num=num/10;
// }
// if(temp==sum){
//     System.out.println("Armstrong");
// }
// else{
//     System.out.println("not armstrong");
// }



// }
// }

Scanner sc=new Scanner(System.in);
System.out.println("To check the number of armstrong:");

int num=sc.nextInt();

int sum=0;
int original=num;

while(num>0)
{
    int digit=num%10;
    sum=sum+digit*digit*digit;
    num =num/10;

}

if(sum==original)
{
    System.out.println("It is an armstrong");
}

else{
    System.out.println("It is not an armstrong");
}

}
    }