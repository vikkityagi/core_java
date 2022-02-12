package repositoryimpl;

import controller.StudentController;

public interface RepositoryInterface {

    String saveMethod(StudentController studentController);

    String deleteMethod(int stu_id);

    String updateMethod(StudentController studentController);

    StudentController getMethod(StudentController studentController);
}
