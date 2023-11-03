//package com.jetpack.trc.model;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//
//public class User {
//    protected int ID;
//
//    public User(int ID) {
//        this.ID = ID;
//    }
//
//
//    public static List<User> users = new ArrayList();
//
//    public int getID() {
//        return ID;
//    }
//
//    public void setID(int ID) {
//        this.ID = ID;
//    }
//
//    public static List<User> getUsers() {
//        return users;
//    }
//
//    public static void setUsers(List<User> users) {
//        User.users = users;
//    }
//
//    public static void saveTxt(File textFile) throws FileNotFoundException {
//        try (PrintWriter out = new PrintWriter(textFile)){
////            out.print(User.users.get(User.users.size()-1).getClass() + " "
////                    +User.users.get(User.users.size()-1).g + User.users.get(User.users.size()-1).getID());
//        }
//    }
//
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "ID=" + ID +
//                '}';
//    }
//}