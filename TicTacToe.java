public class TicTacToe {

	int[] rr;
	int[] cc;
	int d1;
	int d2;
	int n;
	
	public TicTacToe(int n) {
		rr = new int[n];
		cc = new int[n];
		d1 = 0;
		d2 = 0;
		this.n = n;
	}
	
	public int move(int row, int col, int player) {
		int toAdd = player == 1 ? 1 : -1;
		int target = player == 1 ? n : -n;
		if(row == col) {
			d1 += toAdd;
			if(d1 == target) {
				return player;
			}
		}
		if(row + col + 1 == n){
			d2 += toAdd;
			if(d2 == target) {
				return player;
			}
		}
		rr[row] += toAdd;
		cc[col] += toAdd;
		if(rr[row] == target || cc[col] == target) {
			return player;
		}
		return 0;
	}

}
