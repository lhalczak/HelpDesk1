package pl.halczak.task;

import lombok.Data;
import pl.halczak.category.Category;
import pl.halczak.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = Task.TABLE_NAME)
@Data
public class Task {

    public static final String TABLE_NAME = "task";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String title;

    @Size(max = 800)
    private String description;

    private String date;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Override
    public String toString(){
        return "Task{" +
                "id" + id +
                ", title='" + title + '\'' +
                ", description=' " + description + '\'' +
                ", user=' " + user +
                ", category=' " + category +
                '}';
    }
}
