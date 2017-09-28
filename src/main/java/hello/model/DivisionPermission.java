package hello.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "divisionPermissions")
public class DivisionPermission {
    @EmbeddedId
    private DivisionPermissionId divisionPermissionId;

    private Task task;
    private Division division;

    @ManyToOne
    @JoinColumn(name = "task_id")
    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @ManyToOne
    @JoinColumn(name = "division_id")
    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    private Date expireAt;

    public DivisionPermissionId getDivisionPermissionId() {
        return divisionPermissionId;
    }

    public void setDivisionPermissionId(DivisionPermissionId divisionPermissionId) {
        this.divisionPermissionId = divisionPermissionId;
    }

    public Date getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Date expireAt) {
        this.expireAt = expireAt;
    }
}
