package kodlamaIO.dataAccess;

import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;

public class HibernateCourseDao implements CourseDao,CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori Hibernate İle Veritabanına Eklendi: " + category.getCategoryName());
		
	}

	@Override
	public void add(Course course) {
		System.out.println("Kurs Hibernate İle Veritabanına Eklendi: " + course.getCourseName());
		
	}

	
}
