public class Player {
    String name;
    int score;

    Ship[] shipList;
    Field field;

    public Player(String name, int score) { // конструктор класса
        this.name = "Dima";
        this.score = 0;
        shipList = new Ship[Field.countShips()];
    }

    public Player(String name) {
        this.name = name;
        shipList = new Ship[Field.countShips()];
    }

    public Player(int score) {
        this.score = score;
        shipList = new Ship[Field.countShips()];
    }

    public String rename(String newName) { //метод смены имени
        name = newName;
        return "Новое имя игрока = " + name;
    }

    public String shot(int cell1, int cell2){ //удар по ячейке
        return ("Игрок" + name + "решил ударить по ячейке" + cell1 + ":" + cell2);
    }

    public void score() { // добавить 1 очко
        score += 1;
        System.out.println("Всего очков игрока : " + score);
    }

    public void setField(Field field) { // расставить поле
        this.field = field;
    }
}
