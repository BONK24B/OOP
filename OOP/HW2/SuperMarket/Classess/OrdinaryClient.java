package HW2.SuperMarket.Classess;

import java.util.Random;

public class OrdinaryClient extends Actor{
    public OrdinaryClient(String name) {
        super(name);
      }
  
      @Override
      public String getName() {
          return super.name;
      }
  
      public boolean isTakeOrder() {
        return super.isTakeOrder;
      }
  
      public boolean isMakeOrder() {
        return super.isMakeOrder;
      }
  
      public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
      }
      
      public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
      }
  
      public Actor getActor() {
        return this;
      }

      @Override
    public boolean isReturnOrder() {
        Random rand = new Random();
        int randNumber = rand.nextInt(2);
        
        if (randNumber == 1)
            return true;
        else
            return false;
    }

    @Override
    public void returnOrder() {

        isReturnOrder();

        if (isReturnOrder()){
            System.out.println("Клиент возвращает заказ");
            Logger.textLog("Клиент возвращает заказ");
        }
    }
}
