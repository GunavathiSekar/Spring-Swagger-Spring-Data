package com.Kg.SpringData.Repository;

import com.Kg.SpringData.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
 {
	// Object addStudent(Student student3);

	// Object updateStudent(Student student1);
    
	
}