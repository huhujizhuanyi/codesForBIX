import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TestTictactoe {
    TicTacToe ticTactoe = new TicTacToe(3);

    @Test
    public void TestWinWhenTheWholeHorizontalLine(){
        ticTactoe.move(0,0,1); //X
        ticTactoe.move(0,1,2); //O
        ticTactoe.move(1,0,1); //X
        ticTactoe.move(1,1,2); //O
        assertThat(ticTactoe.move(2,0,1)) == 1); //X
    }

    @Test
    public void TestWinWhenTheWholeVerticalLine(){
        ticTactoe.move(0,0,1); //X
        ticTactoe.move(1,0,2); //O
        ticTactoe.move(0,1,1); //X
        ticTactoe.move(1,1,2); //O
        ssertThat(ticTactoe.move(0,2,1)) == 1); //X
    }
    //
    @Test
    public void TestWinWhenBottomToTopDiagonalLine(){
        ticTactoe.move(0,2,1); //X
        ticTactoe.move(1,0,2); //O
        ticTactoe.move(1,1,1); //X
        ticTactoe.move(1,2,2); //O
        assertThat(ticTactoe.move(2,0,1)) == 1); //X
    }
}
