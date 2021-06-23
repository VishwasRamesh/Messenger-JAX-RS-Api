package com.vishwas.playlist.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vishwas.playlist.model.Playlist;
import com.vishwas.playlist.service.PlaylistService;

import io.swagger.annotations.Api;

@Path("/playlists")
@Api(value="playlist")
@Produces(MediaType.APPLICATION_JSON)
public class PlaylistResource {
	PlaylistService playlistService = new PlaylistService();
	@GET
	public List<Playlist> getPlaylists() {
		return playlistService.getAllSongListInPlaylist();
	}
		
}
