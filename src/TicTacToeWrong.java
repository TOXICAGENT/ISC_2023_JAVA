import java.util.Scanner;
public class TicTacToeWrong
{
    String a[][]={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    public static void main(String args[])
    {
        TicTacToeWrong obj = new TicTacToeWrong();
        Scanner ob = new Scanner(System.in);
        int A=0, B=0,loc=0;
        int ans;
        String player="";
        System.out.println("Welcome to 2 player Tic Tac Toe...A (x) will play first and then B(o)");
        System.out.println("To place your sign, enter the number you want it to be in when requested...???");
        obj.printMatrice();
        for(int i=1; i<6; i++)
        {
            System.out.println("A's Turn now");
            int en = ob.nextInt();
            if(en<1 || en>9) 
            {
                System.out.println("Wrong choice, enter again: ");
                loc = ob.nextInt();
            }
            else loc = en;
            player="A";
            obj.input(loc, player);
            obj.printMatrice();
            ans = obj.matriceAnalyse(player);            
            if(ans==1) break;
            
            if(i!=5)
            {
               player="B";
               System.out.println("B's turn now");
               en = ob.nextInt();
               if(en<1 || en>9) 
               {
                System.out.println("Wrong choice, enter again: ");
                loc = ob.nextInt();
               }
               else loc = en;
               obj.input(loc,player);
               obj.printMatrice();
               ans = obj.matriceAnalyse(player);
              if(ans==1) 
              {
                break;
              } 
            }
            if(i==5 && ans!=1) System.out.println("Its a draw...");
        }
        System.out.println("Thanks for playing");
    }
    void printMatrice()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" | ");
            }
            System.out.println();
            System.out.println("---------------");
        }
    }
    void input(int loc, String player)
    {
        if(player.equals("A"))
        {
            switch(loc)
            {
                case 1: a[0][0]="x"; break;
                case 2: a[0][1]="x"; break;
                case 3: a[0][2]="x";break;
                
                case 4: a[1][0]="x"; break;
                case 5: a[1][1]="x"; break;
                case 6: a[1][2]="x"; break;
                
                case 7: a[2][0]="x"; break;
                case 8: a[2][1]="x"; break;
                case 9: a[2][2]="x"; break;
            }
        }
        else if(player.equals("B"))
        {
            switch(loc)
            {
                case 1: a[0][0]="o";break;
                case 2: a[0][1]="o";break;
                case 3: a[0][2]="o";break;
                
                case 4: a[1][0]="o";break;
                case 5: a[1][1]="o";break;
                case 6: a[1][2]="o";break;
                
                case 7: a[2][0]="o";break;
                case 8: a[2][1]="o";break;
                case 9: a[2][2]="o";break;
            }
        }
        else 
        System.out.println("Error. Restart");
    }
    int matriceAnalyse(String player)
    {
        String line="";
        for(int i=1;i<=8;i++)
        {
            switch(i)
            {
                case 1: line = a[0][0]+a[0][1]+a[0][2];break;
                case 2: line = a[1][0]+a[1][1]+a[1][2];break;
                case 3: line = a[2][0]+a[2][1]+a[2][2];break;
                
                case 4: line = a[0][0]+a[1][0]+a[2][0];break;
                case 5: line = a[1][0]+a[1][1]+a[1][2];break;
                case 6: line = a[2][0]+a[2][1]+a[2][2];break;
                
                case 7: line = a[0][0]+a[1][1]+a[2][2];break;
                case 8: line = a[0][2]+a[1][1]+a[2][0];break;
            }
            if(line.equals("xxx"))
            {
                System.out.println("A is the winner✌");
                return 1;
            }
            else if(line.equals("ooo"))
            {
                System.out.println("B is the winner✌");
                return 1;
            } 
        }
        return 0;
    }    
}
