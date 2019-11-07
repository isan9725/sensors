package mx.uady.sensors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User{

    @Id
    private Integer id;

    @Column
    private String user;

    @Column
    private String password;

    public User() {
    }

    public User(Integer id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User id(Integer id) {
        this.id = id;
        return this;
    }

    public User user(String user) {
        this.user = user;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }
}