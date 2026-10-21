import java.util.Scanner;

class random{
    int generateRandom(){
     return ((int)(Math.random()*10/3));   
    }
}
class GameCode extends rockpaperscissor{
    String compInput;

    void CodeforRockPaperScissor(int userPoint, int compPoint){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();

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
        System.out.println("Your Point:"+userPoint);
        System.out.println("Computer Point:"+compInput);

    }
    else if("Rock".equals(input) && "Scissor".equals(compInput)){
            System.out.println("So, Rock wins, you got 1 point.");
            userPoint++;
            System.out.println("Your Point:"+userPoint);
            System.out.println("Computer Point:"+compInput);
    }
    else if("Rock".equals(input) && "Paper".equals(compInput)){
            System.out.println("So, Paper wins, computer gets 1 point.");
            compPoint++;
            System.out.println("Your Point:"+userPoint);
            System.out.println("Computer Point:"+compInput);
    }
    else if("Paper".equals(input) && "Scissor".equals(compInput)){
            System.out.println("So, Scissor wins, Computer gets 1 point.");
            compPoint++;
            System.out.println("Your Point:"+userPoint);
            System.out.println("Computer Point:"+compInput);
    }
     else if("Paper".equals(input) && "Rock".equals(compInput)){
            System.out.println("So, Paper wins, you got 1 point.");
            userPoint++;
            System.out.println("Your Point:"+userPoint);
            System.out.println("Computer Point:"+compInput);
    } else if("Scissor".equals(input) && "Paper".equals(compInput)){
            System.out.println("So, Scissor wins, you got 1 point.");
            userPoint++;
            System.out.println("Your Point:"+userPoint);
            System.out.println("Computer Point:"+compInput);
    }
     else if(input.equals("Scissor") && compInput.equals("Rock")){
            System.out.println("So, Rock wins, Computer gets 1 point.");
            compPoint++;
            System.out.println("Your Point:"+userPoint);
            System.out.println("Computer Point:"+compInput);
    }
    else{
        System.out.println("You have provided the wrong input, please try again");
        CodeforRockPaperScissor(userPoint, compPoint);
    }
    sc.close();
    }
    }
public class rockpaperscissor{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            GameCode obj=new GameCode();
            int userPoint=0;
            int compPoint=0;
            System.out.println("Welcome to the game 'Rock, Paper and Scissors'!!!");
            System.out.println("So, Let's start with the rules of the game:");
            System.out.println("Firstly, you have to choose between 'Rock', 'Paper' and 'Scissor' and then our Computer chooses randomly out of these.");
            System.out.println("Secondly, Rock>Scissor>Paper>Rock, if you have powerful one then you win otherwise you lose.");
            System.out.println("Thirdly, the game consists of 3 rounds, if you one 2 then you win otherwise you lose. ");
            System.out.println("If its a draw, then re-round will take place.");
            System.out.println("So, these are all the rules, hope you have read this, now let's proceed. Press 1 to proceed or 0 to cancel.");
            
            int proceed=sc.nextInt();
            
                switch (proceed) {
                    case 0:
                        break;
                    case 1:
                    for (int i = 1; i<=3; i++) {
                        System.out.println("Round "+i+"begins:");
                        System.out.println("Select 'Rock', 'Paper','Scissor':");
                        obj.CodeforRockPaperScissor( userPoint, compPoint);
                    }
                    break;

                    default:
                        System.out.println("Sorry you have press the wrong choice, try again!!!");
                        break;
            }
            if(userPoint>compPoint)
                System.out.println("Congratulations!!!!!! you have won the game.");
            else if(userPoint<compPoint)
                System.out.println("Oops!!! You have lost the game.");
            else
                System.out.println("Ohh, the game ends in a draw. Both played well.");
        }
    }
}