package com.udesurd.web.test.app.Services;

import com.udesurd.web.test.app.Models.WallModel;
import com.udesurd.web.test.app.Repositiryes.WallRepos;
import org.springframework.stereotype.Service;

@Service
public class WallService {
    private final WallRepos wallRepos;

    public WallService(WallRepos wallRepos) {
        this.wallRepos = wallRepos;
    }

    public Iterable<WallModel> findAll (){
        return wallRepos.findAll();
    }
}
