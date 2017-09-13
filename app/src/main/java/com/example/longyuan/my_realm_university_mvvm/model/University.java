package com.example.longyuan.my_realm_university_mvvm.model;

/**
 * Created by LONGYUAN on 2017/9/13.
 */

public class University implements DisplayItem {

    private String id;

    private String name;

    //private RealmList<Student> students;

    public University(){

    }

    public University(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public List<Student> getStudents() {
      //  return students;
   // }

    //public void setStudents(RealmList<Student> students) {
      //  this.students = students;
   // }
}

