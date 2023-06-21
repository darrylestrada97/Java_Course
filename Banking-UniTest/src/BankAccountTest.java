import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class BankAccountTest {

    private BankAccount account;
    @Before
    public void setup(){
        account = new BankAccount("Tim","Estrada", 1000.00,BankAccount.CHECKING);
        System.out.println("Running test");
    }
    @Test
    public void deposit() throws Exception {
        double balance = account.deposit(200,true);
        assertEquals(1200.00,balance,0);
    }

    @Test
    public void withdraw() throws Exception {
       // fail("This test has yet to be implemented.");
    }

    @Test
    public void getBalance_deposit() throws Exception {
        account.deposit(200,true);
        assertEquals(1200, account.getBalance(),0);
    }

    @Test
    public void getBalance_withdraw() throws Exception {
        account.withdraw(200,true);
        assertEquals(800, account.getBalance(),0);
    }
    @Test
    public void isChecking(){
        assertTrue("The account is not a checking account",account.isChecking());
    }





}