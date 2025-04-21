package prcatice;

import java.util.Scanner;

import javax.annotation.processing.AbstractProcessor;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("====은행====");
		Scanner sc = new Scanner(System.in);
		BankAccount x = new BankAccount();
		int a = 0;
		x.bankAcoount = 939302 + "-" + 00 + "-" + 167812;
		x.startBalance = 9000;
		System.out.println("계좌번호 : " + x.bankAcoount);
		System.out.println("잔고 : " + x.startBalance + "$");
		
		while(true) {
			System.out.println("1.입금 | 2.출금 | 3.거래내역 | 4.종료");
			a = sc.nextInt();
			if(a == 1) {
				System.out.println("입금을 선택하셨습니다.");
				System.out.print("원하시는 금액을 입력해주세요 : ");
				x.deposit = sc.nextInt();	
				x.startBalance += x.deposit;
				x.history.add("입금 : " + x.deposit + "$");
				System.out.println(x.deposit + "$ 입금되었습니다.");	
				x.bac();
				System.out.println("1.입금, 출금, 거래내역 | 2.종료");
				a = sc.nextInt();
				if(a == 1) {
					continue;
				}else if(a == 2) {
					System.out.println("시스템을 종료합니다");
					break;
				}else {
					System.out.println("올바른 번호를 입력해주세요.");
				}
			}
			else if(a == 2) {
				System.out.println("출금을 선택하셨습니다.");
				System.out.print("원하시는 금액을 입력해주세요 : ");
				x.withdrawal = sc.nextInt();	
				if(x.withdrawal > x.startBalance) {
					System.out.println("잔액부족");
				}else {
					x.startBalance -= x.withdrawal;
					x.history.add("출금 : " + x.withdrawal + "$");
					System.out.println(x.withdrawal + "$ 출금되었습니다.");
					x.bac();
					System.out.println("1.입금, 출금, 거래내역 | 2.종료");
					a = sc.nextInt();
					if(a == 1) {
						continue;
					}else if(a == 2) {
						System.out.println("시스템을 종료합니다");
						break;
					}else {
						System.out.println("올바른 번호를 입력해주세요.");
					}
				}
			}
			else if(a == 3) {
				System.out.println("거래내역");
				if(x.history.isEmpty()) {
					System.out.println("거래내역이 없습니다.");
				}else{
					for(String list : x.history) {
						System.out.println(list);
					}
				}x.bac();
			}
			else{
				System.out.println("올바른 번호를 입력해주세요.");
			} 
		} 	
	}

}
