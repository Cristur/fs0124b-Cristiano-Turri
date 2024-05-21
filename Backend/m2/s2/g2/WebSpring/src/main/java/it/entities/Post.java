package it.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
@Table(name = "posts")
public class Post extends BaseEntity{
    @Column(length = 25)
    private String category;
    @Column(length = 25)
    private String title;
    private String cover;
    @Column(length = 150)
    private String content;
    private long lectureTime;
}
