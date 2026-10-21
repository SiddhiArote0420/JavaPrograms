//calculate  the BMI (body mass index ) from hight and weight

public class BMI
{
	public static void main(String x[])
	{
		float weight =Float.parseFloat(x[0]);
		float height =Float.parseFloat(x[1]);
		
		float bmi = weight/(height*height);
		
		System.out.printf("body mass index is ="+bmi);
	}
}
		