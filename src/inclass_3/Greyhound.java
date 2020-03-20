package inclass_3;

public class Greyhound extends Animal {
    private String name;
    private int age;
    private String father;
    private String mother;
    private int num_races_ran;
    private int num_races_won;

    private boolean[] results;

    public Greyhound(int id, String name, int num_races_ran, int age,
                     String father, String mother){
        super(id, "Greyhound");

        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;
        this.num_races_ran = num_races_ran;
        this.num_races_won = 0;

        this.results = new boolean[num_races_ran];
    }

    public void update_winning_record(int race_number, boolean result){
        this.results[race_number - 1] = result;

        if (result){
            this.num_races_won ++;
        }
    }

    public String getName() {
        return name;
    }

    public int getNum_races_won() {
        return num_races_won;
    }

    public void display_details(){
        super.display_details();
        System.out.printf("\t%-10s %s%n", "Name: ", this.name);
        System.out.printf("\t%-10s %d%n", "Age: ", this.age);
        System.out.printf("\t%-10s %s%n", "Father: ", this.father);
        System.out.printf("\t%-10s %s%n", "Mother: ", this.mother);
        System.out.printf("\tHas ran %d races and won %d%n", this.num_races_ran, this.num_races_won);
        System.out.println();
        for (int i = 0; i < this.results.length; i++){
            System.out.printf("Race #%d won: %b%n", i+1, results[i]);
        }
        System.out.println("___________________");
    }

}
