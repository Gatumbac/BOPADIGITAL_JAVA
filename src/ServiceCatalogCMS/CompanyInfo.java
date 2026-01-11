package ServiceCatalogCMS;

import java.util.ArrayList;
import java.util.List;

public class CompanyInfo {

	private List<ContentBlock> contents;

	public CompanyInfo() {
		this.contents = new ArrayList<>();
	}

	public ContentBlock getMission() {
		ContentBlock mission = this.findByKey("mission");
		return mission;
	}

	public ContentBlock getVision() {
		ContentBlock vision = this.findByKey("vision");
		return vision;
	}

	public ContentBlock getHistory() {
		ContentBlock history = this.findByKey("history");
		return history;
	}

	public ContentBlock getValues() {
		ContentBlock values = this.findByKey("values");
		return values;
	}

	private ContentBlock findByKey(String key) {
		ContentBlock found = null;
		for (ContentBlock block : this.contents) {
			String blockKey = block.getKey();
			boolean matches = blockKey.equals(key);
			if (matches) {
				found = block;
			}
		}
		return found;
	}

	public void updateInfo(String key, String content) {
		ContentBlock block = this.findByKey(key);
		if (block != null) {
			block.updateContent(content);
		}
	}

}