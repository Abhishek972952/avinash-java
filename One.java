import java.util.Scanner ;

 class One
{
    public static void main(String args[])
   { 


// int arr[] = {4,5,8,6,4,5,7,8,5};
// for(int i=0; i<arr.length-1;i++)
// {
//     boolean dup=false;
//     for(int j=i+1; j<arr.length;++j)
//     {
//         if(arr[i]==arr[j] &&  arr[i]!=-1)
//         {
//             arr[j]=-1;
//             dup=true;
            
//         }
//     }

//     if(dup)
//     {
//         System.out.println(arr[i]);
        
//     }
// }

// int arr[] = {4,5,8,6,4,5,7,8,5};
// for(int i=0; i<arr.length-1;i++)
// {
//     boolean dup=false;
//     int count=1;
//     for(int j=i+1;j<arr.length;++j)
//     {
//         if(arr[i]==arr[j] &&  arr[i]!=-1)
//         {
//             ++count;
//             arr[j]=-1;
//             dup=true;
            
//         }
//     }
//     if(dup && arr[i]!=1)
//     {
//         System.out.println(arr[i]+ "counts" +count);
//     }


//  } 
// int  arr[]={1,4,5,3,8};
// int targt=9;

// for(int i=0; i<arr.leght;i++){
//     for(j=i+1;j<arr.lenght;j++){
//         if(arr[j]+arr[i]=Target){
//             System.out.println(arr[i]);
//             System.out.println(arr[]);
//         }
        
            
        

//  }
// }

// int arr[]={1,2,3,4,5}
// target=7

// for(int i=0; i<arr.length;i++){
//     for(int j=i+1=; j<arr.length;j++){
//         if(arr[i]+arr[j]==target){
//             System.out.println();
//         }
//     }

// }

// int arr[]={1,6,0,2};
// int index=0;

// for(int i=0;i<arr.length;++i){
//     if(arr[i]!= 0){
//         arr[index++]=arr[i];
//     }
// }
// for(int i=index;i<arr.length;++i)  
// arr[i]=0;
// for(int i=0; i<arr.length; ++i) 
// System.out.println(arr[i]);


// string=array of character
//variable=non quotable
//string=double quotable

//char At(0)

// Scanner sc=new Scanner(System.in);
// String name=sc.nextLine();
// System.out.println("your name is" + name);

// String firstName= "abhi";
// String lastName= "mishra";

// String fullname= firstName+lastName;

// System.out.println(fullName);

String st="[{({})]";
int curly=0;
int sq=0;
int cir=0;


for(int i=0; i<st.length();++i)
{
char c=st.charAt(i);
if(c=='{') ++curly;
if(c=='[') ++sq;
if(c=='(') ++cir;

if(c=='}') --curly;
if(c==']') --sq;
if(c==')') --cir;
}
if(curly==0 && sq==0 && cir==0) System.out.println("bal");
else System.out.println("not");


}
}
 

 

