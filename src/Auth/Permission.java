package Auth;

public class Permission {

	private String name;
	private String resourceCode;
	private String action;

	public boolean checkMatch(String resource, String action) {
		boolean matchResource = this.resourceCode.equals(resource);
		boolean matchAction = this.action.equals(action);
		return matchResource && matchAction;
	}

}