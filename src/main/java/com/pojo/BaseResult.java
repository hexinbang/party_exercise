package com.pojo;

public class BaseResult {
    Object data;
    int total;
    String code;

    public Object getData() {
        return data;
    }

    public int getTotal() {
        return total;
    }

    public String getCode() {
        return code;
    }

    public Builder builder(){
        return new Builder();
    }

   public class Builder{
        Object data;
        int total;
        String code;
        public Builder data(Object data){
            this.data=data;
            return this;
        }
        public Builder total(int total){
            this.total=total;
            return this;
        }
        public Builder code(String code){
            this.code=code;
            return this;
        }
        public BaseResult build(){
            BaseResult baseResult=new BaseResult();
            baseResult.code=this.code;
            baseResult.data=this.data;
            baseResult.total=this.total;
            return baseResult;
        }
    }
}
