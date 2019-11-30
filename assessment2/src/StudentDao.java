
public interface StudentDao {
	
	public boolean addStudent(StudentInfoBean studentInfoBean);
	public StudentInfoBean validate(String username,String password);
}
