public class Player {
    protected int playerX = 0;
    protected int playerY = 0;


    protected void movePlayer(int dx, int dy, char[][] field) {
        int newX = playerX + dx;
        int newY = playerY + dy;

        if (newX >= 0 && newX < field[0].length && newY >= 0 && newY < field.length) {
            field[playerX][playerY] = '*';
            playerX = newX;
            playerY = newY;
            field[playerX][playerY] = '#';
        } else {
            System.out.println("Вы не можете выйти за границы карты!");
        }

    }
}
