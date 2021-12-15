import java.io.Console;

public class ConsoleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console c = System.console(); 										// #1: get a Console
		 char[] pw; 
		 pw = c.readPassword("%s", "pw: "); 								// #2: return a char[]
		 for(char ch: pw)
		 c.format("%c ", ch); 												// #3: format output
		 c.format("\n");
		 System.out.println(pw);

	}

}
