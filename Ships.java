public class Ships {
    byte ShipSize;
    String ShipTitle;

    public Ships(byte shipSize, String shipTitle) { // конструктор класса
        this.ShipSize = shipSize;
        this.ShipTitle = shipTitle;
    }

    public Ships(byte shipSize) {
        this.ShipSize = shipSize;
    }

    public Ships(String shipTitle) {
        this.ShipTitle = shipTitle;
    }

    public String getShipName(String ShipTitle) { //получить имя
        return ShipTitle;
    }
    public String getShipSize(String ShipSize) { // получить размер
        return ShipSize;
    }
}
