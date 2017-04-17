
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
//import javafx.scene.control.ChoiceBox;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.ComboBoxBase;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.InputMismatchException;

public class CalculatorController {
	static int choice;
	static int number1;
	static int number2;
	// Label that tells the user that their Assembly File has been created
	@FXML
	Label Assembly_Message;

	// method that prints the message

	public void printAssemblyMessage() {
		Assembly_Message.setText("Assembly File Created!");
	}

	// I could not get the combo boxes or choice box working ask Noah

	// setting the TextFields

	@FXML
	TextField first_num = new TextField(); // this is the first integer that the
											// user enters
	@FXML
	TextField second_num = new TextField(); // this is the second number that
											// the user enter

	public void pop_up() {
		if (choice == 1) {
			ASM_Adding.to_add(get_num1(), get_num2());
			alertBox.display("Pop Up", "Assembly File Ready");
			System.out.println("You Chose Addition");
		} else if (choice == 2) {
			ASM_Subtracting.to_sub(get_num1(), get_num2());
			alertBox.display("Pop Up", "Assembly File Ready");
			System.out.println("You chose Subtraction");
		} else if (choice == 3) {
			ASM_Multiplying.to_prod(get_num1(), get_num2());
			alertBox.display("Pop Up", "Assembly File Ready");
			System.out.println("You Chose Multiplication");
		} else if (choice == 4) {
			ASM_Divide.to_div(get_num1(), get_num2());
			alertBox.display("Pop Up", "Assembly File Ready");
			System.out.println("You chose Division");
		}
	}

	// setting buttons
	@FXML
	Button add = new Button();
	@FXML
	Button sub = new Button();
	@FXML
	Button mult = new Button();
	@FXML
	Button div = new Button();
	@FXML
	Button ASMbtn = new Button();
	@FXML
	Button pr_n1 = new Button();
	@FXML
	Button pr_n2 = new Button();

	// test buttons to see what operation the chose will get rid later

	public void addition() {
		choice = 1;
		// System.out.println("You Chose Addition");
	}

	public void subration() {
		choice = 2;
		// System.out.println("You chose Substraction");
	}

	public void multiplication() {
		choice = 3;
		// System.out.println("You Chose Multiplication");

	}

	public void division() {
		choice = 4;
		// System.out.println("You Chose Division");

	}

	public int  get_num1() {
		try {
			int num1 = Integer.parseInt(first_num.getText());
			number1 = num1;
		} catch (NumberFormatException ea) {
			ErrorMessage.display("WRONG", "INVALID INPUT!!!!");
			System.exit(0);
		}
		return number1;
		
	}
	public int get_num2() {
		try {
			int num2 = Integer.parseInt(second_num.getText());
			number2 = num2;
		} catch (NumberFormatException ea) {
			ErrorMessage.display("WRONG", "INVALID INPUT!!!!");
			System.exit(0);
		}
		return number2;
	}

}
