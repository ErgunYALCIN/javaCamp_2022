package kodlamaIO.business;

import javax.xml.catalog.CatalogException;

import kodlamaIO.core.logging.Logger;
import kodlamaIO.dataAccess.CategoryDao;
import kodlamaIO.dataAccess.CourseDao;
import kodlamaIO.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		if(category.getCategoryName().equals(category.getCategoryName())) {
			throw new Exception("Kategori Adı Data Önce Kullanılmış");
		}
		
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
			
		}
	}
	

}
