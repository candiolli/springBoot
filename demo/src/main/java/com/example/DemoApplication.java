package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
@RequestMapping("/demo")
public class DemoApplication {
	
	@RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
	
	@RequestMapping(method=RequestMethod.GET, path="/buscarContatos")
	@ResponseBody
	public List<ContatoDto> buscaContatos() {
		
		List<ContatoDto> list = new ArrayList<>();
		list.add(new ContatoDto("Bruno", "9999-8877", new Date(), new OperadoraDto("Oi", 14, "Celular")));
		list.add(new ContatoDto("Sandra", "9999-3333", new Date(), new OperadoraDto("Vivo", 15, "Celular")));
		list.add(new ContatoDto("Mariana", "9999-9999", new Date(), new OperadoraDto("Tim", 41, "Celular")));
		
		String contatos = "["
				+ "{"
				+ "		'nome' : 'Bruno',"
				+ "		'telefone' : '9999-8877',"
				+ "		'data' : ''2015-12-12T12:53:46.204Z',"
				+ "		'operadora' : {"
				+ "			'nome' : 'Oi',"
				+ "			'codigo' : 14,"
				+ "			'categoria' : 'Celular'"
				+ "		}"
				+ "},"
				+ "{"
				+ "		'nome' : 'Sandra',"
				+ "		'telefone' : '9999-3333',"
				+ "		'data' : ''2015-12-12T12:53:46.204Z',"
				+ "		'operadora' : {"
				+ "			'nome' : 'Vivo',"
				+ "			'codigo' : 15,"
				+ "			'categoria' : 'Celular'"
				+ "		}"
				+ "},"
				+ "{"
				+ "		'nome' : 'Mariana',"
				+ "		'telefone' : '9999-9999',"
				+ "		'data' : ''2015-12-12T12:53:46.204Z',"
				+ "		'operadora' : {"
				+ "			'nome' : 'Tim',"
				+ "			'codigo' : 41,"
				+ "			'categoria' : 'Celular'"
				+ "		}"
				+ "}"
				+ "]";
		
		return list;
	}
	
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
