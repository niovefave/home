package prcatice;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
	//계좌번호
	String bankAcoount;
	
	//초기 금액
	int startBalance;
	
	//출금 Withdrawal
	int withdrawal;
	
	
	//입금 Deposit 
	int deposit;


	
	//거래내역
	ArrayList<String> history = new ArrayList<>();
	
	public void bac(){
		System.out.println("현재 잔고 : " + (startBalance) + "$");
	}
	
}
