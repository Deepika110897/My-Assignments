package week3.day2;



class WebElement {
 void click() {
	System.out.println("element is clicked");
 }
void setText(String text) {
System.out.println("text set to:" +  text);
}

}
class Button extends WebElement {
	void submit() { 
	System.out.println("button is submitted");
}
}
class Textfield extends WebElement {
	void getText() {
		System.out.println("getting textfield");
	}
	
}
class CheckBoxButton extends Button{
	void clickCheckButton() {
		System.out.println("checkboxbutton is clicked");
		
	}
}
class RadioButton extends Button{
	void selectRadioButton() {
		System.out.println("radiobutton is selected");
		
	}
}
