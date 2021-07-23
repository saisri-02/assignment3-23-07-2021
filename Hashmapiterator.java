import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size: ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the Key elements: ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int b[]=new int[n];
System.out.println("Enter the Value elements: ");
for(int i=0;i<n;i++)
b[i]=sc.nextInt();
HashMap<Integer,Integer> hm=new HashMap<>();
for(int i=0;i<n;i++)
{
hm.put(a[i],b[i]);
}
Iterator itr=hm.keySet().iterator();
Iterator it=hm.values().iterator();
while(itr.hasNext() && it.hasNext())
{
Integer i=(Integer)itr.next();
Integer in=(Integer)it.next();
System.out.println(i+" "+in);    
}
}
}

output:

Enter the Size: 
5
Enter the Key elements: 
1 2 3 4 5
Enter the Value elements: 
12 34 56 78 90
1 12
2 34
3 56
4 78
5 90