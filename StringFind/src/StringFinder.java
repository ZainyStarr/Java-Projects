import java.util.Scanner;
public class Stringing {

	public static void main (String [] args) {
System.out.println("Enter The String:");
Scanner MyStr=new Scanner(System.in);
 String Str=MyStr.nextLine();

		int StrLen=Str.length();

		int[] Store = new int[StrLen];

		char[] strChr=Str.toCharArray(); 
		System.out.println("Enter The String You Want To Find:");

		String ToFind=MyStr.nextLine();

		int ToFindLen=ToFind.length();


		char[] ToFindArr=ToFind.toCharArray(); 


		int obs=0; 

		int u;

		int q=0; 


		for (int i=0;i<StrLen;i++) {


			char chr = Str.charAt(i);


			if(chr ==ToFindArr[0]) { //checking if the first character of the substring(ToFind) is there


				for (int y=0;y<ToFindLen;y++) { //checking if the other characters match..
					//y=0 so if the substring was 1 character ,it will check it and returns as found,if we did y=1,it will check the second character and the substring we want to find is only 1 character so it will show as not found
					//y<ToFindLen  since ToFindLen!=ToFindArr.length because arrays starts at 0 and whatever
					if(ToFindArr[y]==strChr[i+y]) {

						u=y;

					}
					else { //if any character doesn't match,the loop breaks 
						break;

					}


					if(u==ToFindLen-1) {
						//-1 because y < ToFindLen and not y <= ToFindLen
						q++;
						Store[q]=i;



						//System.out.println("DEBUG : String Found at " + i);

						obs=1; 

						i=i+ToFindLen-1;//making the loop skipping the substring,so it wont check it over again and returns as not found

					}
				}
			}



		}


		int b=1;

		if(obs==1) {

			for(int v=0;v<StrLen;v++) {



				if (v==Store[b]) {

					System.out.print("(");     
					System.out.print(ToFind); //just adding the brackets
					System.out.print(")");		


					v=v+ToFindLen-1;//skipping the ToFind in the given string

					b++;

				} else{

					System.out.print(strChr[v]);

				}
			}
		}else {
			System.out.println("Error : String Not Found.");

		}




		System.out.println("*******************");

	}}



