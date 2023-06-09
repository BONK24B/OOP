package OOP.HW2.SuperMarket.Classess;

import java.util.Random;

public class PromotionalClient extends Actor{
    private static int number = 0; // Всего акционных клиентов
    private int instanceNumber; // Номер конкретного акционного клиента
    private static final int MAX_INSTANCES = 2; // Максимум акционных клиентов
    private int clientId;
    private String promotionName;

    public PromotionalClient(String name, int clientId, String promotionName) {
        super(name);
        this.clientId = clientId;
        this.promotionName = promotionName;
        number += 1; // Увеличение счётчика акционных клиентов при создании экземпляра
        instanceNumber = number; // Присвоение акционному участнику номера
    }

    public int getClientId() {
        return clientId;
    }

    public String getPromotionName() {
        return promotionName;
    }

    // Геттер общего количества участников
    public int getNumber(){
        return number;
    }

    // Геттер номера участника
    public int getInstanceNumber(){
        return instanceNumber;
    }

    // Статический геттер максимального числа участников
    public static int getMaxNumber(){
        return MAX_INSTANCES;
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
