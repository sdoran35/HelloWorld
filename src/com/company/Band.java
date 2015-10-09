package com.company;
/**
 * Created by student on 10/5/15.
 */
public class Band {
    private int members;
    private String name;
    private boolean good;
    public Band()
    {
        this(" ",0,false);
    }
    public Band(String n, int m, boolean g){
        name = n;
        members = m;
        good = g;
    }
    public void setName (String n) {
        name = n;
    }
    public void setGood (boolean g) {
        good = g;
    }
    public void setMembers (int m) { members = m;}
    public String getName() {
        return name;
    }
    public int getMembers() {
        return members;
    }
    public boolean getGood() {
        return good;
    }
    public String toString(){
        String description = name + " has " + members + " members,";
       if (good){
           description += " and they are amazing!";
       }
        else {
           description += " and they are not good!";
       }
        return description;
    }
}