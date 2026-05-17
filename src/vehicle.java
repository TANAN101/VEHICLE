import java.util.Scanner;

class vehicle{
    final void action(){
        System.out.println("vehicle moving");
    }
}
class audi extends vehicle {
   private int doors =4;
    private int whiles =4;
    int getdoors(){return this.doors;

    }
    int getWhiles(){return this.whiles;

    }
    void display (){
        System.out.println(getdoors()+"doors and "+getWhiles()+" whiles");
    }

    String material;
    void honk(){
        System.out.println("Honks loud");
    }
    void body(){
        System.out.println(doors+" doors and "+whiles+" whiles");
    }
}
class Types extends audi {
    String type;

   Types(String type,String material){
       this.type=type;
       super.material=material;
   }
}
class BMW extends Types{
    BMW(String type, String material) {
        super(type, material);
    }

    void honk(){
        System.out.println("Honks genteelly");
    }
}
class specifics   {
    void returnn (){
        System.out.println("you have ordered  a car with specifications mentioned: "  );
    }
    void userinput() {
        Scanner take = new Scanner(System.in);
        System.out.println("what is your color choice:");
        String color = take.next();
        System.out.println("what is your size choice:");
        int size = take.nextInt();

       System.out.println(color );
        System.out.println(size );
    }

}


