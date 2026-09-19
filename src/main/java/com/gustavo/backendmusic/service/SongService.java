package com.gustavo.backendmusic.service;

import java.util.List;

import com.gustavo.backendmusic.dto.SongRequest;
import com.gustavo.backendmusic.dto.SongResponse;
import com.gustavo.backendmusic.entity.Song;
import com.gustavo.backendmusic.repository.SongRepository;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class SongService {

	private final SongRepository songRepository;

	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}

	public List<SongResponse> findAll() {
		return songRepository.findAll().stream()
				.map(this::toResponse)
				.toList();
	}

	public SongResponse findById(Long id) {
		return toResponse(findEntityById(id));
	}

	public SongResponse create(SongRequest request) {
		Song song = new Song();
		song.setTitle(request.getTitle());
		song.setArtist(request.getArtist());
		song.setAlbum(request.getAlbum());
		song.setReleaseYear(request.getReleaseYear());
		return toResponse(songRepository.save(song));
	}

	public SongResponse update(Long id, SongRequest request) {
		Song existingSong = findEntityById(id);
		existingSong.setTitle(request.getTitle());
		existingSong.setArtist(request.getArtist());
		existingSong.setAlbum(request.getAlbum());
		existingSong.setReleaseYear(request.getReleaseYear());
		return toResponse(songRepository.save(existingSong));
	}

	public void delete(Long id) {
		Song song = findEntityById(id);
		songRepository.delete(song);
	}

	private Song findEntityById(Long id) {
		return songRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Song not found with id " + id));
	}

	private SongResponse toResponse(Song song) {
		return new SongResponse(song.getId(), song.getTitle(), song.getArtist(), song.getAlbum(), song.getReleaseYear());
	}
}
