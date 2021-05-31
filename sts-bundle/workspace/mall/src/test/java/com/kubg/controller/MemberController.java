package com.kubg.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.mariadb.jdbc.internal.logging.Logger;
import org.mariadb.jdbc.internal.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mall.domain.MemberVO;
import com.mall.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(MemberController.class);

	@Inject
	private MemberService service;
	
	@Autowired
	BCryptPasswordEncoder passEncoder;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// 회원 가입 get
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public void getSignup() throws Exception {
		logger.info("get signup");
	}

	// 회원 가입 post
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String postSignup(MemberVO vo) throws Exception {
		logger.info("post signup");
		
		String inputPass = vo.getUserPass();
		String pass = passEncoder.encode(inputPass);
		vo.setUserPass(pass);
		
		service.signup(vo);
		
		return "redirect:/";
	}
	
	// 로그인 get
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public void getSignin() throws Exception {
		logger.info("get signin");
	}
	
	// 로그인 post
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String postSignin(
			MemberVO vo, HttpServletRequest req,
			RedirectAttributes rttr) throws Exception {
		
		logger.info("post signin");
		
		MemberVO login = service.signin(vo);
		HttpSession session = req.getSession();
		
		String str ="";
		boolean passMatch = false;
		
		Loop1 :
			for(int i=48; i<=57; i++) {
				char chrI = (char)i;
				for(int j=48; j<=57; j++) {
					char chrJ= (char)j;
					for(int k=48; k<=57; k++) {
						char chrK = (char)k;
						for(int l=48; l<=57; l++) {
							char chrL = (char)l;
							
							str = ""+chrI+chrJ+chrK+chrL;
							System.out.println(str);
							
							passMatch = 
									passEncoder.matches(
											str, login.getUserPass());
							
							if(passMatch) {
								break Loop1;
							}
						}
					}
				}
			} // Loop1
		
		if(login != null && passMatch) {
			session.setAttribute("member", login);
		} 
		
		/*
		else {
			session.setAttribute("member", null);
			
			//리다이렉트시 객체가 소멸하는걸 방지하고(Flash 속성을 이용하여 저장)
			//post방식으로 데이터를 전달하여 데이터 정보가 url에 노출이 되지 않음
			rttr.addFlashAttribute("msg", false);
			return "redirect:/member/signin";
		}
		*/
		
		return "redirect:/";
		
		
	}
	
	// 로그아웃
	@RequestMapping(value = "/signout", method = RequestMethod.GET)	
	public String signout(HttpSession session) throws Exception {
		logger.info("get logout");
		
		service.signout(session);
		
		return "redirect:/";
	}

}
