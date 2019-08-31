package com.codeoftheweb.salvo;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity /* @Entity tells Spring to create a person table for this class*/
public class Player {

    @Id /*@Id says that the id instance variable holds the database key for this class. In addition,it says this field has a unique value for every instance of Player*/
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")              /*@GeneratedValue and @GenericGenerator tell JPA to use whatever ID generator is provided by the database system.*/
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String userName;


    public Player() { }

    public Player(String email) {
        this.userName = email;

    }

    public String getUserName() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

}
