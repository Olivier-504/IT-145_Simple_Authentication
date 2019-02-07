package com.company;

public class MD5Convert {

        //Private fields
        private String usernameInput;
        private String passwordInput;


        //Public methods
    public MD5Convert()   {
        this.usernameInput = "none";
        this.passwordInput = "none";
    }

    public String getUsername()   {
        return usernameInput;
    }

    public void lockUsername(String usernameInput)   {

        this.usernameInput = usernameInput;
    }


    public String getPassword()   {

        return passwordInput;
    }

    public void lockPassword(String passwordInput)   {

        this.passwordInput = passwordInput;
    }



}





