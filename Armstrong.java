public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, oNum=0, rem=0, res= 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("�nter the number");
		num=sc.nextInt();
        oNum = num;
		while(oNum!=0)
		{
			rem=oNum%10;
			res=res+rem*rem*rem;
			oNum=oNum/10;
			
		}
        if(res == num)
        {
            System.out.println(num + " is an Armstrong number.");
        }
        else 
        {
            System.out.println(num+ " is not an Armstrong number.");
           
        }
        
	}
}
