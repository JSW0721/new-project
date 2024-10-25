package com.estsoft.springbootdemo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Entity
@Getter
@Setter
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "`desc`")
    private String desc;
    @Column(name = "created_at", updatable = false, columnDefinition = "datetime(3)")
//    @CreatedDate
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now().truncatedTo(ChronoUnit.MILLIS);
    }
    @Transient//이 필드는 DB칼럼에그는 미존재 상태이지만, 이 entity class는 사용할 예정임.
    private String nickname;
    public String getNickname() {
        return this.name+"_("+this.age+")";
    }
}
