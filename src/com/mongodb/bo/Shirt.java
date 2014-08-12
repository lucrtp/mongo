package com.mongodb.bo;

public class Shirt {
	private Logo logo = null;
	private Text text = null;

	public Logo getLogo() {
		return logo;
	}

	public void setLogo(Logo logo) {
		this.logo = logo;
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

}
