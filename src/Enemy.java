

class Enemy {
    int x;
    int y;

    Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }


    boolean moveTowardsPlayer(Player player, char[][] field) {
        int dx = Integer.compare(player.xHeroPos, this.x);
        int dy = Integer.compare(player.yHeroPos, this.y);


        if (this.x + dx == player.xHeroPos && this.y + dy == player.yHeroPos) {
            return true;
        }

        field[this.x][this.y] = '*';
        this.x += dx;
        this.y += dy;
        field[this.x][this.y] = '$';
        return false;
    }
}