package com.example.longyuan.my_realm_university_mvvm.model;

/**
 * Created by LONGYUAN on 2017/9/13.
 */

public class University implements DisplayItem {

    private String id;

    private String name;

    private String imageUrl;

    //private RealmList<Student> students;

    public University(){

    }

    public University(String id, String name,String imageUrl) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
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

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }


    //public List<Student> getStudents() {
      //  return students;
   // }

    //public void setStudents(RealmList<Student> students) {
      //  this.students = students;
   // }
}

