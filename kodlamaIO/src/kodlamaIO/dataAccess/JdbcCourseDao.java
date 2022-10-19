package kodlamaIO.dataAccess;

import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;

public class JdbcCourseDao implements CategoryDao, CourseDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori JDBC İle Veritabanına Eklendi: " + category.getCategoryName());
		
	}

	@Override
	public void add(Course course) {
		System.out.println("Kurs JDBC İle Veritabanına Eklendi: " + course.getCourseName());
		
	}

}
