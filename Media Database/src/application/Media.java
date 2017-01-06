package application;

public class Media {


	private String typeOfMedia;
	private String mediaName;
	private String genre;
	private int episodesTotal;
	private int seasonsTotal;
	private boolean isWatched;
	
	
	
	
	public Media(){}
	
	
	
	
	public String getTypeOfMedia() {
		return typeOfMedia;
	}

	public void setTypeOfMedia(String typeOfMedia) {
		this.typeOfMedia = typeOfMedia;
	}

	public String getMediaName() {
		return mediaName;
	}

	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public boolean isWatched() {
		return isWatched;
	}

	public void setWatched(boolean isWatched) {
		this.isWatched = isWatched;
	}

	public int getEpisodesTotal() {
		return episodesTotal;
	}

	public void setEpisodesTotal(int episodesTotal) {
		this.episodesTotal = episodesTotal;
	}

	public int getSeasonsTotal() {
		return seasonsTotal;
	}

	public void setSeasonsTotal(int seasonsTotal) {
		this.seasonsTotal = seasonsTotal;
	}
	

}
