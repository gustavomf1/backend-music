package com.gustavo.backendmusic.dto;

public class SongResponse {

	private Long id;
	private String title;
	private String artist;
	private String album;
	private Integer releaseYear;

	public SongResponse() {
	}

	public SongResponse(Long id, String title, String artist, String album, Integer releaseYear) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.releaseYear = releaseYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
}
