package anjalicode;

public class Forloop {
	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			if(i==3) {
				continue;
			}
			if (i==7) {
				break;
			}
			System.out.println(i);
		}
	}

}
