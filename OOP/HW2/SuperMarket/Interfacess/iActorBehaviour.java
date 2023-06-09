package OOP.HW2.SuperMarket.Interfacess;

import OOP.HW2.SuperMarket.Classess.Actor;

public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
}
