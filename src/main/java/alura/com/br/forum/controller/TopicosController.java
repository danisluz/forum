package alura.com.br.forum.controller;

import alura.com.br.forum.controller.dto.TopicoDto;
import alura.com.br.forum.modelo.Curso;
import alura.com.br.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(){
        Topico topico = new Topico("Dúvida gerais", "Duvida com spring", new Curso("Spring", "Programação"));
        return TopicoDto.conveter(Arrays.asList(topico, topico));
    }
}
