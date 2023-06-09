package OOP.HW2.SuperMarket.Classess;

import java.util.ArrayList;
import java.util.List;

import OOP.HW2.SuperMarket.Interfacess.iActorBehaviour;
import OOP.HW2.SuperMarket.Interfacess.iMarketBehaviour;
import OOP.HW2.SuperMarket.Interfacess.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour{

    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
        Logger.textLog(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehaviour actor:queue)
        {
         if(actor.isTakeOrder())
         {
             releaseActors.add(actor.getActor());
             System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
             Logger.textLog(actor.getActor().getName()+" клиент ушел из очереди ");
            }
 
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                actor.getActor().returnOrder();
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
                Logger.textLog(actor.getActor().getName()+" клиент сделал заказ ");
            }
        }
    }

    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
                Logger.textLog(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        // Проверка клиента на экземпляр класса PromotionalClient
        if (actor instanceof PromotionalClient){
            // Если клиент является экземпляром этого класса, происходит его приведение к нему
            PromotionalClient prom = (PromotionalClient) actor;
            // Если номер участника превышает лимит участников акции, он не проходит в магазин
            if (prom.getInstanceNumber() > PromotionalClient.getMaxNumber()){
                System.err.println("превышен лимит акционных клиентов");
                Logger.textLog("превышен лимит акционных клиентов");
            }
            // Иначе он кастуется обратно в iActorBehaviour и допускается в магазин
            else{
                iActorBehaviour act = (iActorBehaviour) prom;
                System.out.println(act.getActor().getName()+" клиент пришел в магазин ");
                Logger.textLog(act.getActor().getName()+" клиент пришел в магазин ");
                takeInQueue(act);
            }
        }
        else{
            System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
            Logger.textLog(actor.getActor().getName()+" клиент пришел в магазин ");
            takeInQueue(actor);
        }
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            Logger.textLog(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
    
}
