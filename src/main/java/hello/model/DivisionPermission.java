package hello.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "divisionPermissions")
public class DivisionPermission {
    @EmbeddedId
    private DivisionPermissionId divisionPermissionId;

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
