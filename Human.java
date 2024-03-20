

public class Human extends Actor{

    @Override
    public void setMakeOrder() {
       isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    String getName(){
        return name;
    }

    // public Human(String name){
    //     this.name = name;
    // }
   
    
}




