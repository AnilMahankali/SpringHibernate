package SVT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import SVT.SERVICE.StudentService;
import SVTModel.StudentBeans;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentservice;

	@RequestMapping(value = "/student.htm", params = "login")
	public ModelAndView login(@ModelAttribute StudentBeans beans,
			BindingResult result) {
		String success = "successfully";
		String fails = "fails insert";

		boolean flag1 = studentservice.checklogin(beans);
		if (flag1) {
			return new ModelAndView("successfully", "result", success);
		} else {
			return new ModelAndView("loginfail", "result", fails);
		}
	}
}
