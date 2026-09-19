package com.gustavo.backendmusic.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class SongRequest {

	@NotBlank(message = "title is required")
	private String title;

	@NotBlank(message = "artist is required")
	private String artist;

	@NotBlank(message = "album is required")
	private String album;

	@NotNull(message = "releaseYear is required")
	@PositiveOrZero(message = "releaseYear must be greater than or equal to 0")
	private Integer releaseYear;

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
