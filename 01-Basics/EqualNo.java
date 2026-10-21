// chack if two float numbers are approximately equal
/*
public class EqualNo
{
	public static void main(String x[])
	{
	    float n1 =Float.parseFloat(x[0]);
        float n2 =Float.parseFloat(x[1]);
        
		float fnum=1e-4f;
		System.out.println("==>"+Math.abs(n1-n2));
        String str = (Math.abs(n1-n2)<=fnum)? "Number are equal" : "Number are not equal";
  
        System.out.println(str);
	}
}	

*/




public class EqualNo {
    public static void main(String x[]) {
        float n1 = Float.parseFloat(x[0]);
        float n2 = Float.parseFloat(x[1]);

        float epsilon = 1e-4f; // Tolerance value (0.0001f)

        System.out.println("==> " + Math.abs(n1 - n2));

        String str = (Math.abs(n1 - n2) <= epsilon) ?
                     "Numbers are approximately equal" :
                     "Numbers are not equal";

        System.out.println(str);
    }
}
