package com.jextm.dao;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;


import com.jextm.model.Employee;
@Repository("employeeDao")

public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao{
	 public Employee findById(int id) {
	        return getByKey(id);
	    }
	 
	    public void saveEmployee(Employee employee) {
	        persist(employee);
	    }
	 
	    public void deleteEmployeeBySsn(String ssn) {
	        Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
	        query.setString("ssn", ssn);
	        query.executeUpdate();
	    }
	 
	    @SuppressWarnings("unchecked")
	    public List<Employee> findAllEmployees() {
//	    	Query query = getSession().createQuery("select from Employee where 1=:id");
//	    	query.setParameter("id", 1);
//	    	List<Employee> list = query.list();
	    
	        Criteria criteria = createEntityCriteria();
	        return (List<Employee>) criteria.list();
	    	
	    	//return list;
	    }
	 
	    public Employee findEmployeeBySsn(String ssn) {
	        Criteria criteria = createEntityCriteria();
	        criteria.add(Restrictions.eq("ssn", ssn));
	        return (Employee) criteria.uniqueResult();
	    }
}
