import java.util.Scanner;
import java.util.regex.*;

//Disclaimer. I had to work with classmates on this because I was too lost and kept encountering errors


class Student{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many students: ");

        int N;
        String name = "";

        getInfo(N = input.nextInt());
        displayInfo();
        count(N);

    }

    public static void getInfo(int N){
        String [] standingArray = new String[4];

        Scanner input = new Scanner(System.in);
        String[] fname = new String[N];

        System.out.println("Enter the information for each student: ");
        for (int i = 0; i < N; i++){

            System.out.println("STUDENT: " + (i + 1) + " \n First name: ");
            while (!input.hasNext("[a-zA-Z]*")){
                System.out.println("Invalid input. Letters only. \nTry Again: ");
            }

            fname[i] = input.next();
            System.out.println("Last name: ");
            while (!input.hasNext("[a-zA-Z]*")){
                System.out.println("Invalid input. Letters only. \nTry Again: ");
                input.next();
            }

            String lname = input.next();
            System.out.println("PeopleSoft ID: ");
            while (!input.hasNext("[0-9]{1,7}")){
                System.out.println("Invalid input. 7 digits or less. \nTry Again: ");
                input.next();
            }

            int id = input.nextInt();
            System.out.println("Class Year (1-4): \nAny student after 4, please press 5.");
            String standing = input.next();

            while(!standing.isEmpty()){
                if(standing.equals("1")){
                    System.out.println("Freshman");
                    return;
                }
                if(standing.equals("2")){
                    System.out.println("Sophomore");
                    break;
                }
                if(standing.equals("3")){
                    System.out.println("Junior");
                    break;
                }
                if(standing.equals("4")){
                    System.out.println("Senior");
                    break;
                }
                if(standing.equals("5")){
                    System.out.println("Extended Senior");
                    break;
                }
                else{
                    System.out.println("Invalid class standing. \nNew input: ");
                    input.next();
                }
            }


            System.out.println("Student E-Mail: ");
            String email = input.next();
            if (email.matches("^[a-zA-Z1-9]+@[a-zA-Z1-9]+.(com|edu|org)$")){
                System.out.println("Check if E-Mail is correct. Press any key to continue.");
                input.next();
            }
            else{
                System.out.println("Invalid Input. \nTry Again: ");
                input.next();
            }

            System.out.println("Student Address: ");
            input.nextLine();
            String address = input.nextLine();
            if (address.matches("[0-9]+[ ]\\D+")){
                System.out.println("Approved address.");
            }
            else{
                System.out.println("Invalid address\n Try again: ");
                input.next();
            }

            System.out.println("City Address: ");
            String addressCity = input.nextLine();
            if (addressCity.matches("[a-zA-Z]*")){
                System.out.println("Approved city.");
            }
            else{
                System.out.println("Invalid city \n Try again: ");
                addressCity = input.next();
            }

            String state[] = {"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN",
                    "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT",
                    "WA", "WI", "WV", "WY"};

            System.out.println("State Address: \n Input in abbreviated format i.e. TX for Texas, AZ for Arizona, etc");
            input.nextLine();
            String addressState = input.nextLine();
            if (addressState.matches("^(?-i:A[LKSZRAEP]|C[AOT]|D[EC]|F[LM]|G[AU]|HI|I[ADLN]|K[SY]|LA|M[ADEHINOPST]|N[CDEHJMVY]|O[HKR]|P[ARW]|RI|S[CD]|T[NX]|UT|V[AIT]|W[AIVY])$")){
                System.out.println("Approved State.");
            }
            else{
                System.out.println("Invalid State\n Try again: ");
                input.next();
            }

            System.out.println("Student ZIP Code: ");
            while (!input.hasNext("[0-9]{9}")){
                System.out.println("9 numerical digits");
                input.next();
            }
            int zip = input.nextInt();

        }



    }

    public static void displayInfo(){
        System.out.println("Students Details, Department of ILT");


    }

    public static int count(int N){
        int count = N;
        System.out.println("Number of students: " + count);
        return N;
    }
}
