# Second
import java.io.*;
import java.util.*;
public class Second
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers");
int numbers[]={45,54,66,96,89};
Arrays.sort(numbers);
System.out.println("Second largestnumber:"+numbers[numbers.length-2]);
}
}
