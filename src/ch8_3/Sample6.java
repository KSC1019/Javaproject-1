package ch8_3;
//데일리 퀴즈 2월 5일

import java.math.BigDecimal;

public class Sample6 {
    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", 30000, 2);
        Product grocery = new Grocery("grocery", 20000, 3);
        Product largeAppliance = new LargeAppliance("largeAppliance", 50000, 5);

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        int totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println(totalDeliveryCharge);
    }
}

class Product implements Promotion{
    String name;
    int price;
    double weight;
    public Product(String name,int price,int weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}

interface Promotion{
    int getDiscountAmount();
}
class Grocery extends Product implements Promotion{

    public Grocery(String name, int price, int weight) {
        super(name, price, weight);
    }

    int res = 0;
    @Override

    public int getDiscountAmount() {
        return 2000;
    }
}
class Beauty extends Product {

    public Beauty(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 10000;
    }
}
class LargeAppliance extends Product implements Promotion{

    public LargeAppliance(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
class Cart{
    private Product[] products;
    Cart(Product[] products) {
        this.products=products;
    }
    public void setProducts(Product[] products){
        this.products = products;
    }
    public Product[] getProducts() {
        return products;
    }
    public int gettotalPrice(){
        int total = 0;
        for(Product product : this.products){
            total += product.getPrice();
            total -=product.getDiscountAmount();
        }
        return total;
    }
    public double gettotalWeight(){
        double totalw = 0;
        for(Product product : this.products){
            totalw += product.getWeight();
        }
        return totalw;
    }
    public int calculateDeliveryCharge() {
        int price = gettotalPrice();
        double weight = gettotalWeight();
        int diliveryCharge;
        if(weight < 3 ) diliveryCharge = 1000;
        else if(weight <10) diliveryCharge = 5000;
        else diliveryCharge = 10000;

        if (price<30000) {

        }
        else if(price>=30000 && price < 100000) {
            diliveryCharge -= 1000;
        }
        else diliveryCharge = 0;

        return diliveryCharge;
    }

}