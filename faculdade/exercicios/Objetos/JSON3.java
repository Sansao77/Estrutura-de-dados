package faculdade.exercicios.Objetos;
import java.util.List;
import java.util.ArrayList;

public class JSON3 {
	private String id = "0001";
	private String type = "donut";
	private String name = "Cake";
	private String url;
	private int width;
	private int height;
	
	public JSON3(String url, int width, int height) {
		this.url = url;
		this.width = width;
		this.height = height;
	}
	List<JSON3> image = new ArrayList<>() {{
		add(new JSON3("images/0001.jpg",200,200));
	}};
	List<JSON3> thumbnail = new ArrayList<>() {{
		add(new JSON3("images/thumbnails/0001.jpg",32,32));
	}};
}
