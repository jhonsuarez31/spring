package com.jhonsuarez.musica.service;
import java.util.List;
import com.jhonsuarez.musica.entity.Album;

public interface IAlbumService {
	
	List<Album>	buscarTodos();
	
	
	void guardar (Album album);
	
	void eliminar(int idAlbum);
}
 