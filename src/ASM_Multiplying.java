import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class ASM_Multiplying {
	public static void to_prod(int first_number, int second_number) {
		try (PrintWriter fout = new PrintWriter(
				new File("Multiplying.asm"))) {
			fout.println(".orig x3000");
			fout.println(";Clearing Register");
			fout.println(";*********************");
			fout.println("and r0,r0,#0");
			fout.println("and r1,r1,#0");
			fout.println("and r2,r2,#0");
			fout.println("and r3,r3,#0");
			fout.println("and r4,r4,#0");
			fout.println("and r5,r5,#0");
			fout.println("and r6,r6,#0");
			fout.println("and r7,r7,#0");
			fout.println(";*********************");
			fout.println("ld r1,num1");
			fout.println("ld r2,num2");
			fout.println("ld r5,ascii");
			fout.println("loop add r2,r2,x-1");
			fout.println("brn done");
			fout.println("add r4,r1,r4");
			fout.println("brnzp loop");
			fout.println("done lea r0, msg");
			fout.println("puts");
			fout.println("add r0,r4,x0");
			fout.println("add r0,r0,r5");
			fout.println("out");
			fout.println("halt");
			fout.println("ascii .fill x0030");
			fout.println("num1 .fill x" + first_number);
			fout.println("num2 .fill x" + second_number);
			fout.println("msg .stringz " + "\"" + "The Product is " + "\"");
			fout.println(".end");
		} catch (FileNotFoundException ex) {
			System.out.println("File not Found");
			System.exit(0);
		}
	}

}