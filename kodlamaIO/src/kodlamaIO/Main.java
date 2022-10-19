package kodlamaIO;

import kodlamaIO.business.CategoryManager;
import kodlamaIO.business.CourseManager;
import kodlamaIO.core.logging.DatabaseLogger;
import kodlamaIO.core.logging.FileLogger;
import kodlamaIO.core.logging.MailLogger;
import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.HibernateCourseDao;
import kodlamaIO.dataAccess.JdbcCourseDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1,"Java 20221",2000);
		Category category1 = new Category(1,"Java Eğitimi");
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
	
	CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
	CategoryManager categoryManager = new CategoryManager(new JdbcCourseDao(), loggers);
	courseManager.add(course1);
	categoryManager.add(category1);
	}
}
