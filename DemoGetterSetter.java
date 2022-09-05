package bridgelabz.javapractice.Basics;
class C {
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
   
}

public class DemoGetterSetter extends C{
    public static void main(String[] args) {
        DemoGetterSetter obj = new DemoGetterSetter();
        obj.setAge(20);
        System.out.println("age - "+obj.getAge());
    }    
}
