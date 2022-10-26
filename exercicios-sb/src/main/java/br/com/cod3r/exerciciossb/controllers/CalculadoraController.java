package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path="/calculadora")
public class CalculadoraController {

	
	
	// /calculadora/somar/10/20
	@GetMapping("/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}
	
	// /calculadora/subtrair?a=10&b=20
	@GetMapping("subtrair")
	public int subtrair(@RequestParam (name="a") int a,@RequestParam (name="b") int b) {
		return a - b;
	}
}

