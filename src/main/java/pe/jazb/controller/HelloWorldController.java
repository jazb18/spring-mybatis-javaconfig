package pe.jazb.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pe.jazb.domain.Ciudad;
import pe.jazb.domain.datos;
import pe.jazb.service.HelloWorldService;

@Controller
public class HelloWorldController {
	
	@Autowired
	HelloWorldService service;
	
	private datos ab = new datos();
	private final Logger LOGGER = Logger.getLogger(HelloWorldController.class);
	

	@RequestMapping(value = { "/" })
	public ModelAndView index() throws IOException {
		ModelAndView view = new ModelAndView("index");
		ab.setNombre("Jose antonio");
		return view;
	}

	@RequestMapping(value = { "/hello" })
	public ModelAndView hello() throws IOException {

		ModelAndView view = new ModelAndView("helloworld");
		System.out.println("*********************");
		System.out.println(service.mensaje(ab));
		return view;
	}

	@RequestMapping(value = { "grabarCiudad" }, method = RequestMethod.POST)
	public @ResponseBody void GrabarCiudad(@RequestParam(value = "ciudad") String nombre,
			@RequestParam(value = "poblacion") int poblacion, HttpServletRequest request, HttpSession session) {
		try {
			Ciudad bean = new Ciudad();
			bean.setNombre(nombre);
			bean.setPoblacion(poblacion);
			
			System.out.println("valores en el bean : " + bean.toString());
			
		} catch (Exception e) {
			LOGGER.error(e);
			// TODO: handle exception
		}
	}
}
