package faculdade.exercicios.Objetos;
import java.util.List;
import java.util.ArrayList;

public class JSON2 {
	private String id;
	private String type;
	private String name;
	private double ppu;
	
	public JSON2(String id, String type) {
		this.id = id;
		this.type =  type;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPpu(double ppu) {
		this.ppu = ppu;
	}
	public double getPpu() {
		return ppu;
	}
	
	public void batters() {
		List<JSON2> batter = new ArrayList<>() {{
			add(new JSON2("1001","Regular"));
			add(new JSON2("1002","Chocolate"));
			add(new JSON2("1003","Blueberry"));
			add(new JSON2("1004","Devil's Food"));
		}};
	}
	List<JSON2> topping = new ArrayList<>() {{
		add(new JSON2("5001","None"));
		add(new JSON2("5002","Glazed"));
		add(new JSON2("5005","Sugar"));
		add(new JSON2("5007","Powdered Sugar"));
		add(new JSON2("5006","Chocolate with Sprinkles"));
		add(new JSON2("5003","Chocolate"));
		add(new JSON2("5004","Maple"));
	}};
}
