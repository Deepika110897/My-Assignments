package week3.day2;

public class Elements {

	public static void main(String[] args) {
		Textfield fieldOptions=new Textfield();
		fieldOptions.setText("Hello");
		fieldOptions.click();
		fieldOptions.getText();
		
		 System.out.println("--------------");

	
Button bt=new Button()	;
bt.submit();
bt.click();
System.out.println("--------------");
CheckBoxButton checkBoxOpt=new CheckBoxButton();
checkBoxOpt.clickCheckButton();
checkBoxOpt.submit();
checkBoxOpt.click();
System.out.println("--------------");
RadioButton rbt=new RadioButton();
rbt.selectRadioButton();
rbt.submit();
rbt.click();
}

}
