import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: department insert ===");
        Department newDepartment = new Department(null, "Cars");
        //departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("=== Test 2: department update ===");
        newDepartment.setName("Mobile Devices");
        //departmentDao.update(newDepartment);
        System.out.println("Department updated");

        System.out.println("=== Test 3: department delete ===");
        departmentDao.deleteById(5);
        System.out.println("Department deleted");

        System.out.println("=== Test 4: department findById ===");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("=== Test 5: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for(Department dep : list) {
            System.out.println(dep);
        }
    }
}
