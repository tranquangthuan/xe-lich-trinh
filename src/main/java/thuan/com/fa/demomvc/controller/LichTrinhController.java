package thuan.com.fa.demomvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thuan.com.fa.demomvc.entity.LichTrinh;
import thuan.com.fa.demomvc.entity.TuyenXe;
import thuan.com.fa.demomvc.entity.Xe;
import thuan.com.fa.demomvc.service.LichTrinhServiceImpl;
import thuan.com.fa.demomvc.service.TuyenXeServiceImpl;
import thuan.com.fa.demomvc.service.XeServiceImpl;

@Controller
@RequestMapping("/lichtrinh")
public class LichTrinhController {

	@Autowired
	private LichTrinhServiceImpl services;

	@Autowired
	private XeServiceImpl xeServiceImpl;

	@Autowired
	private TuyenXeServiceImpl tuyenXeServices;

	@GetMapping("/list")
	public String getAll(Model model) {
		List<LichTrinh> lichTrinhs = services.findAll();
		model.addAttribute("lichTrinhs", lichTrinhs);
		return "/lichtrinh/list";
	}

	@GetMapping("/add")
	public String showAddForm(Model model) {
		model.addAttribute("lichTrinhForm", new LichTrinh());
		return "/lichtrinh/new";
	}

	@PostMapping("/save")
	public String addNewXe(@ModelAttribute(name = "lichTrinhForm") @Valid LichTrinh lichTrinh, BindingResult result) {
		if (result.hasErrors()) {
			return "/lichtrinh/new";
		}
		lichTrinh.setXe(xeServiceImpl.findById(lichTrinh.getId().getMaXe()));
		services.saveOrUpdate(lichTrinh);
		return "redirect:/lichtrinh/list";
	}

	@ModelAttribute("xes")
	public List<Xe> xes() {
		return xeServiceImpl.findAll();
	}

	@ModelAttribute("tuyenXes")
	public List<TuyenXe> tuyenXes() {
		return tuyenXeServices.findAll();
	}

	@GetMapping("/search")
	public String search(@RequestParam(name = "searchKey") String searchKey, Model model) {
		List<LichTrinh> lichTrinhs = services.search(searchKey);
		model.addAttribute("lichTrinhs", lichTrinhs);
		model.addAttribute("searchKey", searchKey);

		return "/lichtrinh/list";
	}
}
