package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer>{

	
	
	List<Student>findByEmail(String email);
	
//	@Query(value="select * from Student where email=?1",nativeQuery=true)
//	List<String>fingByEmail(String email);
//	
	
	
	
	@Query(value="select * from Student order by asc",nativeQuery=true)
	List<String>findByPhnoAsc();
	
}
