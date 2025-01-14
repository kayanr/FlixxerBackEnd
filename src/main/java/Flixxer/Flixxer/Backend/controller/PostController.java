package Flixxer.Flixxer.Backend.controller;

import Flixxer.Flixxer.Backend.models.Post;
import Flixxer.Flixxer.Backend.repositories.PostRepository;
import Flixxer.Flixxer.Backend.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    //@Autowired
    //private PostRepository postRepository;

    @Autowired
    PostService postService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value="/posts/all")
    public @ResponseBody List<Post> getAllPosts() {
        return postService.findAllPosts();
    }

   @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value="/posts/save")
    public @ResponseBody Post savePost(@RequestBody Post post){
        postService.savePost(post);
        return post;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(value="/posts/save/user/{userId}")
    public @ResponseBody Post savePostById(@RequestBody Post post, @RequestParam Long userId){
       // postService.savePostByUserId(post, userId);
        return post;
    }
/*
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value="/posts/user/{userId}")
    public @ResponseBody List<Post> getPostsById(@PathVariable Long userId){
        return postService.getPostsByUser(userId);
    }

   @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value="/posts/update/{id}")
    public String updatePost(@PathVariable Long id,@RequestBody Post post){
        Post updatePost = postRepository.findById(id).get();

        updatePost.setMessage(post.getMessage());
        updatePost.setUser(post.getUser());
        postRepository.save(updatePost);
        return "Post updated!";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(value = "/posts/delete/{id}" )
    public String deletePost(@PathVariable Long id) {
        Post deletedPost = postRepository.findById(id).get();
        postRepository.delete(deletedPost);
        return "Post deleted";
    } */

}
