import java.util.*;
import java.io.*; 
import java.util.Arrays; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
class alphabet extends Thread
{
    public void run()
    {
    try
     {
      File f1=new File("words.txt");
      File fileWrite = new File("output.txt");
      FileWriter writer = null;
      String[] words=null;
      int wc=0;
      FileReader fr = new FileReader(f1);
      BufferedReader br = new BufferedReader(fr);
      String s;
      char ch;
      int p=0,a=0,r=0,e=0,u=0,v=0,g=0,l=0,m=0,n=0,o=0;
      while((s=br.readLine())!=null)
      {
         int n1=s.length();
         for(int i=0;i<n1;i++)
         {
             ch=s.charAt(i);
             if(ch=='p' || ch=='P')
             p++;
             if(ch=='a'|| ch=='A')
             a++;
             if(ch=='r'|| ch=='R')
             r++;
             if(ch=='e'|| ch=='E')
             e++;
             if(ch=='u'|| ch=='U')
             u++;
             if(ch=='v'|| ch=='V')
             v++; 
             if(ch=='g'|| ch=='G')
             g++;
             if(ch=='l'|| ch=='L')
             l++;
             if(ch=='m'|| ch=='M')
             m++;
             if(ch=='n'|| ch=='N')
             n++;
             if(ch=='o'|| ch=='O')
             o++;
         }
      }
      fr.close();
      fileWrite.createNewFile();
      writer = new FileWriter(fileWrite);
      writer.write("p="+p+" a="+a+" r="+r+" e="+e+" u="+u+" v="+v);
      writer.write("\n");
      writer.write("g="+g+" l="+l+" m="+m+" n="+n+" o="+o);  
      writer.flush();
      writer.close();
      System.out.println("Your Program is Compiled Successfully\n Show your output in output.txt");
     }
    catch (FileNotFoundException e) 
            {
                e.printStackTrace();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
    }
}
class Ass_09_1
{
    public static void main(String arg[])
    {
        new alphabet().start();
    }
}
