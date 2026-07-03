package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account acct;

    @BeforeEach
    public void setUp(){
        acct = new Account(1234);
    }

    @Test
    public void testIfAccountExist(){
        assertNotNull(acct);
    }

    @Test
    public void deposit200ToGet_200AsBalanceTest(){
        assertEquals(0, acct.checkBalance(1234));

        acct.deposit(200);
        assertEquals(200, acct.checkBalance(1234));
    }

    @Test
    public void deposit500_And_200ToGet700BalanceTest(){
        assertEquals(0, acct.checkBalance(1234));

        acct.deposit(500);
        acct.deposit(200);
        assertEquals(700, acct.checkBalance(1234));
    }

    @Test
    public void dopositNegative200_ToReturn_0Test(){
        assertEquals(0, acct.checkBalance(1234));
        assertThrows(IllegalArgumentException.class, ()-> acct.deposit(-200));
    }

    @Test
    public void withdraw500_WhenBalanceIs1000Test(){
        acct.deposit(1000);

        acct.withdraw(1234, 500);
        assertEquals(500, acct.checkBalance(1234));
    }

    @Test
    public void deposit500_AndWithdraw_1000ToReturnBalance1000Test(){
        acct.deposit(500);
        acct.withdraw(1234, 1000);
        assertThrows(IllegalArgumentException.class, ()-> acct.checkBalance(1234));
    }

    @Test
    public void cannotWithdrawNegativeAmount(){
        acct.deposit(500);
        acct.withdraw(1234, -200);
        assertThrows(IllegalArgumentException.class, ()-> acct.checkBalance(1234));
    }

    @Test
    public void cannotCheckWithWrongPinTest(){
        acct.deposit(5000);
        assertThrows(IllegalArgumentException.class, ()-> acct.checkBalance(12342345), "invalid pin");
    }

    @Test
    public void cannotWithDrawWithWrongPinTest(){
        acct.deposit(2000);
        assertThrows(IllegalArgumentException.class, ()-> acct.withdraw(1234876, 1000), "invalid pin");
    }


}
