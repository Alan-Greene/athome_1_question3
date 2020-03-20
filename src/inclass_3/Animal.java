package inclass_3;

public class Animal {
    private int id;
    private String type;

    public Animal(int id, String type){
        this.id = id;
        this.type = type;
    }

    public void display_details(){
        System.out.printf("%s%n", "Animal:");
        System.out.println();
        System.out.printf("\t%-10s %d%n", "ID: ", this.id);
        System.out.printf("\t%-10s %s%n", "TYPE: ", this.type);
    }
}
