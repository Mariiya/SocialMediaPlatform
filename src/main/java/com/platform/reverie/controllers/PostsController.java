package com.platform.reverie.controllers;

import com.platform.reverie.models.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;

@RestController()
public class PostsController {

    @GetMapping("/{id}/")
    public Collection<Post> getAllPosts() {
        return Collections.EMPTY_LIST;
    }

    @GetMapping(path = "/{id}")
    public Post getUser(@PathVariable BigInteger id) {
        return null; //new Post();
    }

    @PostMapping()
    public Post createUser(@PathVariable Post post) {
        return null; //new Post();
    }

}
