package com.Stevedores.Stevedores.dto;

import java.util.Set;

public class User {

    private String href;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String address;

    //private UserStatus userStatus;
    private Set<UserRoles> roles;


    public User()
    {


    }

    public void Register(String href, String username, String password, String firstName, String lastName, String address, Set<UserRoles> roles)
    {
        this.href = href;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.roles = roles;
    }




}
