package hello.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DivisionPermissionId implements Serializable {
    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "division_id")
    private Long divisionId;

    public DivisionPermissionId() {
    }

    public DivisionPermissionId(Long taskId, Long divisionId) {
        this.taskId = taskId;
        this.divisionId = divisionId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
    }
}
