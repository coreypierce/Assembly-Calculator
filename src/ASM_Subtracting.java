import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class ASM_Subtracting {

	public static void to_sub(int first_number, int second_number) {
		try (PrintWriter fout = new PrintWriter(
				new File("Subtract.asm"))) {
			fout.println(".orig x3000");
			fout.println("and r0,r0,#0");
			fout.println("and r1,r1,#0");
			fout.println("and r2,r2,#0");
			fout.println("and r3,r3,#0");
			fout.println("and r4,r4,#0");
			fout.println("and r5,r5,#0");
			fout.println("and r6,r6,#0");
			fout.println("and r7,r7,#0");
			fout.println("ld r1,num1");
			fout.println("ld r2,num2");
			fout.println("ld r5,ascii");
			fout.println("not r2,r2");
			fout.println("add r2,r2,#1");
			fout.println("add r1,r1,r2");
			fout.println("brn neg");
			fout.println("add r1,r1,r5");
			fout.println("lea r0, mes");
			fout.println("puts");
			fout.println("add r0,r1,x0");
			fout.println("out");
			fout.println("brnzp done");
			fout.println("neg             and r0,r0,#0");
			fout.println("and r1,r1,#0");
			fout.println("and r2,r2,#0");
			fout.println("and r3,r3,#0");
			fout.println("and r4,r4,#0");
			fout.println("and r5,r5,#0");
			fout.println("and r6,r6,#0");
			fout.println("and r7,r7,#0");
			fout.println("ld r1,num1");
			fout.println("ld r2,num2");
			fout.println("ld r5,ascii");
			fout.println("not r1,r1");
			fout.println("add r1,r1,#1");
			fout.println("add r2,r2,r1");
			fout.println("add r2,r2,r5");
			fout.println("lea r0,nmes");
			fout.println("puts");
			fout.println("add r0,r2,x0");
			fout.println("out");
			fout.println("brnzp done");
			fout.println("done          halt");
			fout.println("num1  .fill x" + first_number);
			fout.println("num2 .fill x" + second_number);
			fout.println("ascii .fill x0030");
			fout.println("mes .stringz " + "\"" + "The Difference is " + "\"");
			fout.println("nmes .stringz " + "\"" + "The Difference is -" + "\"");
			fout.println(".end");
		} catch (FileNotFoundException ex) {
			System.out.println("File not Found");
			System.exit(0);
		}
	}

}