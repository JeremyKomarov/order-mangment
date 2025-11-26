package com.firstProject.controller;

import com.firstProject.model.ShowResponse;
import com.firstProject.tvMaze.TvMazeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

    @Autowired
    TvMazeService tvMazeService;

    @GetMapping("/shows/{id}")
    ShowResponse getTvShowById(@PathVariable Long id) {
        return tvMazeService.getTvShowById(id).toShowResponse();
    }
}
