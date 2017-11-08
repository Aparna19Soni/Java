package javafundamental;

public class ForEach {
	
	public static void main(String[] args)
	{
	float[] val = {100.0f,200.0f,100.0f,200.0f,100.0f};
	float sum =0.0f;
	float[] f1 = new float[4];
	f1[0] =100.0f;
	f1[1] = 200.0f;
	
	for(float variable : val)
	{
		sum = sum + variable;
	}
	
	System.out.println(sum);
	}
}
