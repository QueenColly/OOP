package acctprac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account colly;

    @BeforeEach
    public void setUp (){
        colly = new Account("2234");
    }

//    @Test
//        public void approvePinTes

    @Test
        public void approveCreatedPin(){
        assertTrue(colly.approvePin("2234"));
        assertFalse(colly.approvePin("1111"));
    }

    @Test
    public void depositAmount200InAnEmptyAccount_checkThatBalanceIsNow200 () {
           // colly = new Account();
             assertEquals(0, colly.getBalance());
            colly.deposit(200);
            assertEquals(200, colly.getBalance());


    }

    @Test
    public void depositAmountNegative50_InAnAccount_checkThatBalanceIsStill_0 () {
//        colly = new Account();
        // assertEquals(0, colly.getBalance());
        colly.deposit(-50);
        assertEquals(0, colly.getBalance());


    }
    @Test
    public void depositAmount_500And_200In_AnAccount_checkThatBalanceIsNow700 () {
//            colly = new Account();
        // assertEquals(0, colly.getBalance());
        colly.deposit(200);
        colly.deposit(500);
        assertEquals(700, colly.getBalance());


    }
//    @Test
//    public void deposit_700_withdrawAmount_300In__checkThatBalanceIsNow400 () {
////            colly = new Account();
//        // assertEquals(0, colly.getBalance());
//        colly.approvePin("1234");
//        colly.deposit(700);
//        colly.withdraw(300,"1234");
//        assertEquals(400, colly.getBalance());
    //}
    @Test
    public void deposit_200_withdrawAmount_300__checkThatBalanceIsStill200 () {
//            colly = new Account();
        // assertEquals(0, colly.getBalance());
        colly.deposit(200);
        colly.withdraw(300, "2234");
        assertEquals(200, colly.getBalance());


    }
    @Test
    public void accountIsZero_withdrawAmount_300In__checkThatBalanceIsStill_0 () {
//            colly = new Account();
        // assertEquals(0, colly.getBalance());
//        colly.deposit(200);
        colly.withdraw(300, "1234");
        assertEquals(0, colly.getBalance());


    }
    @Test
    public void accountIs900_transfer_200__checkThatBalanceIsNow_700 () {
//            colly = new Account();
        // assertEquals(0, colly.getBalance());
        colly.deposit(900);
        colly.withdraw(200, "1234");
        colly.transfer(200);
        assertEquals(700, colly.getBalance());


    }
}
