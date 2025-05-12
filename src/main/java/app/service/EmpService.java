package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Dept;
import app.entity.Emp;
import app.repository.DeptRepository;
import app.repository.EmpRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmpService {
	
	private final EmpRepository empRepository;

	@Transactional
	public List<Emp> getEmps() {
		return empRepository.findAll();
	}
	
	@Transactional
	public Emp getEmpByempno(Integer empno) {
		return empRepository.findById(empno)
								.orElseThrow(() -> new EntityNotFoundException("정보가 존재하지 않습니다."));
	}

	
}
