import java.util.*;
import java.util.Random;
public class stone_paper_scissors {
    public static void main(String[] args) {
        Random random=new Random();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1. STONE or 's'");
        System.out.println("2. PAPER or 'p'");
        System.out.println("3. SCISSORS or 'sc'");
        System.out.println();
        int m=0;//computer
        int n=0;//human
        
        // 0 stone
        // 1 paper
        // 2 scissor 
        
        
        while(m<=2&&n<=2){
            int x=random.nextInt(3);
            System.out.println("ENTER YOUR CHOICE");
            String choice=sc.nextLine();

            if(x==0){
                switch (choice) {
                case "s":
                System.out.println("TIE");                                                                              
                break;

                case "p":
                System.out.println("YOU WIN");
                n++;
                break;

                case "sc":
                System.out.println("COMPUTER WINS");
                m++;
                break;
                }
            }
            if(x==1){
                switch (choice) {
                    case "p":
                    System.out.println("TIE");
                    break;

                    case "sc":
                    System.out.println("YOU WIN");
                    n++;
                    break;

                    case "s":
                    System.out.println("COMPUTER WINS");
                    m++;
                    break;
                }
            }
                 
                if(x==2){
                switch (choice) {
                    case "sc":
                    System.out.println("TIE");
                    break;

                    case "s":
                    System.out.println("YOU WIN");
                    n++;
                    break;

                    case "p":
                    System.out.println("COMPUTER WINS");
                    m++;
                    break;
                }
            }
        }
        System.out.println("COMPUTER POINTS= " +m);
        System.out.println("HUMAN POINTS= " +n);
        if(m>n){
            System.out.println("FINAL WIN : COMPUTER");
        }
        else{
             System.out.println("FINAL WIN : HUMAN");

        }

    }
    
}
            
    


                        
                
                   
                