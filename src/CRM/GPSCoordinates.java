package CRM;

import java.util.Date;

public class GPSCoordinates {

	private double latitude;
	private double longitude;
	private double accuracy;
	private Date timestamp;

	public GPSCoordinates(double latitude, double longitude, double accuracy) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.accuracy = accuracy;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public double calculateDistance(double targetLat, double targetLon) {
		double latDiff = this.latitude - targetLat;
		double lonDiff = this.longitude - targetLon;
		double distance = Math.sqrt(latDiff * latDiff + lonDiff * lonDiff);
		return distance;
	}

	public String getMapsLink() {
		String link = "https://maps.google.com/?q=" + latitude + "," + longitude;
		return link;
	}

}
