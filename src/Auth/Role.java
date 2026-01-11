package Auth;

import java.util.ArrayList;
import java.util.List;

public class Role {

	private List<Permission> permissions;
	private String name;
	private String description;

	public boolean addPermission(Permission permission) {
		return permissions.add(permission);
	}

	public boolean hasPermission(String resource, String action) {
		boolean found = false;
		for (Permission p : permissions) {
			boolean matches = p.checkMatch(resource, action);
			if (matches) {
				found = true;
			}
		}
		return found;
	}

}