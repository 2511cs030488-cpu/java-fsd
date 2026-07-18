public class ShoppingCartFixed {
    public static void main(String[] args){
        try{
        int quantity = Integer.parseInt("abc");
        double price = 100.0;
        double total = quantity * price;
        System.out.println("Total price: ₹" + total); 
        }
        catch(NumberFormatException e){
            System.out.println("  Invalid quantity entered.");
            System.out.println(" using default quantity : 1");
            double price = 100.0;
            System.out.println("Total : " + price);
        }
        System.out.println(" Checkout completedsuccessfully");
 }
}