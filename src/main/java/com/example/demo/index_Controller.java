package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class index_Controller {

	@GetMapping("/givenamount") // localhost:8080/givenamount
	public ModelAndView dislay() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home.jsp");
		// mav.addObject("giveamt", new Emi_Cal());
		return mav;
	}

	@GetMapping("/calculate_amount")
	public ModelAndView Calculate(Emi_Cal giveamt) {
		// System.out.println(giveamt.getLoan_amount());
		double loan_amount = giveamt.getLoan_amount();
		double month = giveamt.getMonth();
		double Emi = 0;
		double intrest = 0;

		
		ModelAndView mav = new ModelAndView();
		 if (loan_amount >= 10000 && loan_amount >= 50000) {
	            intrest = loan_amount * 2 / 100 * month;
	            Emi = (loan_amount + intrest) / month;
		mav.addObject("chagre", loan_amount);
		mav.addObject("charge1", month);
		mav.addObject("charge2", Emi);
		mav.addObject("charge3", intrest);
		mav.setViewName("output.jsp");
		
		}
		 else {
			 mav.addObject("error", "Your loan amount is not eligible.");
	            mav.setViewName("error.jsp");
		 }
		 return mav;
	}

}
