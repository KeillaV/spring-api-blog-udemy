package br.com.udemy.springapiblog.model.service.impl;

import br.com.udemy.springapiblog.model.entity.Post;
import br.com.udemy.springapiblog.model.repository.PostRepository;
import br.com.udemy.springapiblog.model.service.PostService;
import br.com.udemy.springapiblog.view.dto.PostDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;
    private ModelMapper modelMapper;

    public PostServiceImpl(PostRepository postRepository, ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public PostDTO createPost(PostDTO postDTO) {
        Post post = modelMapper.map(postDTO, Post.class);
        Post savedPost = postRepository.save(post);

        PostDTO postResponse = modelMapper.map(savedPost, PostDTO.class);
        return postResponse;
    }
}
