
public class HW2 {
    public static void main(String[] args) {
        Human human = new Human("Иван");
        Human humen2 = new Human("Петр");
        Market market = new Market();
        market.acceptToMarket(human);
        market.giveOrders(human);
        market.takeOrders(human);
        market.acceptToMarket(humen2);
    }
}
