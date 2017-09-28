package hello.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "divisions")
public class Division {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	@Column
	@OneToMany(mappedBy = "divisions", targetEntity = DivisionPermission.class)
	private List<DivisionPermission> divisionPermissions;

	public List<DivisionPermission> getDivisionPermissions() {
		return divisionPermissions;
	}

	public void setDivisionPermissions(List<DivisionPermission> divisionPermissions) {
		this.divisionPermissions = divisionPermissions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
