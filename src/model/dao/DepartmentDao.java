package model.dao;

import java.util.List;

import model.entites.Department;

public interface DepartmentDao {

	//insere no banco de dados o objeto
	void insert(Department obj);
	
	void update(Department obj);
	
	void deleteById(Integer id);
	
	Department findById(Integer id);
	List<Department> findAll();
}
