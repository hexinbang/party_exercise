package com.service;

import com.dao.ProbMapper;
import com.pojo.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class getProbServiceImpl implements ProbService {

    @Autowired
    private ProbMapper probMapper;
    final int max=4;
    final int all=4;

    @Override
    public List<Problem> getProb() {
        List<Integer>list=new ArrayList<>();
        Random random=new Random();
        while (list.size()<max)
        {
            int rand= random.nextInt(all+1);
            if(rand==0)continue;
            boolean flag=true;
            for(int i:list){
                if(rand==i)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                list.add(rand);
            }
        }
        return probMapper.getProb(list);
    }
}
