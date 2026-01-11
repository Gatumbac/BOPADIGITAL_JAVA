package CRM;

public class RUC {

	private String value;

	public RUC(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public boolean isValid() {
		boolean hasCorrectLength = this.value.length() == 13;
		boolean isNumeric = this.value.matches("[0-9]+");
		boolean isValid = hasCorrectLength && isNumeric;
		return isValid;
	}

}
