import java.util.*;
import java.io.*; 
import java.util.Arrays; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class sunny
{  
    public static void main(String args[])
    { 
    System.out.print("Enter the arithmetic expression:-\n");
    Scanner sn=new Scanner(System.in);
    String str=sn.nextLine();
    String filtered = str.replaceAll("[^0-9,]"," ") ;
    String[] operands = filtered.split(" ");
    Character operators[] = new Character[10];
    int operatorCount = 0;
    for(int i = 0;i<str.length();i++)
    if(!Character.isDigit(str.charAt(i)))
    {
        operators[operatorCount++] = str.charAt(i);
    }
    for(int i=0;i<operatorCount;i++) 
    System.out.print(operators[i]+" ");
    System.out.print("\n");
    for(int i=0;i<operands.length;i++) 
    System.out.print(operands[i]+" ");
    int[] operands1=new int[operands.length];
    for(int j=0;j<operands.length;j++)
    {
    String str1=operands[j];
    Integer stringtoInteger = Integer.parseInt(str1);
    operands1[j]=stringtoInteger.intValue();
    }
    int z;
    for(z=0;z<operands.length-1;z++)
    {
    if(operators[z]==43)
    operands1[z+1]=operands1[z]+operands1[z+1]; 
   if(operators[z]==45)
   operands1[z+1]=(operands1[z]-operands1[z+1]); 
    if(operators[z]==47)
    operands1[z+1]=(operands1[z]/operands1[z+1]); 
    if(operators[z]==42)
    operands1[z+1]=(operands1[z]*operands1[z+1]);
    }
    System.out.print("\nYour Result is:- "+operands1[z]);
    }
}
