
package javaexample101datareadwritefromtofile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class JavaExample101DataReadWriteFromToFile {

    
    public static void main(String[] args) {
        
        String fil = "DataFile.txt";
        
        try{
            
            // ==== Write Part =================================================
            
            PrintWriter pw = new PrintWriter(fil);
            
            pw.println("First number|" + 1);
            pw.println("Second number|" + 2);
            pw.println("Third number|" + 3);
            pw.println("Fourth number|" + 4);
            
            pw.close();
            
            // ==== Read Part ==================================================
            
            FileReader fr = new FileReader(fil);
            
            BufferedReader br = new BufferedReader(fr);
            
            String line = "";
            String[] tokens = null;
            int num=0;
            int sum =0;
            String myWord = "";
            
            line = br.readLine();
            while(line != null)
            {
                tokens = line.split("[|]");
                myWord = tokens[0];
                num = Integer.parseInt(tokens[1]);
                sum = sum + num;
                
                System.out.println(myWord +" ----> "+ num);
                
                line = br.readLine();
            }// end-while
            System.out.println("The sum is: "+sum);
            
            br.close();
            
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        
    }
    
}
