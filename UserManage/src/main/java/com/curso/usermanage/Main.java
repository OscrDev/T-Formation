package com.curso.usermanage;

import java.util.Scanner;

/**
 *
 * @author omarinmo
 */
public class Main {

    public static void main(String[] args) {

        //Creamos un user general para no sobrescribir
        Users userLoad = new Users();
        //Creamos sistema logico
        SystemLogic system = new SystemLogic();
        //Creamos scanners para no sobreescribir cada uno de ellos
        Scanner sc = new Scanner(System.in);
        Scanner scEmail = new Scanner(System.in);
        Scanner scPassword = new Scanner(System.in);
        Scanner scName = new Scanner(System.in);
        Scanner scQuestion = new Scanner(System.in);
        Scanner scQAnswer = new Scanner(System.in);

        //Mensaje de bienvenida
        System.out.println("Welcome to Messenger");

        //While y switch para el primer sistema de menu
        boolean exit = false;
        while (!exit) {
            System.out.println("Press 1: Login \n" + "Press 2: Register\n" + "Press 3: Exit\n");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    //ENTRAMOS EN EL LOGIN <---------
                    System.out.println("Number one, put your email and password");
                    System.out.println("Write your email");
                    String email = scEmail.nextLine();
                    System.out.println("Write your password");
                    String password = scPassword.nextLine();
                    //TODO EXPRESION REGULARES
//                    Users user = new Users();
//                    

                    if (system.checkLog(email, password)) {
                        userLoad = system.checkUser(email, password);
                        System.out.println("Your email and password has been succesfull");
                        systemLoginInterface(system, userLoad);

                    } else {
                        System.out.println("Error, your email or password has failed");
                        System.out.println("Question " + userLoad.getQuestion());

                        System.out.println("PREGUNTA DE SEGURIDAD");
                        Scanner scAnswer = new Scanner(System.in);
                        String answer = scAnswer.nextLine();

                        if (system.checkAnswer(answer, userLoad)) {
                            systemLoginInterface(system, userLoad);
                        } else {
                            System.out.println("Respuesta erronea");
                        }
                        //if(Si la pregunta es correcta){
                        //systemLoginInterface}
                        /**
                         * else{respuesta erronea
                         */

                    }

                    break;
                case 2:
                    //ENTRAMOS EN REGISTRAR<-----------

                    System.out.println("Checked two, needed your email");
                    //CREAR USER
                    System.out.println("Write name");
                    String name = scName.nextLine();
                    System.out.println("Write email");
                    email = scEmail.nextLine();
                    System.out.println("Write password");
                    password = scPassword.nextLine();

                    Users userNew = new Users(name, email, password);
                    system.addUser(userNew);
                    System.out.println("Create user succesfull!");
                    System.out.println("Your username is: " + userNew.getName());
                    //for(Users user1 : system.getUsersList())    //RECORRE LA LISTA               

                    break;
                case 3:
                    //SALIMOS DEL MENU<----------------------
                    System.out.println("Checked three, thanks for use, bye!");
                    exit = true;
                    break;
            }
        }
    }

    //SI SELECCIONAMOS LA LISTA 1 VENIMOS AL METODO
    //cargamos la interfaz una vez logueado
    //
    public static void systemLoginInterface(SystemLogic system, Users user) {
        Scanner scQuestion = new Scanner(System.in);
        Scanner scAnswer = new Scanner(System.in);
        Scanner scOption = new Scanner(System.in);
        Scanner scEmail = new Scanner(System.in);
        Scanner scPassword = new Scanner(System.in);
        Scanner scMessage = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to your profile");
            System.out.println("Take your option\n "
                    + "-1:Security question\n"
                    + "-2:Modify email\n "
                    + "-3:Modify password\n "
                    + "-4:Logout\n"
                    + "-5:Send a message\n"
                    + "-6:Read message");
            int option = scOption.nextInt();
            switch (option) {
                case 1:
                    //PREGUNTA DE SEGURIDAD<-------------------------

                    System.out.println("Introduce tu pregunta de seguridad");
                    String question = scQuestion.nextLine();
                    System.out.println("Introduce tu respeusta");
                    String answer = scAnswer.nextLine();
                    user.setQuestion(question);
                    user.setAsnwer(answer);

                    System.out.println("Your question is : " + user.getQuestion());
                    System.out.println("Your question is: " + user.getAsnwer());

                    System.out.println("Your security question and answer was save succesfull");

                    break;
                case 2:
                    //MODIFICAR EMAIL<----------------------

                    System.out.println("Modifica tu email");
                    String email = scEmail.nextLine();
                    user.setEmail(email);
                    System.out.println("Tu email ha sido modificado a: " + user.getEmail());
                    break;
                case 3:
                    //MODIFICAMOS PASSWORD<----------------------
                    System.out.println("Modifica tu password");
                    String password = scPassword.nextLine();
                    user.setPassword(password);
                    System.out.println("Tu password ha sido modificado a: " + user.getPassword());
                    break;
                case 4:
                    //VOLVER A LA INTERFAZ 1<-----------------------

                    System.out.println("Has elegido salir");
                    exit = true;

                    break;

                case 5:
                    //MANDAR MENSAJE
                    String message;
                    System.out.println("Hello " + user.getName()
                            + " Write your message");

                    message = scMessage.nextLine();
                    System.out.println("To: ");
                    Scanner scReceptor = new Scanner(System.in);
                    String recp = scReceptor.nextLine();
                    System.out.println("----------");
                    //Recorrer el array de usuarios 
                    //aqui peta
                    Users user2 = new Users();
                    user2 = system.checkArray(recp);
                    Message m = new Message();
                    m.setContent(message);
                    m.setSender(user.getName());
                    system.reciveMessage(user2, m);

                    
                    break;
                case 6:

                    //LEER
                    System.out.println("Last message :" );

                    System.out.println(system.readLastMessage(user));
                    break;

            }
        }
    }

    //Comprobar la pregunta de seguridad<-------------------
    public static boolean logWithQuestion(SystemLogic system, Users user) {
        Scanner scAnswer = new Scanner(System.in);
        System.out.println("Question: " + user.getQuestion());
        System.out.println("Introduce tu answer");
        String answer = scAnswer.nextLine();
        return system.checkAnswer(answer, user);
    }
}
