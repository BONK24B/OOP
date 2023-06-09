package OOP.HW2.SuperMarket;

import OOP.HW2.SuperMarket.Classess.Market;
import OOP.HW2.SuperMarket.Classess.OrdinaryClient;
import OOP.HW2.SuperMarket.Classess.PromotionalClient;
import OOP.HW2.SuperMarket.Classess.SpecialClient;
import OOP.HW2.SuperMarket.Interfacess.iActorBehaviour;

public class MainApp {
    public static void main(String[] args) {
        Market market = new Market();
        iActorBehaviour client4 = new PromotionalClient("Grzegorz", 14, "Kick the Baby");
        iActorBehaviour client5 = new PromotionalClient("Bob", 44, "Buckwheat eater");
        iActorBehaviour client1 = new OrdinaryClient("Albert");
        iActorBehaviour client2 = new SpecialClient("Adam", 1);
        iActorBehaviour client = new PromotionalClient("Kiryu", 12, "Rice enjoyer");

        market.acceptToMarket(client4);
        market.acceptToMarket(client5);
        market.acceptToMarket(client2);
        market.acceptToMarket(client1);
        market.acceptToMarket(client);

        market.update();
        
    }
}