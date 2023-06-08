import java.util.ArrayList;

public class Index extends Sudoku {
    ArrayList<Integer> index = new ArrayList<Integer>();
    //// O ları kontrol altında tut multi dimensinol arraylist ile tekrarlı kontrol sağla!!
    private void index_memory(int[][] arr) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] == 0) {
                    index.add(i);
                }
            }

        }
    }
}
