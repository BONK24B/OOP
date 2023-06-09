package OOP.HW2.SuperMarket.Interfacess;

import java.util.List;

import OOP.HW2.SuperMarket.Classess.Actor;

public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviour actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
