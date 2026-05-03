import java.lang.reflect.Field;

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
}
class Types extends audi {
    String type;

   Types(String type,String material){
       this.type=type;
       super.material=material;
   }
}
class BMW extends vehicle{
    void honk(){
        System.out.println("Honks genteelly");
    }
}
final class specifics extends Types {
    String color ;
    int size ;
    specifics(String color,int size){
        this.color=color;
        this.size=size;
    }
}
class main{
    public static void main(String[] args){

    }

}