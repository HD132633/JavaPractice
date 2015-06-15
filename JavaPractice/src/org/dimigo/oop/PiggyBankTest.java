package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FamilyMember fa = new FamilyMember("아빠");
			FamilyMember mo = new FamilyMember("엄마");
			FamilyMember na = new FamilyMember("나");
			FamilyMember bro = new FamilyMember("남동생");
			
			PiggyBank pig = new PiggyBank();
			
			FamilyMember.printMemberCnt();
			
			pig.putMoney(fa, 10000);
			pig.putMoney(mo, 5000);
			pig.putMoney(na, 2000);
			pig.putMoney(bro, 1000);
			
			pig.printBalance();
			
			pig.putMoney(bro, 1000);
			pig.printBalance();
	}

}
