package com.niet.signodes.Controller;

import java.util.List;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.niet.signodes.UserRepo.ContactRepo;
import com.niet.signodes.UserRepo.EmergencyRepository;
import com.niet.signodes.UserRepo.PrescriptionRepo;
import com.niet.signodes.UserRepo.userRepo;
import com.niet.signodes.entity.ContactEntityclass;
import com.niet.signodes.entity.Emergency;
import com.niet.signodes.entity.PrescriptionEntity;
import com.niet.signodes.entity.UserDltscontact;

// import org.springframework.ui.Model;



//@RequestMapping("/prescription")
@Controller
public class userController {
	@Autowired
	private userRepo repo3;
	@Autowired
	private ContactRepo repo4;
	@Autowired
	private PrescriptionRepo repo5;
	@Autowired
	private EmergencyRepository repo6;
	@GetMapping("/register")
	public String index() {
// model.addAttribute("user", new User());
		return "index";
	}
	@PostMapping("/register")
	public String createuser(@ModelAttribute("Contact1") UserDltscontact Contact1) {
		
		repo3.save(Contact1);
		
		
//		String first_name = request.getParameter("name");
//		String last_name = request.getParameter("email");
//		String username = request.getParameter("Contact");
//		String password = request.getParameter("Message");
	
		return "redirect:/";
		
	}
	
	@GetMapping("/")
	public String HEllo() {
		return "index";
	}
	@PostMapping("/hello")
	public String Createfeedback(@ModelAttribute("RegistrationPAge") ContactEntityclass  product) {
		repo4.save(product);
		return "index";
	}
	@GetMapping("/logindoctor")
	public String HEllo1() {
		return "loginDoctor";
	}
	@GetMapping("/loginpatient")
	public String HEllo2() {
		return "loginPatient";
	}
	
	@GetMapping("/prescription1")
	public String Precriptio456() {
		return "Prescription";
	}
	@GetMapping("/patient1")
	public String Precriptio4566() {
		return "patient";
	}
	@PostMapping("/prescription1")
	public String Precription(@ModelAttribute("Prescription") PrescriptionEntity prescribe) {
		repo5.save(prescribe);
		return "Prescription";
	}
	
//	@GetMapping
//    public String getAllPrescriptions(Model model) {
//        List<PrescriptionEntity> prescriptions = repo5.findAll();
//        model.addAttribute("prescriptions", prescriptions);
//        return "prescriptions"; // the name of the view file
//    }
//	@GetMapping("/prescription1")
//	public List<PrescriptionEntity> getPrescriptions() {
//	    return repo5.findAll();
//	}
//	@GetMapping
//    public List<PrescriptionEntity> getAllPrescriptions() {
//        return repo5.findAll();
//    }
//	
	@GetMapping("/prescription3")
	public String Precriptio() {
		return "emergency";
	}
	@PostMapping("/prescription3")
	public String Precription(@ModelAttribute("Prescription") Emergency prescribe1) {
		repo6.save(prescribe1);
		return "emergency";
	}
	@GetMapping("/employees")
    public List<Emergency> getEmployees() {
        return repo6.findAll();
    }
	
	
	
}
