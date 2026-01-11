package Documents;

public class RejectedState extends DocumentNegotiationState {

	// Permite resubir el archivo después de rechazo
	@Override
	public void replaceFile(String newFilePath, double newSize) {
		NegotiationDocument document = this.getContext();
		document.reuploadFile(newFilePath, newSize);
	}

}
