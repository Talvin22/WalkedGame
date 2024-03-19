import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        Field field = new Field();
        Scanner scanner = new Scanner(System.in);

        field.initializeField();
        field.printField();

        while (true) {
            String command = scanner.nextLine();
            switch (command) {
                case "w":
                    player.movePlayer(-1, 0, field.field);
                    break;
                case "a":
                    player.movePlayer(0, -1, field.field);
                    break;
                case "s":
                    player.movePlayer(1, 0, field.field);
                    break;
                case "d":
                    player.movePlayer(0, 1, field.field);
                    break;
                default:
                    System.out.println("Неверная команда, используйте 'w', 'a', 's', 'd' для движения.");
                    continue;
            }
            if (player.playerX == field.m - 1 && player.playerY == field.n - 1) {
                System.out.println("Игра окончена! Вы достигли финиша.");
                break;
            }
            field.printField();
        }
        scanner.close();
    }
}
