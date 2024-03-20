
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{

    List<Actor> queue = new LinkedList<>();
    Queue<Actor> actorsQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " зашел в магазин");
        takeInQueue(actor);    
    }

    
    @Override
    public void takeInQueue(Actor actor){
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " добавен в очередь");
    }

    @Override
    public void takeOrders() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + " сделан заказ");
        giveOrders();
    }

    @Override
    public void giveOrders() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " выдан заказ");
        releaseFromQueue();
    }

    @Override
    public void releaseFromQueue() {       
        System.out.println(actorsQueue.peek().getName() + " удален из очереди");
        actorsQueue.poll();       
    }

    @Override
    public void update() {
    releaseFromMarket(queue);
    }
   
    @Override
    public void releaseFromMarket(List<Actor> actors) {
   
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " ушел из магазина ");
            queue.remove(actor);
        }
    }
}

