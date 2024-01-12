package Averkov.ZuzexTest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "houses")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "address", length = 64, nullable = false, unique = true)
    private String address;
    @Column(name = "owner_id", nullable = false)
    private Integer ownerId;
    @ManyToOne
    @JoinTable(name = "usersHouses")
    private Set<Long> tenants;
}
