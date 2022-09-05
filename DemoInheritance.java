package bridgelabz.javapractice.Basics;

class Car1 {
    boolean isAC;
    void display(){
        System.out.println("Car AC is : "+isAC);
    }
}
public class DemoInheritance extends Car1 {
    String categoryType;
    DemoInheritance(boolean isAC, String categoryType){
        super.isAC = isAC;
        this.categoryType = categoryType;
    }

    void show(){
        System.out.println("Car category is : "+categoryType);
        super.display();
    }

    public static void main(String[] args) {
        DemoInheritance di = new DemoInheritance(false, "sedan");
        di.show();
    }
}
