package com.cjw.bean.constructor;

import com.google.gson.Gson;

/**
 * @author codeAC
 * @date 2018/5/20 16:44
 */
public class User {
    private String name;
    private int age;
    private Job job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }



    @Override
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return "User:"+json;
    }
}
