package hello.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @OneToMany(mappedBy = "task", targetEntity = DivisionPermission.class)
    private List<DivisionPermission> divisionPermissions;

    public List<DivisionPermission> getDivisionPermissions() {
        return divisionPermissions;
    }

    public void setDivisionPermissions(List<DivisionPermission> divisionPermissions) {
        this.divisionPermissions = divisionPermissions;
    }

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
