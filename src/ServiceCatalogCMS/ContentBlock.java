package ServiceCatalogCMS;

public class ContentBlock {

	private ContentType type;
	private String key;
	private String content;

	public ContentBlock(String key, ContentType type) {
		this.key = key;
		this.type = type;
	}

	public boolean updateContent(String newContent) {
		this.content = newContent;
		return true;
	}

	public String getContent() {
		return this.content;
	}

	public String getKey() {
		return this.key;
	}

}