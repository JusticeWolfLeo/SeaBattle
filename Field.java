public static class Field {
    int[][] Field = new int[10][10];
    Player player;
    static int[] rule = new int[]{4, 3, 2, 1}; //правила игры

    Field(Player player) {
        this.player = player;
    }

    void empty(int cell1, int cell2) { //пусто
        field[cell1][cell2] = 1;
    }

    void occupied(int cell1, int cell2) { //занято
        field[cell1][cell2] = 1;
    }

    void missed(int cell1, int cell2) { //промах
        field[cell1][cell2] = 2;
    }

    void hit(int cell1, int cell2) { //попал
        field[cell1][cell2] = 3;
    }

    void destroyed(int cell1, int cell2) { //уничтожен
        field[cell1][cell2] = 4;
    }

    static int countShips() { //подсчет возможного количества кораблей
        int result = 0;
        for (int i = 0; i < rule.length; i++) {
            result += rule[i];
        }
        return result;
    }

    void status() { //просканировать и показать поле
        for (int i = 0, i <10; i++){
            for (int j = 0, j <10; j++){
                System.out.println(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}


