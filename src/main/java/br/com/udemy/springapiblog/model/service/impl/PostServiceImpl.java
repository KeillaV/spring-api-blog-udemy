package br.com.udemy.springapiblog.model.service.impl;

import br.com.udemy.springapiblog.model.entity.Post;
import br.com.udemy.springapiblog.model.repository.PostRepository;
import br.com.udemy.springapiblog.model.service.PostConverterService;
import br.com.udemy.springapiblog.model.service.PostService;
import br.com.udemy.springapiblog.view.dto.PostDTO;
import br.com.udemy.springapiblog.view.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;
    private PostConverterService converterService;

    public PostServiceImpl(PostRepository postRepository, PostConverterService converterService) {
        this.postRepository = postRepository;
        this.converterService = converterService;
    }

    @Override
    public PostDTO createPost(PostDTO postDTO) {
        Post post = converterService.convertToEntity(postDTO);
        Post savedPost = postRepository.save(post);

        PostDTO postResponse = converterService.convertToDTO(savedPost);
        return postResponse;
    }

    @Override
    public List<PostDTO> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream().map(post -> converterService.convertToDTO(post)).collect(Collectors.toList());
    }

    @Override
    public PostDTO getById(long id) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", String.valueOf(id)));
        return converterService.convertToDTO(post);
    }

}
