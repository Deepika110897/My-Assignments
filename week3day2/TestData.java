package week3.day2;

 class TestData {
void enterCredentials() {
	System.out.println("Credentials is entered");
}

void navigateToHomePage() {
	System.out.println("Homepage is navigated");
}
}
class LoginTestData extends TestData{
	void enterUsername(){
		System.out.println("Username is entered");
	}
	void EnterPassword() {
		System.out.println("Password is entered");
	}
}