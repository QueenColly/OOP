package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account account;

    @BeforeEach
    public void setUp(){
        account = new Account("1234");
    }

    @Test
    public void testIfAccountExist(){
        assertNotNull(account);
    }
    @Test
    public void deposit200ToGet_200AsBalanceTest(){
        assertEquals(0, account.checkBalance("1234"));

        account.deposit(200);
        assertEquals(200, account.checkBalance("1234"));
    }

    @Test
    public void deposit500_And_200ToGet700BalanceTest(){
        assertEquals(0, account.checkBalance("1234"));

        account.deposit(500);
        account.deposit(200);
        assertEquals(700, account.checkBalance("1234"));
    }

    @Test
    public void dopositNegative200_ToReturn_0Test(){
        assertEquals(0, account.checkBalance("1234"));
        assertThrows(IllegalArgumentException.class, ()-> account.deposit(-200));
    }

    @Test
    public void withdraw500_WhenBalanceIs1000Test(){
        account.deposit(1000);

        account.withdraw("1234", 500);
        assertEquals(500, account.checkBalance("1234"));
    }

    @Test
    public void deposit500_AndWithdraw_1000ToReturnBalance1000Test(){
        account.deposit(500);
        assertThrows(IllegalArgumentException.class,
                ()-> account.withdraw("1234", 1000));

        assertEquals(500, account.checkBalance("1234"));
    }

    @Test
    public void cannotWithdrawNegativeAmount(){
        account.deposit(500);
        assertThrows(IllegalArgumentException.class,
                ()-> account.withdraw("1234", -200));

        assertEquals(500, account.checkBalance("1234"));
    }

    @Test
    public void cannotCheckWithWrongPinTest(){
        account.deposit(5000);
        assertThrows(IllegalArgumentException.class, ()-> account.checkBalance("12342345"), "invalid pin");
    }

    @Test
    public void cannotWithDrawWithWrongPinTest(){
        account.deposit(2000);
        assertThrows(IllegalArgumentException.class, ()-> account.withdraw("12344321", 1000), "invalid pin");
    }
    @Test
    public void depositZeroShouldThrowExceptionTest(){
        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(0));

        assertEquals(0, account.checkBalance("1234"));
    }
    @Test
    public void withdrawZeroShouldThrowException(){
        account.deposit(500);

        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw("1234",0));

        assertEquals(500, account.checkBalance("1234"));
    }


}
