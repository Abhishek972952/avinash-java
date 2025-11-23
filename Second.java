// import java.util.Scanner ;

//  class Second
// {
//     public static void main(String args[])
//    { 
// 
// String firstname="abhi";
// String Lastname="mishra" ;

// String fullname = firstname+lastname;

// System.out.println(fullname);

// String st="[{({})]";
// int curly=0;
// int sq=0;
// int cir=0;


// for(int i=0; i<st.length();++i)
// {
// char c =st.charAt(i);
// if(c=='{') ++curly;
// if(c=='[') ++sq;
// if(c=='(') ++cir;

// if(c=='}') --curly;
// if(c==']') --sq;
// if(c==')') --cir;
// }
// if(cir==0 && sq==0 && curly==0) System.out.println("bal");
// else System.out.println("not");

// String s1="Abcd";
// String s2="bc";

//  int i=0;
// for(int i=0;i<s1.length();++i){
//     if(j<s2.length() && s1.charAt(i)=s2.charAt(j)){
        
//     }
        

//     }
//     if(i==s1.length()){
//         System.out.print("sub seq of bc");
//     }
//     else{
//         System.out.println("not");
//     }

// String str="noon";
// for(int i=0; i<str.length()/2;++i){
//     int n=str.length();
//     if(str.charAt(i)==str.charAt(n-1-i)){
//         System.out.println("pallindrom");
//     }
//     else{
//                System.out.println("not");

//     }
// }

    // String word="hug";
    // for(int i=0;i<word.length();++i){
    //     for(int j=0;j<word.length();++j){
    //         for(int k=0;k<word.length();++k){
    //             if(i!=j && j!=k && i!=k){
 
    //                 char a=word.charAt(i);
    //                 char b=word.charAt(j);
    //                 char c=word.charAt(k);
    //                 System.out.println(""+a+b+c);
    //             }
    //         }
    //     }

    // }
    
// String name="avinash";
// char ar[]=name.toCharArray();
// int start=0;
// int end=ar.length -1;   

// while(start<end){
//     char temp=ar[start];
//     ar[start]=ar[end];
//     ar[end]=temp;

//     start++;
//     end--;
// }
// String rev=new String(ar);
// System.out.println(rev);
    
// int arr[]={8,7,5,6,7,34,};
// int max=arr[0];
// for(int i=0; i<arr.length;i++){
//     if(arr[i]>max){
//         max=arr[i];
//     }
// }
// System.out.println("max value is " +max);   

// }
// }

// int arr[]={1,3,5,7,3,6,8};
// for(int i=0;i<arr.length;i++){
//     int count=1;
//     for(int j=i+1;j<arr.length;j++){
//             if(arr[i]==arr[j]){
//                 count++;
//             }
//             if(i!=0 && arr[i]==arr[i-1]) 
//             { 
//                 break;
//             }
        

//         System.out.println(arr[i] +"=> " +count);
//     }
// }

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

// }
// }
interface Mahindra
{
    void  data();
}

class thar implements Mahindra
{
    public void data()
    {
        int price=125000;
        String model="xpp";
        System.out.println(price+""+model);
    }
}

class nexon implements Mahindra{
    public void data()
    {
       int price=156000;
    String model="xuv";
    System.out.println(price+""+model); 
    }
    
}
   
   




