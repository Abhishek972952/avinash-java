import java.util.*;

class Pattern
{
   public static void main(String args[])
   {
    // int n=4;
    int m=5;

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=m;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    int n=4;
for(int i=1; i<=n; i++)
{
    for(int j=1; j<=(n-i); j++)
    {
        System.out.print(" ");
    }

    for(int j=1;j<=(2*i)-1;j++)

    {
        System.out.print("*");
    }

    System.out.println("");

}

for(int i=n;i>=1;i--)
{
    for(int j=1;j<=(n-i);j++)
    {
        System.out.print("");
    }

    for(int j=1;j<=(2*i)-1;j++)

    {
        System.out.print("*");
    }

    System.out.println();

   }

int n=4;
int m=5;

for(int i=1;i<=n;i++)
{
    for(int j=1;j<=m;j++)
    {
        if(i==1 || j==1 || i==n || j==m)
        {
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}

int n=4;

for(int i=n;i>=1;i--)
{

    for(int j=1;j<=(n-i);j++)
    {
        
        System.out.print(" ");
    }

    for(int j=1;j<=i;j++)
    {
        
        System.out.print("*");
    }


    System.out.println();
}

for(int i=n;i>=1;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
 System.out.println();
}

int n=5;

for(int i=1;i<=n;i++)
{

    for(int j=1;j<=i;j++)
    {
        
        System.out.print(" "+j);
    }
System.out.println();

}

int n=5;
int number=1;

for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(" "+number);
        number++;
    }

    System.out.println();
}

Scanner sc=new Scanner(System.in);

System.out.println("enter a number");
int num=sc.nextInt();

boolean prime=true;

for(int i=2;i<=num/2;i++)
{
    if(num%i==0)
    {
        prime=false;
        break;
    }
  
}
if(prime)
{
    if(num==1)
    {
        System.out.println("this is prime not composite");
    }

    else{
         System.out.println("prime number");
    }

   
}
else{
        System.out.println("not prime");
    }

}
}