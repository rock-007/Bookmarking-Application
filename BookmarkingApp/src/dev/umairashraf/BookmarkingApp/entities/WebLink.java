package dev.umairashraf.BookmarkingApp.entities;

public class WebLink extends Bookmark {

	private String url;
	private String host;

	// Kids Friendly field added later
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

}
