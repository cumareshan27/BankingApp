import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.revature.models.Account;
import com.revature.repositories.AccountDAO;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AccountDAOTests {
	private AccountDAO adao = new AccountDAO();
	
	@SuppressWarnings("deprecation")
	@Test
	public void getAllAccountsTest() {
		List<Account> accounts = new ArrayList<Account>();
		Account a = new Account(1, 123, "credit", 13, 1 );
		Account a2 = new Account(2, 123, "credit", 133, 2);
		Account a3 = new Account(3, 123, "credit", 133, 1);
		Account a4 = new Account(4, 123, "credit", 133, 2);
		
		accounts.add(a);
		accounts.add(a2);
		accounts.add(a3);
		accounts.add(a4);
		
		Assert.assertEquals(accounts, adao.getAll());

		
	}
	
//	@Test
//	public void getAccountByIdTest() {
//		
//		System.out.println(adao.getById(2));
//	}
	
	
}
