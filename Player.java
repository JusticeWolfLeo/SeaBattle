public class Player {
    String name;
    int score;


    public Player(String name, int score) { // конструктор класса
        this.name = "Dima";
        this.score = 0;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(int score) {
        this.score = score;
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
}
