package app.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Dept;
import app.entity.Emp;
import app.service.DeptService;
import app.service.EmpService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class EmpAPIController {

	private final EmpService empService;
	
	@GetMapping("/api/emp-test")
	public String empTest() {
		return "emp api controller";
	}
	
	/**
	 * 사원 전체 조회
	 * @return
	 */
	@GetMapping("/api/emps")
	public List<Emp> getEmps() {
		List<Emp> emps = empService.getEmps();
		return emps;
	}

	/**
	 * 특정 사원 조회
	 * @return
	 */
	@GetMapping("/api/emps/{empno}")
	public Emp getEmpByEmpno(@PathVariable Integer empno) {
		Emp emp = empService.getEmpByempno(empno);
		return emp;
	}
	
	
}
