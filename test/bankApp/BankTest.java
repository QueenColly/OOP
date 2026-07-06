package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {
    private  Bank bank;

    @BeforeEach
    public void setUp(){
        bank = new Bank();
        bank.createANewAccount("Collete", "Umeh", "1234");
    }
    @Test
        public void iHaveABankAndCanCreateAnAccountInTheBank() {
            assertEquals(1, bank.countAccounts());
        }
    @Test
        public void iHaveABank_iCreateThreeAccountsInTheBank_accountCountIs3() {
            bank.createANewAccount("Tife", "Bolu", "2345");
            bank.createANewAccount("Ike", "JohDan", "1456");

            assertEquals(3, bank.countAccounts());

    }
    @Test
        public void checkThatBalanceIsZero_whenAccountIsCreated(){
                    assertEquals(0, bank.checkInitialBalance(1, "1234"));
    }
    @Test
    public void checkThatIDeposit_1000_BalanceIsNow1000() {
        bank.deposit(1, 1000);
        assertEquals(1000, bank.checkInitialBalance(1, "1234"));
    }
        @Test
        public void checkThatIDeposit_inThreeAccounts_BalancehasIncreasedInAllThree(){
        bank.deposit(1,1000);
        assertEquals(1000, bank.checkInitialBalance(1, "1234" ));


        bank.createANewAccount("Tife", "Bolu", "2345");
        bank.deposit(2,2000);
        assertEquals(2000, bank.checkInitialBalance(2, "2345" ));


        bank.createANewAccount("Ike", "JohDan", "1456");
        bank.deposit(3,3000);
        assertEquals(3000, bank.checkInitialBalance(3, "1456" ));

    }
    @Test
        public void removeAccountThatIs_noLongerInUse(){
        bank.createANewAccount("Tife", "Bolu", "2345");
        bank.createANewAccount("Ike", "JohDan", "1456");

        bank.removeAccount(2, "2345");
        assertEquals(2,bank.countAccounts());
    }
    @Test
        public void iHave1000AndWantToAdd1000_balanceShouldIncreaseTo2000(){
        bank.deposit(1,1000);
        assertEquals(1000, bank.checkInitialBalance(1, "1234" ));

        bank.deposit(1,1000);
        assertEquals(2000, bank.checkInitialBalance(1, "1234" ));


    }
    @Test
        public void iWithdraw200_balanceIs800(){
            bank.deposit(1,1000);
            assertEquals(1000, bank.checkInitialBalance(1, "1234" ));

            bank.withdraw(1,"1234",200);
            assertEquals(800, bank.checkInitialBalance(1,"1234"))



    }
}
