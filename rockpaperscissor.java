
import java.util.Scanner;

class random{
    int generateRandom(){
     return ((int)(Math.random()*10/3));   
    }
}
class GameCode{
    String compInput;
    void CodeforRockPaperScissor(String input){
        random ran=new random();
        while(true){
          int n=ran.generateRandom();
        switch (n) {
            case 1:
                compInput="Rock";
                break;
            case 2:
                compInput="Paper";
                break;
            case 3:
                compInput="Scissor";
                break;
            default: continue;
        }//switch
        break;
    }//while
     System.out.println("Your: "+input);
     System.out.println("Computer: "+compInput);

    if( input == null ? compInput == null : input.equals(compInput)){
        System.out.println("It's a draw, both are same, so get no point.");
    }
    else if(input=='Rock'&& compInput=='Scissor')
            System.out.println();
    }
    }
}
public class rockpaperscissor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to the game 'Rock, Paper and Scissors'!!!");
        System.out.println("So, Let's start with the rules of the game:");
        System.out.println("Firstly, you have to choose between 'Rock', 'Paper' and 'Scissor' and then our Computer chooses randomly out of these.");
        System.out.println("Secondly, Rock>Scissor>Paper>Rock, if you have powerful one then you win otherwise you lose.");
        System.out.println("Thirdly, the game consists of 3 rounds, if you one 2 then you win otherwise you lose. ");
        System.out.println("If its a draw, then re-round will take place.");
        System.out.println("So, these are all the rules, hope you have read this, now let's proceed. Press 1 to proceed or 0 to cancel.");

        int proceed=sc.nextInt();
        for(int i=1;i<=3;i++){
            if(proceed==0)
                break;
            else if(proceed==1){
                System.out.println("Round "+i+"begins:");
                System.out.println("Select 'Rock', 'Paper','Scissor':");
                String input=sc.next();
            }
            else {
                System.out.println("Sorry you have press the wrong, try again!!!");
                break;
            }
        }
        GameCode obj=new GameCode();
        obj.CodeforRockPaperScissor("Rock");
    }
}