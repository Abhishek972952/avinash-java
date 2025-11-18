import java.util.Scanner;
public class Practice{
    public static void main(String  args[]){

//duplicate value.

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

//Target value.

// int  arr[]={1,4,5,3,8};
// int target=9;

// for(int i=0; i<arr.length;i++){
//     for(int j=i+1;j<arr.length;j++){
//         if(arr[i]+arr[j] == target){
//             System.out.println(arr[i]);
//             System.out.println(arr[j]);
//         }
        
            
        

//   }
//  }

//Ascending order and dscending order
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

String str1="EFGH";
String Str2="FG";
int i=0;
int j=0;

while(i<str1.length() && j<str2.length()){
    if(str1.charAt(i)==str2.charAt(j)){
        ++j;
    }
    ++i;
}
if(j==str2.length()) System.out.println("subsequence");
else System.out.println("not");

//angram sequence.

String str1="abcd";
String str2="dcba";

if(str1.length()!=str2.length()){
    System.out.println(" not anagram");
    return;
}

int count[] =new int[256];
for(int i=0;i<str1.length();++i) count[str1.charAt(i)]++;
for(int i=0;i<str1.length();++i) count[str1.charAt(i)]--;
for(int i=0;i<256;++i) 
{
    if(count[i]!=0)
    {
        System.out.println("not anagram");
        return;
    }
}

System.out.println(" anagram");
}
}