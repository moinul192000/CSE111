import java.util.Scanner;
public class Tictac{
  public static void play(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your symbol. You can enter either X or O");
    System.out.println("Select Player 1 Symbol: ");
    char Player1 = sc.next().charAt(0);
    System.out.println("Select Player 2 Symbol: ");
    char Player2 = sc.next().charAt(0);

    char board[] = new char[10];
      for(int i=1; i<10; i++){
        int temp;
        if(i%2!=0){
          System.out.println("Player1 Turn");
          temp = sc.nextInt();
          if(board[temp]=='X' || board[temp] == 'O'){
            System.out.println("Slot is already Filled");
            i--;
          }else{
            board[temp]=Player1;
          }
        }else{
           System.out.println("Player2 Turn");
           temp = sc.nextInt();
           if(board[temp]=='X' || board[temp] == 'O'){
            System.out.println("Slot is already Filled");
            i--;
          }else{
            board[temp]=Player2;
          }
          }
          printboard(board);
          String result = checkWinner(board);
          if(result != ""){
            System.out.println(result);
            break;
          }
        }
    }
   public static void printboard(char board[]){
      System.out.println("---|---|---");
      System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
      System.out.println("|-----------|");
      System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
      System.out.println("|-----------|");
      System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
      System.out.println("---|---|---");
    }

  static String checkWinner(char board[]) {
  for (int a = 0; a <= 7; a++) {
   String line = null;
   switch (a) {
   case 0:
    line = ""+board[1] + board[2] + board[3];
    break;
   case 1:
    line = ""+board[4] + board[5] + board[6];
    break;
   case 2:
    line = ""+board[7] + board[8] + board[9];
    break;
   case 3:
    line = ""+board[1] + board[4] + board[7];
    break;
   case 4:
    line = ""+board[2] + board[5] + board[8];
    break;
   case 5:
    line = ""+board[3] + board[6] + board[9];
    break;
   case 6:
    line = ""+board[1] + board[5] + board[9];
    break;
   case 7:
    line = ""+board[3] + board[4] + board[7];
    break;
   }
   if (line.equals("XXX")) {
    return "X is winner";
   } else if (line.equals("OOO")) {
    return "O is winner";
   }
  }
  return "";
  }

   public static void main(String args[]){
     play();
   }
}
