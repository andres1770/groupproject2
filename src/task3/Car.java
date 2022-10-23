package task3;

public class Car {
    double carprice;
    String color;


    Car(double carprice){
this.carprice=carprice;
    }
    void saleprice(){
        System.out.println(carprice);
    }

}
class sedan extends Car {
    int length;

    sedan(double carprice, int lenght) {
        super(carprice);
        this.length = lenght;
    }

    @Override
    void saleprice() {

        if (length > 20) {
            double discount1 = carprice * 0.05;
            carprice = carprice - discount1;
            System.out.println(carprice);
        } else if (length < 20) {
            double discount1 = carprice * 0.10;
            carprice = carprice - discount1;
            System.out.println(carprice);
        }
    }
}
    class Truck extends Car {
        int weight;


        Truck(double carprice,int weight) {
            super(carprice);
            this.weight=weight;

        }
        @Override
        void saleprice() {
            if (weight>2000){
                double discount1 = carprice * 0.10;
                carprice=carprice-discount1;
                System.out.println(carprice);
            } else if (weight<2000) {
                double discount1 = carprice * 0.20;
                carprice=carprice-discount1;
                System.out.println(carprice);
            }

        }
    }
    class tester{
        public static void main(String[] args) {
            Car sedan1= new sedan(1000,30);
            sedan1.saleprice();

            Car truck1=new Truck(1000,3000);
            truck1.saleprice();
        }
}
