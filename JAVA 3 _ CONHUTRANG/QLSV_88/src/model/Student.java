/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Manhdepzai
 */
public class Student {
    int id;
    String name;
    String pass;
    int mark;

    public Student() {
    }

    public Student(int id, String name, String pass, int mark) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.mark = mark;
    }

    public Student(String name, String pass, int mark) {
        this.name = name;
        this.pass = pass;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Object[] toDataRow(){
        return new Object[]{
          id,name,pass,mark  
        };
    }
}
