public interface QueueBehaviour {
    void takeInQueue(People people);

    void takeOrders(People people);

    void giveOrders(People people);

    void releaseFromQueue(People people);
}