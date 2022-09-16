public class demoday8 {
    public static void main(String[] args) {
        demoObject person1 = new demoObject(180, 28, "Peter");
        System.out.println(person1.height);

        if (person1.height == 180 && person1.age == 28){
            System.out.println("Yes");
        }else
            System.out.println("No");

    }
}
