package br.com.fiap.Collections;
import java.util.*;
public class Executavel {
	public static void main(String[] args) {
		List<Usuario> list = new ArrayList<Usuario>();
		
		
		Usuario user2 = new Usuario(2,"Bruno ","bruno123");
		list.add(user2);
		Usuario user1 = new Usuario(1,"Lucas Delfino","lucas123");
		list.add(user1);
		Usuario user3 = new Usuario(3,"David","david123");
		list.add(user3);
		Usuario user5 = new Usuario(5,"Luisão ","luisao123");
		list.add(user5);
		Usuario user4 = new Usuario(4,"Julinho ","julinho123");
		list.add(user4);
		
		Map mapa = new HashMap();
		mapa.put("Bruno", user2 );
		mapa.put("Lucas", user1 );
		mapa.put("David", user3 );
		mapa.put("Luisao", user5 );
		mapa.put("Julio", user4 );
		
		Object objeto = mapa.get(“Bruno”);
		Usuario usuario = (Usuario) objeto;

		
		
	
		Collections.sort(list);
		for (Usuario user:list) {
			System.out.println(user.getNome());
		}
	
	}
}
