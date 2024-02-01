import com.encore.Account.Account;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account("CUST01", "YBY", "1-22-333", 100000);
		System.out.println("=======================");
		System.out.println("고객번호 : "+account.getCustId());
		System.out.println("고객명 : "+account.getCustName());
		System.out.println("계좌번호 : "+account.getAccountNumber());
		System.out.println("잔액 : "+account.getBalance());
		System.out.println("=======================");
		
		//잔액증가
		System.out.println(10000+"원을 입금합니다.");
		account.addBalance(10000);
		System.out.println("증가 후 잔액 : "+account.getBalance());
	}

}
