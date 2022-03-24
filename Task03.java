package GroupProject.PJ02;

public class Task03 {
    /*	3.Create a Class Car that would have the following
        fields:   carPrice   and   color   and   method calculateSalePrice()
        which should be returning a price of the car.
        Create 2 subclasses: Sedan and Truck. The Truck
        class   has   field   as   weight   and   has   its   own
        implementation   of   calculateSalePrice()   method   in
        which   returned   price   calculated   as   following:   if
        weight>2000 then returned price car should include
        10% discount, otherwise 20% discount.
        The Sedan class has field as length and also does it
        its own   implementation   of   calculateSalePrice():   if
        length of sedan is >20 feet then returned car price
        should include 5% discount, otherwise 10% discount
*/
    public static void main(String[] args) {
        Sedan s= new Sedan();
        s.length=19;
        s.carPrice=50000;
        System.out.println("Sedan sales price is "+s.calculateSalePrice());

        Truck t=new Truck();
        t.weight=2500;
        t.carPrice=30000;
        System.out.println("Truck sales price is "+t.calculateSalePrice());

    }
}

abstract class Car{
    double carPrice;
    String color;
    double discount = 0;

    double calculateSalePrice(){
        double salePrice;


        salePrice= carPrice-discount;
        return salePrice;
    }
}

class Sedan extends Car{
    double length;

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            discount=carPrice*0.05;
        }else {
            discount=carPrice*0.10;
        }
        return super.calculateSalePrice();
    }

}
class Truck extends Car{
    double weight;

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            discount=carPrice*0.10;
        }else {
            discount=carPrice*0.20;
        }
        return super.calculateSalePrice();
    }
}
