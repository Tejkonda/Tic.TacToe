public class LaunchGame {
    public static void main(String args[]){
        TicTacToe T= new TicTacToe();
        T.displayBoard();
        T.placeMark(2,1,'X');
        T.placeMark(1,1,'O');
        T.placeMark(0,2,'O');
        T.displayBoard();
        System.out.println(T.checkRowWin());
    }
}
