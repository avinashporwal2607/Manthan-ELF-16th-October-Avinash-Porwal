import java.util.Scanner;

public class BossMusicPlayer {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello User, Welcome in Music World\n");
		
		System.out.println("Press 1 to 'Play a Song'");
		System.out.println("Press 2 to 'Search a Song'");
		System.out.println("Press 3 to 'Show all Songs'");
		System.out.println("Press 4 to 'Operate on Songs Database\n'");

		System.out.println("Please Enter Your Choice- ");
		int choice=sc.nextInt();
		sc.nextLine();
		
	
		UserFunctions uf=new UserFunctions();
		OpeationOnDataBase opdb=new OpeationOnDataBase();

		switch (choice) {
		case 1:
			System.out.println("Press A to 'Play all Songs'");
			System.out.println("Press B to 'Play Songs Randomly'");
			System.out.println("Press C to 'Play a Particular Song'");
			System.out.println("Please Enter Your Choice- ");
			char input=sc.next().charAt(0);
			
			switch (input) {
			case 'A':
				System.out.println("Playing all songs");
				uf.playAllSong();
				break;
			case 'B':
				System.out.println("Playing songs randomly");
				uf.playAllSongRandom();
				break;
			case 'C':
				System.out.println("Please Enter the Song_ID of the Song-");
				int Song_ID=sc.nextInt();
				String Song_Title=uf.playSong(Song_ID);
				System.out.println("Now Playing Song is "+Song_Title);

				break;
			default:
				System.err.println("Oops! Sorry,Wrong Choice");
				break;
			}
			break;
		case 2:
			System.out.println("Search a Song");
			System.out.println("Please Enter Song_Title : ");
			String Song_Title=sc.nextLine();
			uf.searchSong(Song_Title);
			break;
		case 3:
			uf.showAllSongs();
			break;
		case 4: 
			System.out.println("Operations on Songs Database");
			System.out.println("Press A to 'Add Song'");
			System.out.println("Press B to 'Edit an existing Song'");
			System.out.println("Press C to 'Delete an existing Song'");
			System.out.println("Please Enter Your Choice : ");
			char input1=sc.next().charAt(0);

			switch (input1) {
			case 'A':
				opdb.addSong();
				break;
			case 'B':
				opdb.updateSong();
				break;
			case 'C':
				opdb.deleteSong();
				break;

			default:
				System.out.println("Oops! Sorry ,Wrong Choice!!");
				break;
			}

			break;
		default:
			System.out.println("Oops ! Sorry, Wrong Choice!!");
			break;
		}

	}// End of mainMethod
}// End of class BossMusicPlayer

