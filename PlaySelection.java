import java.util.Scanner;

//import java.util.ArrayList;
public class PlaySelection {
    public static void main(String[] args) {
            //ArrayList<String> players = new ArrayList<String>();
        //players.add("Kusal");
       // players.add("Dimuth");
       // players.add("Vanidu");
       // players.add("Dananjaya");
          //  System.out.println(players);

        Scanner s = new Scanner(System.in);


        int option = 0;
        while(option != 5) {
            System.out.println("");
            System.out.println("To Add a Player          : Press A");
            System.out.println("To View all Players      : Press V");
            System.out.println("Display two best batmans : Press B");
            System.out.println("Display two best bowlers : Press C");
            System.out.println("Display two best keeper  : Press D");
            System.out.println("To Exit                  : Press E");
            System.out.println("");
            System.out.println("Press the Number : ");
            System.out.println("");

            option = s.nextInt();
            switch (option) {
                case "A":
                    //
                    break;
                case "V":
                    //

                case "B":
                    //
                    break;
                case "C":
                    //
                    break;
                case "D":
                    break;
                case "E":
                    break;
                default:
                    System.out.println("Press the Correct Letter:");


            }
        }

    }

}