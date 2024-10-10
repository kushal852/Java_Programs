package javaprograms;

public class Checking_Given_String_is_IP_Address_or_not {
	
	static boolean rangeCheck(int num) {
		return (num>=0 || num<=255);
	}

	public static void main(String[] args) {
		
		String ip = "0.111.222.1";
		String[] splitted_ip = ip.split("\\.");
		boolean flag = false;
		for(String s : splitted_ip) {
			if(rangeCheck(Integer.parseInt(s))) {
				flag = true;
			}else {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("IP");
		}else {
			System.out.println("not an IP");
		}

	}

}
