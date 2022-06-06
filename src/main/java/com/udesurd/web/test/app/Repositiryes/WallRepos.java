package com.udesurd.web.test.app.Repositiryes;

import com.udesurd.web.test.app.Models.WallModel;
import org.springframework.data.repository.CrudRepository;

public interface WallRepos extends CrudRepository<WallModel, Long> {
}
