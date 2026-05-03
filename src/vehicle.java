class vehicle{
    final void action(){
        System.out.println("vehicle moving");
    }
}
class audi extends vehicle {
    int doors =4;
    int whiles =4;

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
final class specifics extends Types {
    String color ;
    int size ;
    specifics(String color,int size,String type,String material){
        super(type,material);
        this.color=color;
        this.size=size;
    }
}


