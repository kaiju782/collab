package app.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Emp {
	private Integer empno;
	private String ename;
	private Integer mgr;
	
	private String hiredate;
	private Integer sal;
	private Integer comm;
	private Integer deptno;
	
}
