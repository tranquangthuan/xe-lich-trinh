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

import thuan.com.fa.demomvc.entity.LoaiXe;
import thuan.com.fa.demomvc.entity.NhaXe;
import thuan.com.fa.demomvc.entity.Xe;
import thuan.com.fa.demomvc.model.TienMoiXe;
import thuan.com.fa.demomvc.service.LoaiXeServiceImpl;
import thuan.com.fa.demomvc.service.NhaXeServiceImpl;
import thuan.com.fa.demomvc.service.XeServiceImpl;

@Controller
@RequestMapping("/xe")
public class XeController {

	@Autowired
	private XeServiceImpl XeServiceImpl;

	@Autowired
	private LoaiXeServiceImpl loaiXeServices;

	@Autowired
	private NhaXeServiceImpl nhaxeService;

	@GetMapping("/list")
	public String getAll(Model model) {
		List<Xe> xes = XeServiceImpl.findAll();
		model.addAttribute("xes", xes);
		return "/xe/list";
	}

	@GetMapping("/add")
	public String showAddForm(Model model) {
		model.addAttribute("xeForm", new Xe());
		return "/xe/new";
	}

	@PostMapping("/save")
	public String addNewXe(@ModelAttribute(name = "xeForm") @Valid Xe Xe, BindingResult result) {
		if (result.hasErrors()) {
			return "/xe/new";
		}
		XeServiceImpl.saveOrUpdate(Xe);
		return "redirect:/xe/list";
	}
	
	@GetMapping("/tien")
	public String tien(Model model) {
		List<TienMoiXe> tiens = XeServiceImpl.tien();
		model.addAttribute("tiens", tiens);
		return "/xe/tien";
	}

	@ModelAttribute("maLoaiXes")
	public List<LoaiXe> maLoaiXes() {
		return loaiXeServices.findAll();
	}

	@ModelAttribute("maNhaXes")
	public List<NhaXe> maNhaXes() {
		return nhaxeService.findAll();
	}
}
