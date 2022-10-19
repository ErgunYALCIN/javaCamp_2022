package kodlamaIO.business;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.CourseDao;
import kodlamaIO.entities.Course;


public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.getCourseName().equals(course.getCourseName())){
			throw new Exception("Kurs Adı Daha Önce Kullanılmış! ");
			
		}
		if(course.getCoursePrice()<10) {
			throw new Exception("Kurs Fiyatı 0'dan Küçük Olamaz");
		}
		
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
			
		}
	}
}
