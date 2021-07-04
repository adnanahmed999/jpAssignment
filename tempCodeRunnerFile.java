import java.util.*;

public class PagingFIFO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> frames = new ArrayList<>();
		System.out.print("Enter no. of frames : ");
		int frameSize = sc.nextInt();
		System.out.print("Enter Frame requirement string : ");
		String frameRequirement = sc.next();
		int index=0,hits=0;
		int size = frameRequirement.length();
		System.out.println("Status ");
		for(int i=0;i<frameRequirement.length();i++) {
			char frame = frameRequirement.charAt(i);
			if(frames.contains(frame)) {
				hits++;
				System.out.println(frame+" => "+frames+" Hit");
			}else {
				if(frames.size()<frameSize) {
					frames.add(frame);
				}
				else {
					frames.set(index,frame);
					index=(index+1)%frameSize;
				}
				System.out.println(frame+" => "+frames+" Fault");
			}
			
		}
		double hitRatio = (double)hits/size;
		System.out.println("No. of Fault : "+(size-hits)+" No. of Hits : "+hits+" Hit ratio : "+hitRatio);

	}

}