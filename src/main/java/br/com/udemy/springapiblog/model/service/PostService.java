package br.com.udemy.springapiblog.model.service;

import br.com.udemy.springapiblog.view.dto.PostDTO;

public interface PostService {
    public PostDTO createPost(PostDTO postDTO);
}
