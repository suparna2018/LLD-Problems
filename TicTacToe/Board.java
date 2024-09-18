package TicTacToe;

public class Board {
    private static char[][] CHARS = {
        {' ','|',' ','|',' '},
        {' ','|',' ','|',' '},
        {' ','|',' ','|',' '}
    
    };

    static char Board[][]=CHARS;
   
    //A function to Display Boaed
    public static void Display(){
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(Board[i][j]);
            }
            System.out.println();
        }
    }
    //Board Operation to check Board Status 
    public static int[] checkBoardStatus(){

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                if (Board[i][j]==' '){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};

    }

    public static Boolean GameOver() {
        int pos[]=checkBoardStatus();
        int x=pos[0];
        int y=pos[1];
        if (x==-1 && y==-1){
           return true; 
        }
        else{
            return false;
        }
    }
}
