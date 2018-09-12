
public class Triangulo {

	float forma, base, altura;
	
	public Triangulo(float a, float b)
	{
		altura = a;
		base = b;
	}
	
	float area()
	{
		float area = base*altura/2;
	
		return area;
	}
	
	float perimetro()
	{
		float perimetro = base*3;
	
		return perimetro;
	}
}
