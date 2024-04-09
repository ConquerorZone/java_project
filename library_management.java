


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;




/**
 * The `library_management` class manages a basic library system.
        * It allows users to register their names, view available books,
        * and either issue or return books.
        *
        * @author harsh
        * @version 1.4
        * @since 2002
        */

    class Function{
    LocalDateTime T = LocalDateTime.now();
    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");
    String datetime =  T.format(df);
    String Book ;
    Scanner sc = new Scanner(System.in);

    public  void Issue(String Book , String Author , String Name) {
        System.out.println("the Book you choose is: " + Book);
        System.out.println(" Book : (" + Book + ") has been issued to:" + Name);
        System.out.println("the Book's Author's name is: " + Author);
        System.out.println("Issued on: "+datetime );//shows date and time

    }
    public String caseOrder_sequence(){
        Book = sc.nextLine().toLowerCase();
        char B = Book.toUpperCase().charAt(0);
        Book = Book.replace(Book.charAt(0),B);
        return Book;
    }
    public String getName() {
        System.out.print(" \n Register name: ");
        return sc.nextLine();

    }

    public void Exit(){
            System.out.println("Exiting ...");
            System.exit(0);

        }
}

public class library_management {
    /**
     * The main method that serves as the entry point for the library management system.
     *
     * @param args Command line arguments (not used in this program).
     * @throws Exception If an exception occurs during execution.
     */

    public static void main(String[] args) throws Exception {
        ArrayList<String> Book = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> Author = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        LocalDateTime T = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");
        String datetime =  T.format(df);
        String schedule;
        Function F1 = new Function();
        int N_index = 0;

        Book.add(0, "Dermatologist");
        Book.add(1, "Astrology");
        Book.add(2, "Physiology");
        Book.add(3, "Psychology");
        Book.add(4, "Pathology");
        Book.add(5, "Biology");
        Book.add(6, "Gynecology");
        Book.add(7, "Encyclopaedia");
        Book.add(8, "Neurologist");
        Book.add(9, "Money making");
        Book.add(10, "Archeologist");

        Author.add(0, "John");
        Author.add(1, "Bob");
        Author.add(2, "Kali Daas");
        Author.add(3, "Kalavati sharma");
        Author.add(4, "James bond");
        Author.add(5, "Rechit Hamburgs");
        Author.add(6, "Johnny sins");
        Author.add(7, "Kiragawa Suzune");
        Author.add(8, "Antoniyo Disuza");
        Author.add(9, "Robin Banerji");
        Author.add(10, "Max Lucus");
        while (true) {

            System.out.println("\n If you want to exit this program enter 'E' and press Enter");


            name.add(N_index, F1.getName()); //Adding name by the user input

            if (name.contains("E")){
                F1.Exit();
            }else {
            System.out.println("The name has been registered");
            System.out.println(name);   // Displays the list of registered names
                System.out.println(" Available Books : ");
            System.out.println(Book); //shows available book


            System.out.println("Enter 'I' to Issue Book and 'R' to Return Book");
            int Index;
            schedule = sc.nextLine();  // Scheduling Weather User Want's to Return or Issue Book

            switch (schedule) {
                case "I":  //Issuing book
                try {
                    System.out.println("Enter the name of Book you want to Issue");
                    Index = Book.indexOf(F1.caseOrder_sequence());
                    F1.Issue(Book.get(Index), Author.get(Index), name.get(N_index));
//                    System.out.println("the Book you choose is: " + Book.get(Index));
//                    System.out.println(" Book : (" + Book.get(Index) + ") has been issued to:" + name.get(N_index));
//                    System.out.println("the Book's Author's name is: " + Author.get(Index));
//                    System.out.println("Issued on: "+datetime );//shows date and time
                    Author.remove(Index);//Removing Book's Author Name
                    Book.remove(Index);// Removing Issued Book
                    N_index++;
                } catch (Exception e) { //--> Handling Error Inputs
                    name.remove(N_index);

                    System.out.println("This Book is not available or you enter invalid name which occurs Exception: " + e);
                }
            break;
                case "R": //Returning book
                try {

                    System.out.println("Enter the name of Book you want to Return");
                    Book.add(sc.nextLine()); //Taking user input for 'Book Name' that has been Returned
                    System.out.println("Book Author's name");
                    Author.add(sc.nextLine());//Taking user input for Returned Book's Author Name
                    System.out.println("Return on : "+datetime);// Shows date and time

                } catch (Exception e) { //--> Handling Error Inputs
                    System.out.println("Please Enter Proper Characters"+e);
                }
                case "E": F1.Exit(); // In case user wants to exit it'll Exit the program
                break;

                default:
                System.out.println("Invalid response"); // If user doesn't provide a valid input it'll run the program again
                name.remove(N_index); // removing any registered name
            }


        }
    }

} }
        /*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
         */




