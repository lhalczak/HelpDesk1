package pl.halczak.user;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = User.TABLE_NAME)
@Data
public class User {
    final static String TABLE_NAME = "user";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

    public String getFullName() {return firstName + " " + lastName + " " + email;
    }

}
