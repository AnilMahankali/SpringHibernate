package SVT.DAOS;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;
import SVTModel.StudentBeans;

@Repository("students")
public class StudentDao {
	private SessionFactory sessionf;
	private Session session;

	// login code
	public boolean checkLogin(StudentBeans uname) {
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		session = factory.openSession();
		String query = "select fname,mname from StudentBeans where fname='"
				+ uname.getFname() + "' and mname='" + uname.getMname() + "'";
		Query DBquery = session.createQuery(query);
		List i = DBquery.list();
		Iterator ii = i.iterator();
		if (ii.hasNext()) {
			return true;
		} else {
			return false;
		}
	}
	// view code

}
