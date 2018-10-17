package com.pojo;

import org.apache.ibatis.type.Alias;

@Alias("problem")
public class Problem {
    private int id;
    private  int type;
    private String prob;
    private String option_A;
    private String option_B;
    private String option_C;
    private String option_D;

    public int getType() {
        return type;
    }

    public void setType(int type) {

        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getProb() {
        return prob;
    }

    public String getOption_A() {
        return option_A;
    }

    public String getOption_B() {
        return option_B;
    }

    public String getOption_C() {
        return option_C;
    }

    public String getOption_D() {
        return option_D;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setProb(String prob) {
        this.prob = prob;
    }

    public void setOption_A(String option_A) {
        this.option_A = option_A;
    }

    public void setOption_B(String option_B) {
        this.option_B = option_B;
    }

    public void setOption_C(String option_C) {
        this.option_C = option_C;
    }

    public void setOption_D(String option_D) {
        this.option_D = option_D;
    }

    public Problem(){

    }
}
