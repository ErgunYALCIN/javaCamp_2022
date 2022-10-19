package youTubeDemo;

import youTubeDemo.business.CreditManager;
import youTubeDemo.business.CustomerManager;
import youTubeDemo.business.ICreditManager;
import youTubeDemo.business.MilitaryCreditManager;
import youTubeDemo.business.TeacherCreditManager;
import youTubeDemo.entities.Company;
import youTubeDemo.entities.Customer;
import youTubeDemo.entities.Person;

public class Main {

	public static void main(String[] args) {
//        int sayi1 = 10;
//        int sayi2 = 20;
//        sayi1 = sayi2;
//
//        sayi2 = 100;
//
//        System.out.println(sayi1);
//
//        int[] sayilar1 = { 1, 2, 3 };
//        int[] sayilar2 = { 10, 20, 30 };
//
//        sayilar1 = sayilar2;
//        sayilar2[0] = 1000;

//        System.out.println(sayilar1[0]);

//        CreditManager creditManager = new CreditManager();
//        creditManager.Calculate();
//        creditManager.Calculate();

        
//        Customer customer = new Customer();
//        customer.setId(1);
//        customer.setCity("İstanbul");
//               
//        CustomerManager customerManager = new CustomerManager(customer, new TeacherCreditManager());
//        customerManager.Save();
//        customerManager.Delete();
// 
//        Company company = new Company();
//        company.setId(100);
//        company.setTaxNumber("10000");
//        company.setCompanyName("Arçelik");
        
        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.GiveCredit();
        
//        
//        Person person = new Person();
//        person.setFirstName("Ergun");
//        person.setLastName("YALÇIN");
//        person.setNationalIdentity("123456");
//        
//        
        

        
	}

}
