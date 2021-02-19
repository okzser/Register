import java.util.Scanner;

public class Register {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many employees will be registered?");
        int amount = sc.nextInt();
        
        Employee emp[] = new Employee[amount];

        for(int i = 0; i < emp.length; i++) {
            
            emp[i] = new Employee();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("What will be the employee's ID? ");
            emp[i].setId(sc.nextInt());

            System.out.print("What will be the employee's name? ");
            sc.nextLine();
            emp[i].setName(sc.nextLine());

            System.out.print("How many will be the employee's salary? ");
            emp[i].setSalary(sc.nextDouble());

        }
        System.out.println("Would you like to give a employee an salary increase? [Y/N]");
        char answer = Character.toLowerCase(sc.next().charAt(0));
        
        if (answer == 'y') {
            System.out.println("Which ID would you like to increase the salary?");
            
        }
    }
}