package algos;
//Constructor Overloading
public class mobile {
    String brand;
    int ramSize;
    double price;

    mobile(String brand){
        this.brand=brand;
        System.out.println("Brand:"+ brand);
    }

    mobile(String brand, int ramSize){
        this.brand=brand;
        this.ramSize=ramSize;
        System.out.println("Brand:"+ brand);
        System.out.println("RAM Size: "+ ramSize + "GB");
    }

    mobile(String brand,int ramSize, double price){
        this.brand=brand;
        this.ramSize=ramSize;
        this.price=price;
        System.out.println("Brand:"+ brand);
        System.out.println("RAM Size: "+ ramSize + "GB");
        System.out.println("Price: $"+ price);
    }

    mobile(String brand, double price){
        this.brand=brand;
        this.price=price;
        System.out.println("Brand:"+ brand);
        System.out.println("Price: $"+ price);

    }

    public void mobileDetails()
    {
        System.out.println("Brand:"+ brand);
        System.out.println("RAM Size: "+ ramSize + "GB");
        System.out.println("Price: $"+ price);
    }

    public static void main(String[] args) {
        mobile m1 = new mobile("Apple");
       // m1.mobileDetails();
        mobile m2= new mobile("Samsung",16);
        //m2.mobileDetails();
        mobile m3= new mobile("Samsung",899.9);
        //m3.mobileDetails();
        mobile m4= new mobile("Vivo",6,499.9);
        //m4.mobileDetails();
    }
}
