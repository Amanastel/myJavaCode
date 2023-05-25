
public interface CourseDao extends JpaRepository<Course, Integer>{

	public Course findByCourseName(String cname);
	
	
	
	//@Query("from Course where courseName=?1")
	@Query("select c from Course c where c.courseName=?1")
	public Course getCourseByCname(String cname);
	
	@Query("select c.students from Course c where c.courseName=?1")
	public Set<Student> getStudentsByCname(String cname);
	
	
}




