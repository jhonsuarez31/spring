package com.jhonsuarez.musica.service.JPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonsuarez.musica.Repository.AlbumsRepository;
import com.jhonsuarez.musica.entity.Album;
import com.jhonsuarez.musica.service.IAlbumService;


@Service
public class AlbumsService implements IAlbumService {

	@Autowired
	private AlbumsRepository repoAlbums;
	
	


	public List<Album> buscarTodos() {
		// TODO Auto-generated method stub
		return repoAlbums.findAll();
	}




	@Override
	public void guardar(Album album) {
		repoAlbums.save(album);
		
	}




	@Override
	public void eliminar(int idAlbum) {
		// TODO Auto-generated method stub
		repoAlbums.deleteById(idAlbum);
		
	}

}
