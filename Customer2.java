public class Customer2 {

    String custName;
    int bankBalance;

    static int numCust = 0;

    public Customer2 (String cname, int balance)
    {
        custName = cname;
        bankBalance = balance;
        numCust++;
    }

    public String getName ()
    {
        return custName;
    }

    public static int getNumCust () // getter of numCust. Note that it is static.
    {
        return numCust;
    }

    public static void main (String[] argv)
    {
        Customer2 c1 = new Customer2 ("George", 10);
        Customer2 c2 = new Customer2 ("Elaine", 20);
        Customer2 c3 = new Customer2 ("Kramer", 30);
        Customer2 c4 = new Customer2 ("Jerry", 100);

        System.out.println ("In total, there are " + getNumCust() + " customers.");
    }
}