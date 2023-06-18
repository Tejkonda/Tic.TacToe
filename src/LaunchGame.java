public class LaunchGame {
    public static void main(String args[]){
        TicTacToe T= new TicTacToe();
        T.displayBoard();
        T.placeMark(0,0,'X');
        T.placeMark(1,1,'X');
        T.placeMark(2,2,'X');
        T.displayBoard();
        System.out.println(T.checkRowWin());
        System.out.println(T.checkColWin());
        System.out.println(T.checkDiagonalWin());
    }
}
