package com.dao;

import com.pojo.Problem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProbMapper {
    public List<Problem> getProb(List list);
}
