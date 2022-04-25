//package com.example.task.graphql;
//
//
//import java.util.List;
//
//import com.example.task.model.Post;
//import com.example.task.service.PostService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.coxautodev.graphql.tools.GraphQLQueryResolver;
//
//@Component
//public class PostQuery implements GraphQLQueryResolver {
//
//    @Autowired
//    private PostService service;
//
//
//    public List<Post> getPosts() {
//        return service.getAllPosts();
//    }
//
//    public Post getPost(long id) {
//        return service.getPost(id);
//    }
//}