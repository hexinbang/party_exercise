package com.dao;

import com.pojo.Problem;
import org.springframework.stereotype.Repository;

@Repository
public interface ProbMapper {
    public Problem getProb(int id);
}
