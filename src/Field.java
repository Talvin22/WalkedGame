public class Field {
    protected final int m = 5;
    protected final int n = 5;
    protected char[][] field = new char[m][n];

    protected void initializeField() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                field[i][j] = '*';
            }
        }
        field[0][0] = '#';
    }

    protected void printField() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }


}
