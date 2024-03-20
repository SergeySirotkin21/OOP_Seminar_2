
    // Задание  Необходимо реализовать строение классов, без конкретной реализации:
    // 1. Интерфейс QueueBehaviour, который описывает логику очереди – 
    // помещение в/освобождение из очереди, принятие/отдача заказа
    // 2. Интерфейс MarketBehaviour, который описываетлогику магазина – 
    // приход/уход покупателей,обновление состояния магазина
    // 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке
    // список людей в очереди в различных статусах
    
    // ДЗ.   Реализовать класс Market и все методы, которые он обязан реализовывать.
    // Методы из интерфейса QueueBehaviour, имитируют работу очереди,
    // Метод MarketBehaviour – помещает и удаляет человека из очереди,
    // Метод update – обновляет состояние магазина (принимает и отдает заказы)


public class Main {
    public static void main(String[] args) {
        Actor hum1 = new Human();
        Actor hum2 = new Human();
            
        hum1.name = "hum1";
        hum2.name = "hum2";
    
        Market market = new Market();
    
        market.acceptToMarket(hum1);
        market.acceptToMarket(hum2);

        market.takeOrders();
        market.takeOrders();

        market.update();
        market.update();
    
    }
}
    
    
