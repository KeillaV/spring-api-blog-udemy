package br.com.udemy.springapiblog.model.service;

import br.com.udemy.springapiblog.view.dto.PostDTO;

import java.util.List;

public interface PostService {
    public PostDTO createPost(PostDTO postDTO);
    public List<PostDTO> getAllPosts();
    public PostDTO getById(long id);
}
