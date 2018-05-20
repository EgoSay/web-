package com.cjw.bean.constructor;

import com.google.gson.Gson;

/**
 * @author codeAC
 * @date 2018/5/20 20:07
 */
public class Job {
    private String name;
    private float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return "Job:"+json;
    }
}
