import java.util.Scanner;

public class compiler {
    int node[] = new int [100];
    int ptr;
    
    public compiler() {
        for(int i = 0; i<100; i++)
            node[i]= 0;
        ptr = 0;
        
    }
    
    public void execute(String s) 
    { 
        char ch,ch1;
        Scanner sc = new Scanner (System.in);
        
       for(int i = 0; i< s.length();i++)
        {
            ch = s.charAt(i);
            
            
            
        
        switch (ch)
        {
            case '+' : 
                        if (node[ptr] >= 255)
                            node[ptr] = 0 + (node[ptr]-255);
                        else 
                            node[ptr]++;
                        
                    
            break;
        
            case '-' : 
                       if (node[ptr] <= 0)
                       node[ptr] = 255- node[ptr];
                     else 
                    node[ptr]--;
                   
            
            break;
            
            case '.' : 
                System.out.print((char)node[ptr]);
                //System.out.println(node[ptr]);
                
                
            
            break;
            
            case ',' :  System.out.println("Enter Exactly 1 character");
                        node[ptr] = sc.next().charAt(0);
                        
            break;
            
            case '>' : 
                         ptr++;
            break;
            
            case'<' : ptr--; 
                      if(ptr<0)ptr=0;
            break;
            case '[' : if(node[ptr]==0) {
                for(int j = i+1; j<= s.length(); j++) {
                    ch1 = s.charAt(j);
                    if(ch1 == ']'){
                     i = j;
                     break;
                     }
                }
            }
            
            break;
            
            case ']' : if(node[ptr]!=0) {
                for(int j = i-1; j>=0; j--) {
                    ch1 = s.charAt(j);
                    if(ch1 == '['){
                     i = j;
                     break;
                     }
                }
                }
                
            break;
            default : continue;
    }
            //System.out.println(i);
            //System.out.println((char)ch);
            //System.out.println(ptr);
            //System.out.println(node[ptr]);
  }
    }
    
    
        public static void main(String args[]) {
            System.out.println("\f");
            Scanner sc = new Scanner(System.in);
            compiler c = new compiler();
           
            //Code to print Hello World! for those classy few
            //c.execute("-[------->+<]>-.-[->+++++<]>++.+++++++..+++.[--->+<]>-----.---[->+++<]>.-[--->+<]>---.+++.------.--------.-[--->+<]>.");
            
           //Code to print all the letters of the alphabet
           //c.execute("--[----->+<]>-----.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.+.");
            
           //Code To Print April Fools! 
           //c.execute("+++++[->----[---->+<]>++.-[++++>---<]>.++.---------.+++.[++>---<]>--.++[->+++<]>.+++++++++..---.+++++++.+[-->+++++<]>-.<]");
           
           //Code to print character with double ascii value of inputted
            // c.execute(">>,[>++<-]>.");
            
            //Code to execute inputted code
            //c.execute(sc.next());
            
            //Code to add two numbers
            //c.execute(">,>,[<+>-]<------------------------------------------------.");
        }

}
