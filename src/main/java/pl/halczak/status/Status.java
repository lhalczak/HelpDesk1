package pl.halczak.status;


import javax.persistence.*;

@Entity
@Table(name = Status.TABLE_NAME)
public class Status {

    public static final String TABLE_NAME = "status";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

}
