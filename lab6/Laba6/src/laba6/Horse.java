package laba6;
import java.util.Scanner;

public class Horse{
    String encoding = System.getProperty("console.encoding", "windows-1251");
    Scanner sc = new Scanner(System.in,encoding); 
    //System.out.print("");
    String n = sc.nextLine();
    private final String name = n;
    
    public String getname(){
        return name;
    }
                  
  
}

    
    

