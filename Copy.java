import java.io.*;

// class Copy
// {
//     int a;
//     Copy(int a)
//     {
//         this.a=a;
//         System.out.println(a);
//     }

// public static void main(String args[])  
// {
//     Copy obj=new Copy(11);
// }  
// }

// class Copy
// {
//     String name[];

//     Copy(String name[])
//     {
//         this.name=name;
//     }

// Copy(Copy obj) 
// {
// this.name=new String[obj.name.length];

// for(String name:obj.name)
// {

// }
// }

// public static void main(String args[])
// {
//     String name[]={"abhi","mishra"};
//     Copy obj1=new Copy(name);
//     Copy obj2=new Copy(obj1);

//     obj2.name[0]="avinash";
//     System.out.println(obj1.name[0]);
// }
// }

// class Copy{
    
// }

// public  static void main (String args[])

// {
// try
//    {

//     int a=10;
//     int b=0;
//     System.out.println(a/b);
// }
                                    
// catch(ArithmeticException obj)
// {
// System.out.println("jnfeknfk");

// }
// }

// class Arithmetic extends  RuntimeException
// {
//     Arithmetic(String msg)
//     {
//         super(msg);
//     }
// }

// class Copy
// {
//     public  static void main(String args[])
//     {
//         int a=10;
//         int b=0;
    


// try 
// {

// if(b==0) throw new Arithmetic("dont divide by zero");

// }

// catch(Arithmetic e)
// {
//     System.out.println(e);
// }

// }
// }

import java.util.Scanner;
class Copy{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=10;
        int b=0;

try{
    System.out.println(a/b);
}  

catch(Exception obj1)
{
System.out.println(a/b);
System.out.println(obj1);

}

finally
{
    obj.close();
}
    }
}















