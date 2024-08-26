import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso de js");
        curso2.setCargaHoraria(5);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setDate(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

         Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.increverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos Maria" + devMaria.getContudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("--");
        System.out.println("Conteúdos concluídos Maria" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());


        System.out.println("---------");

        Dev devJonas = new Dev();
        devJonas.setNome("Jonas");
        devJonas.increverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos Jonas" + devJonas.getContudosInscritos());
        devJonas.progredir();
        System.out.println("--");
        System.out.println("Conteúdos concluídos Jonas" + devJonas.getConteudosConcluidos());
        System.out.println("XP:" + devJonas.calcularTotalXp());

        

        
    }
}
