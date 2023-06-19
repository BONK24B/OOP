package HW2.SuperMarket.Classess;

import java.util.Random;

import HW2.SuperMarket.Interfacess.iActorBehaviour;
import HW2.SuperMarket.Interfacess.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public boolean isReturnOrder() {
        Random rand = new Random();
        int randNumber = rand.nextInt(2); // Случайное число от 0 до 1
        
        if (randNumber == 1)
            return true;
        else
            return false;
    }

    @Override
    public void returnOrder() {

        isReturnOrder();

        // Если isReturnOrder возвращает true, клиент возвращает товар
        if (isReturnOrder()){
            System.out.println("Клиент возвращает заказ");
            Logger.textLog("Клиент возвращает заказ");
        }
    }

    abstract public String getName();
}
