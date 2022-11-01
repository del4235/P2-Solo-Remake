package com.revature.rectarot.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "Users")
public class User {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) //TODO: Look up how this works
    private UUID user_id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "salt", nullable = false)
    private String salt;
    @Column(name = "date_joined", nullable = false)
    private Timestamp date_joined;
    @Column(name = "last_login", nullable = false)
    private Timestamp last_login;

    public User(){}

    public User(UUID user_id, String username, String password, String salt, Timestamp date_joined, Timestamp last_login) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.date_joined = date_joined;
        this.last_login = last_login;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Timestamp getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(Timestamp date_joined) {
        this.date_joined = date_joined;
    }

    public Timestamp getLast_login() {
        return last_login;
    }

    public void setLast_login(Timestamp last_login) {
        this.last_login = last_login;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", date_joined=" + date_joined +
                ", last_login=" + last_login +
                '}';
    }
}
