import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("char ");

		List<String> in = new ArrayList<>();
		List<String> ch = new ArrayList<>();


		for(String s1 : arr) {
			s1 = s1.replace(";",",");
			String[] temp = s1.split(",");

			for(String t : temp) {
				t=t.replace("int","1");
				boolean ck = true;

				for(int i=0; i<t.length(); i++) {
					if(t.charAt(i) == '=' && ( t.charAt(i+1) >='1' || t.charAt(i) <= '9' || t.charAt(i+1)=='-')) {

						int ind=0;
						for(int sq=0; sq<t.length(); sq++) {
							if(t.charAt(sq) >= 'a' && t.charAt(sq)<='z') {
								ind =sq;
								break;
							}
						}
						t=t.substring(ind);
						in.add(t);

						//   in.add(t);
						ck=false;
					} else if(t.charAt(i) =='=' && (t.charAt(i+1)== '\'' )) {
						ch.add(t);
						ck= false;
					}

				}

				//   System.out.println(t);
				if(ck) {
					StringBuilder sb = new StringBuilder();
					for(int i=0; i<t.length(); i++) {
						if(t.charAt(i) >= 'a' && t.charAt(i)<='z') {
							sb.append(t.charAt(i));
							sb.append("=junk");
							in.add(sb.toString());
							break;
						}
					}
				}
			}


		}
		System.out.println("Integers");
		for(String l:in) {
			System.out.println(l);
		}

		System.out.println("Characters");
		for(String l:ch) {
			System.out.println(l);
		}



		// System.out.println(in);
	}
}