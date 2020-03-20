package inclass_3;

public class TestGreyhound {
    public static void main(String[] args) {
        Greyhound gh1 = new Greyhound(1234, "Mr Flash", 5, 3, "Tom Foley", "The Late Late Show");
        Greyhound gh2 = new Greyhound(5678, "Mr Jones", 5, 3, "Isus", "Icarus");

        gh1.update_winning_record(1, true);
        gh1.update_winning_record(2, true);

        gh1.display_details();
        gh2.display_details();

        print_winner(gh1, gh2);

    }

    public static void print_winner(Greyhound gh1, Greyhound gh2){
        if (gh1.getNum_races_won() > gh2.getNum_races_won()){
            System.out.printf("%s has won more races, with %d wins", gh1.getName(), gh1.getNum_races_won());
        } else if (gh1.getNum_races_won() < gh2.getNum_races_won()){
            System.out.printf("%s has won more races, with %d wins", gh2.getName(), gh2.getNum_races_won());
        } else {
            System.out.printf("%s and %s have won an equal amount of races, with %d wins", gh1.getName(), gh2.getName(), gh1.getNum_races_won());
        }
    }
}
