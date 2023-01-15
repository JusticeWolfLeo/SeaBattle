public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Dima", 0);
        Player player2 = new Player("Vasya", 0);

        Field field1 = new Field(player1);
        Field field2 = new Field(player2);

        player1.setField(field1);
        player2.setField(field2);

        Ship ship1 = new Ship("Onedeck", player1);
        Ship ship2 = new Ship("Twodeck", player1);
        ship1.shipSize = 1;
        ship2.shipSize = 2;

        player1.rename("Petya");
        player2.rename("Igor");
        player1.score();
        player2.score();

        String shot1 = player1.shot(1, 1);
        System.out.println(shot1);
        String shot2 = player1.shot(2, 2);
        System.out.println(shot2);

        System.out.println(ship1.getName() + " " + ship1.getShipSize());
        System.out.println(ship2.getName() + " " + ship2.getShipSize());

        System.out.println(Player1.name);
        Player1.shot(1, 2);
        Player1.score();
        getShipName();

    }
}