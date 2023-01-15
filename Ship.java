public class Ship {
    byte shipSize;
    String shipTitle;

    static String onedeck = "Однопалубник";
    static String twodeck = "Двухпалубник";
    static String threedeck = "Трехпалубник";
    static String fourdeck = "Четырехпалубник";
    private String name;

    public Ship(byte shipSize, String shipTitle, String name) { // конструктор класса
        this.shipSize = shipSize;
        this.shipTitle = shipTitle;
        this.name = name;
    }

    public Ship(byte shipSize) {
        this.shipSize = shipSize;
        this.name = name;
    }

    public Ship(String shipTitle) {
        this.shipTitle = shipTitle;
        this.name = name;
    }

    public String getShipName(String shipTitle) { //получить имя
        return shipTitle;
    }

    public String getShipSize(String shipSize) { // получить размер
        return shipSize;
    }

    public Player getName() { // как зовут игрока
        return name;
    }

    public void setName(Player name) { //дать имя
        this.name = name;
    }
}
