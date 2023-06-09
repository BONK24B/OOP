package OOP.HW2.SuperMarket.Interfacess;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}
