public class AddNumCLA {
    
    public static void main(String[] args) {
        try {
            String str1 = args[0];
            String str2 = args[1];
    
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
    
            System.out.println("The sum of "+ num1  + " and " + num2 + " is: " + (num1 + num2));
        } catch (Exception e) {
            System.out.println("An Error occured with message: " + e.getMessage());
        }
    }
}
