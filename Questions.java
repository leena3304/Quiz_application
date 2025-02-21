package quizapplication;

import java.util.*;

public class Questions {
	static int life_line_count=3;
	static int aud_poll=1;
	static int ff=1;
	static int phn_call =1;
	public static int money=0;
	public static Scanner sc = new Scanner(System.in);
	public boolean question1() {
		System.out.println("A. Which operator is used to compare two values in Java?\n"
				+ "1. =\n"
				+ "2. ==\n"
				+ "3. !=\n"
				+ "4. equals\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 2) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				if(choice == 2) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_poll==1) {
					System.out.println("---> Audiance Poll : "+aud_poll+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(phn_call==1) {
					System.out.println("---> Phone call  : "+phn_call);
				}
				else if(aud_poll==0 && ff==0 && phn_call==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_poll==1) {
					aud_poll--;
					life_line_count--;
					System.out.println(
						  "1. =	---> 30%\n"
						+ "2. ==	---> 60%\n"
						+ "3. !=	---> 45%\n"
						+ "4. equals ---> 15%\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "2. ==\n"
						+ "4. equals\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && phn_call==1) {
					phn_call--;
					life_line_count--;
					System.out.println("I think the answer is 2.==");
					choice=sc.nextInt();
					if(choice==2) {
						money+=1000;
						return true;
					} else {
						return false;
					}
					
				}
				
			}
		}
		return false;
	}
	public boolean question2() {
		System.out.println("A. What is the result of 5+2*3 in Java?\n"
				+ "1. 16\n"
				+ "2. 11\n"
				+ "3. 54\n"
				+ "4. 21\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 2) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				if(choice == 2) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_poll==1) {
					System.out.println("---> Audiance Poll : "+aud_poll+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(phn_call==1) {
					System.out.println("---> Phone call : "+phn_call);
				}
				else if(aud_poll==0 && ff==0 && phn_call==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_poll==1) {
					aud_poll--;
					life_line_count--;
					System.out.println(
						  "1. 16	---> 30%\n"
						+ "2. 11	---> 50%\n"
						+ "3. 54	---> 15%\n"
						+ "4. 21	---> 45%\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "1. 16\n"
						+ "2. 11\n");
					choice = sc.nextInt();
					if(choice == 2) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && phn_call==1) {
					phn_call--;
					life_line_count--;
					System.out.println("I think the answer is 11");
					choice=sc.nextInt();
					if(choice==2) {
						money+=1000;
						return true;
					} else {
						return false;
					}
					
				}
				
			}
		}
		return false;
	}
	public boolean question3() {
		System.out.println("A. Which of the following is a valid data type in Java?\n"
				+ "1. integer\n"
				+ "2. chara\n"
				+ "3. int\n"
				+ "4. doub\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 3) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				if(choice == 3) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_poll==1) {
					System.out.println("---> Audiance Poll : "+aud_poll+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(phn_call==1) {
					System.out.println("---> Phone call  : "+phn_call);
				}
				else if(aud_poll==0 && ff==0 && phn_call==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 3) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_poll==1) {
					aud_poll--;
					life_line_count--;
					System.out.println(
						  "1. integer	---> 30%\n"
						+ "2. chara	---> 10%\n"
						+ "3. int   ---> 45%\n"
						+ "4. doub   ---> 15%\n");
					choice = sc.nextInt();
					if(choice == 3) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "3. int\n"
						+ "4. doub\n");
					choice = sc.nextInt();
					if(choice == 3) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && phn_call==1) {
					phn_call--;
					life_line_count--;
					System.out.println("I think the answer is 3.int");
					choice=sc.nextInt();
					if(choice==3) {
						money+=1000;
						return true;
					} else {
						return false;
					}
				}
				
			}
		}
		return false;
	}
	public boolean question4() {
		System.out.println("A. Which keyword is used to inherit a class in Java?\n"
				+ "1. extends\n"
				+ "2. implements\n"
				+ "3. super\n"
				+ "4. inherits\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 1) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_poll==1) {
					System.out.println("---> Audiance Poll : "+aud_poll+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(phn_call==1) {
					System.out.println("---> Phone call : "+phn_call);
				}
				else if(aud_poll==0 && ff==0 && phn_call==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_poll==1) {
					aud_poll--;
					life_line_count--;
					System.out.println(
						  "1. extends	---> 60%\n"
						+ "2. implements	---> 10%\n"
						+ "3. super	---> 45%\n"
						+ "4. inherits	---> 15%\n");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "1. extends\n"
						+ "2. implements\n");
					choice = sc.nextInt();
					if(choice == 1) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && phn_call==1) {
					phn_call--;
					life_line_count--;
					System.out.println("I think the answer is  extends");
					choice=sc.nextInt();
					if(choice==1) {
						money+=1000;
						return true;
					} else {
						return false;
					}
				}
				
			}
		}
		return false;
	}
	public boolean question5() {
		System.out.println("A. Which of the following is not a reserved keyword in java?\n"
				+ "1. break\n"
				+ "2. const\n"
				+ "3. new\n"
				+ "4. null\n"
				+ "5. Life Line");
		int choice = sc.nextInt();
		if(choice == 4) {
			money += 1000;
			return true;
		}
		else if(choice == 5) {
			if(life_line_count==0) {
				System.out.println("No Life Line is available"); 
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 4) {
					money += 1000;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("Available Life Lines are: \n");
				if(aud_poll==1) {
					System.out.println("---> Audiance Poll : "+aud_poll+"\n");
				}
				if(ff==1) {
					System.out.println("---> 50-50 : "+ff+"\n");
				}
				if(phn_call==1) {
					System.out.println("---> Phone call : "+phn_call);
				}
				else if(aud_poll==0 && ff==0 && phn_call==0){
					System.out.println("No Life line available");
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
					if(choice == 4) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice == 1 && aud_poll==1) {
					aud_poll--;
					life_line_count--;
					System.out.println(
						  "1. break	---> 30%\n"
						+ "2. const	---> 10%\n"
						+ "3. new	---> 45%\n"
						+ "4. null	---> 55%\n");
					choice = sc.nextInt();
					if(choice == 4) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 2 && ff==1) {
					ff--;
					life_line_count--;
					System.out.println(
						  "3. new\n"
						+ "4. null\n");
					choice = sc.nextInt();
					if(choice == 4) {
						money += 1000;
						return true;
					}
					else {
						return false;
					}
				}
				else if(choice == 3 && phn_call==1) {
					phn_call--;
					life_line_count--;
					System.out.println("I think the answer is 4.nullyes");
					choice=sc.nextInt();
					if(choice==4) {
						money+=1000;
						return true;
					} else {
						return false;
					}
				}
				
			}
		}
		return false;
	}
}
