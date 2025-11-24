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

class Copy
{
    String name[];

    Copy(String name[])
    {
        this.name=name;
    }

Copy(Copy obj) 
{
this.name=new String[obj.name.length];

for(String name:obj.name)
{

}
}

public static void main(String args[])
{
    String name[]={"abhi","mishra"};
    Copy obj1=new Copy(name);
    Copy obj2=new Copy(obj1);

    obj2.name[0]="avinash";
    System.out.println(obj1.name[0]);
}
}



