package Java_WQ;

class Product{
    String name;
    int price;
    int weight;
    public Product(String name,int price,int weight){
        this.name = name;
        this.price = price;
        this.weight =weight;
    }
    public int caltotal(int price,int weight){
        if(price >= Mynum.freecut) return 0;
        else if(price > Mynum.discountcut) return cal_weight(weight) -
                Mynum.discount_fee;
        else return cal_weight(weight);
    }
    public int cal_weight(int weight){
        if(weight>=Mynum.over_weight) return Mynum.over_tax;
        else if(weight>Mynum.light_weight) return Mynum.mid_tax;
        else return Mynum.light_tax;
    }
}
class Mynum{
    public static final int over_weight = 10;
    public static final int light_weight = 3;
    public static final int over_tax = 10000;
    public static final int mid_tax = 5000;
    public static final int light_tax = 1000;

    public static final int freecut = 100000;
    public static final int discountcut = 30000;
    public static final int discount_fee = 1000;
}
class Beauty extends Product implements DeliveryCal{
    public Beauty(String name,int price,int weight){
        super(name,price,weight);
    }
    @Override
    public int getDeliveryCal(int weight, int price) {
        return caltotal(weight,price);
    }
    public void output(){
        int Delivery = getDeliveryCal(this.weight,this.price);
        System.out.println(this.name + "의 배송료는 " + Delivery + "원 입니다."
                + "총 가격은 " + (Delivery + this.price) + "원 입니다.");
    }
}
class Grocery extends Product implements DeliveryCal{
    public Grocery(String name,int price,int weight){
        super(name,price,weight);
    }

    @Override
    public int getDeliveryCal(int weight, int price) {
        return caltotal(weight,price);
    }
    public void output(){
        int Delivery = getDeliveryCal(this.weight,this.price);
        System.out.println(this.name + "의 배송료는 " + Delivery + "원 입니다."
                + "총 가격은 " + (Delivery + this.price) + "원 입니다.");
    }
}
class LargeAppliance extends Product implements DeliveryCal{
    public LargeAppliance(String name,int price,int weight){
        super(name,price,weight);
    }

    @Override
    public int getDeliveryCal(int weight, int price) {
        return caltotal(weight,price);
    }
    public void output(){
        int Delivery = getDeliveryCal(this.weight,this.price);
        System.out.println(this.name + "의 배송료는 " + Delivery + "원 입니다."
                + "총 가격은 " + (Delivery + this.price) + "원 입니다.");
    }
}

public class weekly_Quiz {
    public static void main(String[] args) {
        Beauty b = new Beauty("화장품",20000,1);
        Grocery g1 = new Grocery("밀가루",30000,3);
        Grocery g2 = new Grocery("책",45000,12);
        LargeAppliance l1 = new LargeAppliance("새탁기",300000,100);

        b.output();
        g1.output();
        g2.output();
        l1.output();
    }
}
