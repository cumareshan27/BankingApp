import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.revature.models.Account;
import com.revature.models.User;
import com.revature.repositories.AccountDAO;
import com.revature.services.AccountService;

@SuppressWarnings("deprecation")
public class AccountDAOTests {
	private AccountDAO adao = new AccountDAO();
	
//	@Test
//	public void getAllAccountsTest() {
//		List<Account> accounts = new ArrayList<Account>();
//		Account a = new Account(6, 127890, "checking", 2300, "Active", 1);
//		Account a2 = new Account(3, 4444, "credit", 478, null, 1);
//		Account a3 = new Account(1, 42, "credit", 13, null, 1);
//		Account a4 = new Account(2, 41, "credit", 133, null, 2);
//		Account a5 = new Account(4,	123, "credit", 3478, null, 3);
//		
//		accounts.add(a);
//		accounts.add(a2);
//		accounts.add(a3);
//		accounts.add(a4);
//		accounts.add(a5);
//		Assert.assertEquals(accounts, adao.getAll());
//
//		
//	}
	
	@Test
	public void getAccountTranscations() {
		User user = new User();
		AccountDAO adao = new AccountDAO();
		//AccountService accountservice = new AccountService(12890, "Checking");
		Assert.assertEquals(true, adao.update(user.id));
	}
	
//	@Test
//	public void getAccountByIdTest() {
//		
//		System.out.println(adao.getById(2));
//	}
	
	
}
