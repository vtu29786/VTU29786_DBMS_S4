import java.util.Scanner;
public class salary{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int salary[]=new int[n];
for(int i=0;i<n;i++){
salary[i]=sc.nextInt();
}
int upsalary[]=new int[n];
for(int i=0;i<n;i++){
upsalary[i]=salary[i]+(salary[i]*10/100);
}
for(int i=0;i<n;i++){
System.out.print(upsalary[i]+" ");
}
}
}