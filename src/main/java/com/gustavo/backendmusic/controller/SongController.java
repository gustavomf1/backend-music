package com.gustavo.backendmusic.controller;

import java.util.List;

import com.gustavo.backendmusic.dto.SongRequest;
import com.gustavo.backendmusic.dto.SongResponse;
import com.gustavo.backendmusic.service.SongService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/songs")
public class SongController {

	private final SongService songService;

	public SongController(SongService songService) {
		this.songService = songService;
	}

	@GetMapping
	public List<SongResponse> findAll() {
		return songService.findAll();
	}

	@GetMapping("/{id}")
	public SongResponse findById(@PathVariable Long id) {
		return songService.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public SongResponse create(@Valid @RequestBody SongRequest song) {
		return songService.create(song);
	}

	@PutMapping("/{id}")
	public SongResponse update(@PathVariable Long id, @Valid @RequestBody SongRequest song) {
		return songService.update(id, song);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		songService.delete(id);
	}
}
