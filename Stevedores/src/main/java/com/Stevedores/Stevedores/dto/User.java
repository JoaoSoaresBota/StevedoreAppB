package com.Stevedores.Stevedores.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(hidden = true)
    private Long pk;
    private String href;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String address;



    public User()
    {


    }

    public void Register(String href, String username, String password, String firstName, String lastName, String address)
    {
        this.href = href;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

    }


    public void setPk(Long pk) {
        this.pk = pk;
    }

    @Id
    public Long getPk() {
        return pk;
    }
}
