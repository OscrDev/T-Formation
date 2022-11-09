/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.usermanage;

import java.util.ArrayList;

/**
 *
 * @author omarinmo
 */
public class SystemLogic {

    private ArrayList<Users> usersList = new ArrayList();

    public void addUser(Users u) {
        usersList.add(u);
    }

    public ArrayList<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<Users> usersList) {
        this.usersList = usersList;
    }

    public Users checkUser(String email, String password) {
        Users user = new Users();
//        user = null;

        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getEmail().equals(email) && usersList.get(i).getPassword().equals(password)) {
                user = usersList.get(i);

            }
        }
        return user;

    }
    public boolean checkLog(String email, String password) {
        boolean bool= false;
//        user = null;

        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getEmail().equals(email) && usersList.get(i).getPassword().equals(password)) {
//                user = usersList.get(i);
            bool = true;
            }
        }
        return bool;

    }

    public boolean checkAnswer(String answer, Users user) {
        boolean check = false;
        if (user.getAsnwer().equals(answer)) {
            check = true;

        }

        return check;

    }
}
