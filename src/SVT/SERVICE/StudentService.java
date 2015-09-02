package SVT.SERVICE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import SVT.DAOS.StudentDao;
import SVTModel.StudentBeans;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentdao;

	public boolean checklogin(StudentBeans uname) {
		return studentdao.checkLogin(uname);
	}

}
