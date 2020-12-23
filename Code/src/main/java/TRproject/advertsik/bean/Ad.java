package TRproject.advertsik.bean;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Please fill the title")
    @Length(max = 256, message = "Description too long")
    private String title;

    @NotBlank(message = "Please fill the description")
    @Length(max = 2048, message = "Description too long")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    private String filename;

    public Ad() {
    }

    public Ad(String title, String description, User author) {
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public String getAuthorName() {
        return author.getUsername();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ad ad = (Ad) o;
        return id.equals(ad.id) &&
                title.equals(ad.title) &&
                description.equals(ad.description) &&
                author.equals(ad.author) &&
                filename.equals(ad.filename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, author, filename);
    }

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author=" + author +
                ", filename='" + filename + '\'' +
                '}';
    }
}
