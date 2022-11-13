package com.curso.usermanage;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author omarinmo
 */
public class SystemLogic {
//Lista de usuarios

    private ArrayList<Users> usersList = new ArrayList();
//Añadimos usuarios a la lista de usuarios
/**
 * add Users to userList
 * @param u 
 */
    public void addUser(Users u) {
        usersList.add(u);
    }
    /**
     * 
     * @param String str 
     * @return Class Users
     */
    private Users getUser(String str) {
        for (Users e : usersList) {
            if (e.getName().equals(str)) {
                return e;
            }

        }
        return null;

    }
    // public String recibeMessage (Users recibe) {
    //            return recibe.readMessages(recibe.mailBox);

    // }
    /**
     * Recive message with parameters
     * @param user
     * @param m 
     */
    public void reciveMessage(Users user, Message m) {

        user.addMessage(m);

    }
    /**
     * 
     * @param user parameters, last user message
     * @return String with result Class user
     */
    public String readLastMessage(Users user) {
        String result = user.readLastMessage();

        return result;

    }
    /**
     * 
     * @param userSender, Send message
     * @param userReceiver Receive message
     * @param content Content to message (Contenido de mensaje)
     */
    public void sendMessage(Users userSender, String userReceiver, String content) {
        Users receiver = getUser(userReceiver);
        Message m = new Message(userSender.getName(), content);
        receiver.addMessage(m);

    }
    /**
     * Check array and return class users
     * @param receptor parameters
     * @return Class users receptor
     */
    public Users checkArray(String receptor) {
        Users user = new Users();
        for (int i = 0; i < usersList.size(); i++) {

            if (usersList.get(i).getEmail().equals(receptor)) {
                user = usersList.get(i);
            }
            System.out.println("Error, user not found");

        }
        return user;
    }
    /**
     *
     * @return users List
     */
    public ArrayList<Users> getUsersList() {
        return usersList;
    }
    /**
     * Modify userList
     * @param usersList 
     */
    public void setUsersList(ArrayList<Users> usersList) {
        this.usersList = usersList;
    }

    //Devuelve a usuario 
    /**
     * Check to users at list usersList
     * @param email
     * @param password
     * @return class Users
     */
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

    //Comprueba si el usuario es un usuario de la lista usuario
    //Check if the user is a user of the list
    /**
     * Check users in list
     * @param email
     * @param password
     * @return boolean 
     */
    public boolean checkLog(String email, String password) {
        boolean bool = false;
//        user = null;

        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getEmail().equals(email) && usersList.get(i).getPassword().equals(password)) {
//                user = usersList.get(i);
                bool = true;
            }
        }
        return bool;

    }

    //Comprueba la respuesta
    /**
     * Check answer 
     * @param answer
     * @param user
     * @return boolean
     */
    public boolean checkAnswer(String answer, Users user) {
        boolean check = false;
        if (user.getAsnwer().equals(answer)) {
            check = true;

        }

        return check;

    }
}
