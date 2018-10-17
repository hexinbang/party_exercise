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
    final int max=2;
    final int all=3;

    @Override
    public List<Problem> getProb() {
        int num=0;
        List<Problem> problemList=new ArrayList<>();
        int flags[]=new int[max];
        Random random=new Random();
        while (problemList.size()<max)
        {
            int rand= random.nextInt(all+1);
            if(rand==0)continue;
            boolean flag=true;
            for(int i=0;i<flags.length;i++){
                if(rand==flags[i])
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                flags[num]=rand;
                problemList.add(probMapper.getProb(rand));
                num++;
            }
        }
        return problemList;
    }
}