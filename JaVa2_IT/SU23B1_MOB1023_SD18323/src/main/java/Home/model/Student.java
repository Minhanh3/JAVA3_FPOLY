/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Home.model;

import java.io.Serializable;

/**
 *
 * @author Manhdepzai
 */
public class Student implements Serializable{
    private String studenid;
    private String name;

    public Student() {
    }

    public Student(String studenid, String name) {
        this.studenid = studenid;
        this.name = name;
    }

    public String getStudenid() {
        return studenid;
    }

    public void setStudenid(String studenid) {
        this.studenid = studenid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
