package repository;

import controller.StudentController;
import repositoryimpl.RepositoryInterface;

public class StudentRepository implements RepositoryInterface {

    public String saveMethod(StudentController studentController) {
        return "Data has been successfully inserted";
    }

    public String deleteMethod(int stu_id) {
        return "Data has been successfully Deleted";
    }

    public String updateMethod(StudentController studentController) {
        return "Data has been successfully";
    }

    public StudentController getMethod(StudentController studentController) {
        return null;
    }
}
