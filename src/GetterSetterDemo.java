class CarWithGetterSetter {
    String brand;
    String model;
    int year;
    String getBrand() {
        return brand;
    }
    String getModel(){
        return model;
    }
    int getYear(){
        return  year;
    }
    void setBrand(String b) {
        brand = b;
    }
    void  setModel(String mo) {
        model = mo;
    }
    void  setYear(int paramYear){
        year = paramYear;
    }

}

public class GetterSetterDemo {
    public static void main(String[] args) {
        CarWithGetterSetter o = new CarWithGetterSetter();
        o.setBrand("현대 ");
        o.setModel("제네시스 ");
        o.setYear(2019);
        System.out.println(o.getBrand() + o.getModel() + o.getYear());


        CarWithGetterSetter o2 = new CarWithGetterSetter();
        o2.brand = "기아 ";
        o2.model = "K5 ";
        o2.year = -10000;
        System.out.println(o2.brand + o2.model + o2.year);

    }
}
