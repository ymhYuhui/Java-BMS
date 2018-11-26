package com.people;

public abstract class person {
    private String name;
    private String id;
    //构造方法
    public person(){
    }
    public person(String name,String id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object s){
        if (this.getClass()!=s.getClass()){
            return false;
        }
        Student b=(Student) s;
        return (this.getId().equals(b.getId()));
    }
    public abstract void login();
    //public abstract void logout();
}
