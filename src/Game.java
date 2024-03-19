import java.util.Scanner;

public class Game {
    private static final int m = 5;
    private static final int n = 5;
    private static char[][] field = new char[m][n];
    private static int playerX = 0;
    private static int playerY = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeField();
        printField();

        while (true) {
            String command = scanner.nextLine();
            switch (command) {
                case "w":
                    movePlayer(-1, 0);
                    break;
                case "a":
                    movePlayer(0, -1);
                    break;
                case "s":
                    movePlayer(1, 0);
                    break;
                case "d":
                    movePlayer(0, 1);
                    break;
                default:
                    System.out.println("Неверная команда, используйте 'w', 'a', 's', 'd' для движения.");
                    continue;
            }
            if (playerX == m - 1 && playerY == n - 1) {
                System.out.println("Игра окончена! Вы достигли финиша.");
                break;
            }
            printField();
        }
        scanner.close();
    }

    private static void initializeField() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                field[i][j] = '*';
            }
        }
        field[0][0] = '#';
    }

    private static void movePlayer(int dx, int dy) {
        int newX = playerX + dx;
        int newY = playerY + dy;

        if (newX >= 0 && newX < m && newY >= 0 && newY < n) {
            field[playerX][playerY] = '*';
            playerX = newX;
            playerY = newY;
            field[playerX][playerY] = '#';
        } else {
            System.out.println("Вы не можете выйти за границы карты!");
        }
    }

    private static void printField() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
