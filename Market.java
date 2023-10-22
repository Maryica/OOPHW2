import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<People> queue;
    private List<People> market;

    public Market() {
        queue = new ArrayList<>();
        market = new ArrayList<>();
    }

    @Override
    public void takeInQueue(People people) {
        queue.add(people);
        System.out.println(people.getName() + " становится в очередь");
    }

    @Override
    public void takeOrders(People people) {
        people.setTakeOrder(true);
        System.out.println(people.getName() + " получает заказ");
    }

    @Override
    public void giveOrders(People people) {
        people.setMakeOrder(true);
        System.out.println(people.getName() + " делает заказ");

    }

    @Override
    public void releaseFromQueue(People people) {
        queue.remove(people);
        System.out.println(people.getName() + " покидает очередь");

    }

    @Override
    public void acceptToMarket(People people) {
        market.add(people);
        System.out.println(people.getName() + " входит в магазин");

    }

    @Override
    public void releaseFromMarket(People people) {
        market.remove(people);
        System.out.println(people.getName() + " покидает магазин");

    }

    @Override
    public void update() {
        for (int i = 0; i < market.size(); i++) {
            System.out.printf(market.get(i).getName() + ", ");
        }
        System.out.println("в магазине");
    }
}
