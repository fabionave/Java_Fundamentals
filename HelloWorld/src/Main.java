
public class Main {
	public static void main(String[] args) {
		System.out.print("Ola ");	
		for(int i=0; i< args.length; i++){
			if(args.length-1!=i){
				System.out.print(args[i]+" ");
			}else{
				System.out.println(args[i]);
			}
		}		
	}
}

//another solution
/*
for(int i=0; i< args.length; i++){
	System.out.print(args[i] + ((i == args.length - 1)? "\n" : " "));	
	// condi��o ? se for verdade : se for falso
}
*/
