package teste;

import java.util.ArrayList;

import model.TipoUsuario;
import model.Usuario;
import service.ImagemDenunciaService;
import service.impl.ImagemDenunciaServiceImpl;
import service.impl.UsuarioServiceImpl;

import com.google.gson.Gson;

public class TesteGSON {

	public static void main(String[] args) {
//		System.out.println("testando...");
//		
//		TipoUsuario tipo = new TipoUsuario(1, "Normal", true);
//		Gson gson = new Gson();
//		String json = gson.toJson(tipo);
//		
//		System.out.println("json = " + json);
//		
//		Usuario user = new Usuario(1,"email","senha","nome", true,tipo);
//		Usuario user2 = new Usuario(1,"email","senha","nome", true,tipo);
//		Usuario user3 = new Usuario(1,"email","senha","nome", true,tipo);
//		Usuario user4 = new Usuario(1,"email","senha","nome", true,tipo);
//		
//		UsuarioServiceImpl service = new UsuarioServiceImpl();
//		
//		ArrayList<Usuario> lista = service.consultarTodos(user);
//		lista.add(user);
//		lista.add(user2);
//		lista.add(user3);
//		lista.add(user4);
//		
//		
//		
//		String user_json = gson.toJson(lista);
//		
//		System.out.println("user_json = " + user_json);
		
	 String teste ="111 teste";
	 System.out.println(teste);
	 teste =teste.substring(0, teste.indexOf(" "));
	 System.out.println("'"+teste+"'");
			
		
	}

}