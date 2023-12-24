package br.com.udemy.springapiblog.model.service;

import br.com.udemy.springapiblog.model.entity.Post;
import br.com.udemy.springapiblog.view.dto.PostDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PostConverterService {

    private ModelMapper modelMapper;

    public PostConverterService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Post convertToEntity(PostDTO postDTO) {
        Post post = modelMapper.map(postDTO, Post.class);
        return post;
    }

    public PostDTO convertToDTO(Post post) {
        PostDTO postDTO = modelMapper.map(post, PostDTO.class);
        return postDTO;
    }
}
