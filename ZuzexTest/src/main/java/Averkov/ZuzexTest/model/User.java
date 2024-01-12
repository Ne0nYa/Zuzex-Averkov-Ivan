package Averkov.ZuzexTest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", length = 64, nullable = false)
    private String name;
    @Column(name = "age", nullable = false)
    private Integer age;
    @Column(name = "password", length = 64, nullable = false)
    private String password;
}
