package lab2;

import java.util.ArrayList;
abstract class Item{
	private int id_number, no_of_copies;
	String title;
	public int getIdNumber(){
		System.out.println("Enter id number");
		this.id_number = new java.util.Scanner(System.in).nextInt();
		return this.id_number;
	}
	public int getNoOfCopies(){
		System.out.println("Define no of copies");
		this.no_of_copies = new java.util.Scanner(System.in).nextInt();
		return this.no_of_copies;
	}
	public String getTitle(){
		System.out.println("Title of the Item");
		this.title = new java.util.Scanner(System.in).nextLine();
		return this.title;
	}

	public void setIdNumber(int id_number){
		this.id_number = id_number;
	}
	public void setNoOfCopies(int no_of_copies){
		this.no_of_copies = no_of_copies;
	}
	public void setTitle(String title){
		this.title = title;
	}
	abstract String checkIn();
	abstract String checkOut();
	abstract void printInfo();
}

abstract class WrittenItem extends Item
{
private String chec_in_date, check_out_date, author_name;
@Override
public String checkIn()
{
	System.out.println("Enter check in date");
this.chec_in_date = new java.util.Scanner(System.in).nextLine();
return this.chec_in_date;
}
@Override
public String checkOut()
{
	Integer helper = Integer.parseInt(this.chec_in_date);
	Integer result = helper + 7;
this.check_out_date = result.toString();
return this.check_out_date;
}
public String getAuthorName(){
	System.out.println("Enter author name");
	this.author_name = new java.util.Scanner(System.in).nextLine();
	return this.author_name;
}
@Override
public void printInfo(){
	//print user info here
	System.out.println("User info is as follows");
	System.out.println("Check Out Date is " + check_out_date);
	System.out.println("Check In Date is " + chec_in_date);
	System.out.println("Author name is " + author_name);
}

}

class Book extends WrittenItem{
int id_number, no_of_copies;
String title, chec_in_date, check_out_date, author_name;
Book(){}
Book(int id_number, int no_of_copies, String title, String chec_in_date, String check_out_date, String author_name)
{
this.id_number = id_number;
this.no_of_copies = no_of_copies;
this.title = title;
this.chec_in_date = chec_in_date;
this.check_out_date = check_out_date;
this.author_name = author_name;
}
public int getterId()
{
	return this.id_number;
}
public int getterOfCopies()
{
	return this.no_of_copies;
}
public String getterTitle(){
	return this.title;
}
public String getterCheckIn(){
	return this.chec_in_date;
}
public String getterCheckOut(){
	return this.check_out_date;
}
public String getterAuthor(){
	return this.author_name;
}


}
class JournalPaper extends WrittenItem{
int year_of_publishion;
int id_number, no_of_copies;
String title, chec_in_date, check_out_date, author_name;
JournalPaper(){}
JournalPaper(int id_number, int no_of_copies, String title, int year_of_publishion, String chec_in_date, String check_out_date, String author_name)
{
this.id_number = id_number;
this.no_of_copies = no_of_copies;
this.title = title;
this.year_of_publishion = year_of_publishion;
this.chec_in_date = chec_in_date;
this.check_out_date = check_out_date;
this.author_name = author_name;
}
public int getterId()
{
	return this.id_number;
}
public int getterOfCopies()
{
	return this.no_of_copies;
}
public String getterTitle(){
	return this.title;
}
public String getterCheckIn(){
	return this.chec_in_date;
}
public String getterCheckOut(){
	return this.check_out_date;
}
public String getterAuthor(){
	return this.author_name;
}
public int getterYearPublishion(){
	return this.year_of_publishion;
}
public int getYear(){
	System.out.println("Enter year of year of publishion");
	year_of_publishion = new java.util.Scanner(System.in).nextInt();
	return year_of_publishion;
}

}
abstract  class MediaItem extends Item{
	private int run_time;
	String chec_in_date, check_out_date;
	public int runTime()
	{
		System.out.println("Fill the run time for the item ");
		this.run_time = new java.util.Scanner(System.in).nextInt();
		return this.run_time;
	}
	@Override

	public String checkIn()
{
	System.out.println("Enter check in date");
this.chec_in_date = new java.util.Scanner(System.in).nextLine();
return this.chec_in_date;
}
@Override
public String checkOut()
{
	//System.out.println("Enter check out date");
this.check_out_date = this.chec_in_date + 7;
return this.check_out_date;
}
@Override
public void printInfo(){

}


}

class Video extends MediaItem{
    private String director, genre, year_released;
    int id_number, no_of_copies, run_time;
String title, chec_in_date, check_out_date;
Video(){}
Video(int id_number, int no_of_copies, String title, String director, String genre, int run_time, String year_released, String chec_in_date, String check_out_date)
{
this.id_number = id_number;
this.no_of_copies = no_of_copies;
this.title = title;
this.director = director;
this.genre = genre;
this.run_time = run_time;
this.year_released = year_released;
this.chec_in_date = chec_in_date;
this.check_out_date = check_out_date;
}
public int getterId()
{
	return this.id_number;
}
public int getterOfCopies()
{
	return this.no_of_copies;
}
public String getterTitle(){
	return this.title;
}
public String getterCheckIn(){
	return this.chec_in_date;
}
public String getterCheckOut(){
	return this.check_out_date;
}
public String getterDirector(){
	return this.director;
}
public String getterGenre(){
	return this.genre;
}
public int getterRuntime(){
	return this.run_time;
}
public String getterYearReleased(){
	return this.year_released;
}


    public String getDirector(){
    	System.out.println("Fill the director name for the item");
    	this.director = new java.util.Scanner(System.in).nextLine();
    	return this.director;
    }
    public String getGenre(){
    	System.out.println("Fill genre item falls into");
    	this.genre = new java.util.Scanner(System.in).nextLine();
    	return this.genre;
    }
    public String getYearReleased(){
    	System.out.println("Year itemm was released");
    	this.year_released = new java.util.Scanner(System.in).nextLine();
    	return this.year_released;
    }

}
class CD extends MediaItem{
	private String cd_genre, artist;
	int id_number, no_of_copies, run_time;
String title, chec_in_date, check_out_date;
CD(){}
CD(int id_number, int no_of_copies, String title,  String cd_genre, String artist, int run_time, String chec_in_date, String check_out_date)
{
this.id_number = id_number;
this.no_of_copies = no_of_copies;
this.title = title;
this.cd_genre = cd_genre;
this.artist = artist;
this.run_time = run_time;
this.chec_in_date = chec_in_date;
this.check_out_date = check_out_date;
}
public int getterId()
{
	return this.id_number;
}
public int getterOfCopies()
{
	return this.no_of_copies;
}
public String getterTitle(){
	return this.title;
}
public String getterCheckIn(){
	return this.chec_in_date;
}
public String getterCheckOut(){
	return this.check_out_date;
}
public String getterArtist(){
	return this.artist;
}
public String getterGenre(){
	return this.cd_genre;
}
public int getterRuntime(){
	return this.run_time;
}

	public String getCdGenre(){
		System.out.println("Fill genre for CD");
		this.cd_genre = new java.util.Scanner(System.in).nextLine();
		return this.cd_genre;
		
	}
	public String getCdArtist(){
		System.out.println("Fill Artist for the selected CD");
		this.artist = new java.util.Scanner(System.in).nextLine();
		return this.artist;
	}
}

class Library{
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		int id,  copies, user_choice, get_year, runtime, count=0, c=0, counter = 0;
		String  get_genre, get_yearreleased, get_director, cdartist;
		String authorname, checkin, checkout, title_of_item;
		System.out.println("************************************************Library Management System**********************************************");
		
		Library lib = new Library();
		while(c != 6){
         System.out.println("\nSelect the number of type of item which you want to get! ");
		System.out.println("1. Book");
		System.out.println("2. JournalPaper");
		System.out.println("3. Video");
		System.out.println("4. CD");
		System.out.println("5. See the data");
		System.out.println("Press 6 for Terminating the Program");
		user_choice = new java.util.Scanner(System.in).nextInt();  
          c = user_choice;
		switch(user_choice)
		{
			case 1: 
			count = 1;
			counter++;
			System.out.println("Enter details for Book");
              Book b = new Book();
		id = b.getIdNumber();
		copies = b.getNoOfCopies();
		title_of_item = b.getTitle();
		checkin = b.checkIn();
		checkout = b.checkOut();
		authorname = b.getAuthorName();
		Book b2 = new Book(id, copies, title_of_item, checkin, checkout, authorname);
		arraylist.add(b2);
		//System.out.println("***********USER DETAILS*************");
		// System.out.println("The id of the item is:- " + id);
		// System.out.println("Number of copies:- " + copies);
		// System.out.println("The title of the item:- " + title_of_item);
		// System.out.println("The checkin date is:-  " + checkin);
		// System.out.println("The check out date is:- " + checkout + "(if not followed 10rs fine per day should be applied)");
		// System.out.println("The Author of the book is:- " + authorname);

             break;
             case 2:
             count = 1;
             counter++;
             System.out.println("Enter details for Journal Paper");
             JournalPaper jp = new JournalPaper();
                id = jp.getIdNumber();
		copies = jp.getNoOfCopies();
		title_of_item = jp.getTitle();
		get_year = jp.getYear();
		checkin = jp.checkIn();
		checkout = jp.checkOut();
		authorname = jp.getAuthorName();
		JournalPaper jp2 = new JournalPaper(id, copies, title_of_item, get_year, checkin, checkout, authorname);
		arraylist.add(jp2);
		// System.out.println("***********USER DETAILS*************");
		// System.out.println("The id of the item is:- " + id);
		// System.out.println("Number of copies:- " + copies);
		// System.out.println("The title of the item:- " + title_of_item);
		// System.out.println("Year paper was published on in is:- " + get_year);
		// System.out.println("The checkin date is:-  " + checkin);
		// System.out.println("The check out date is:- " + checkout + "(if not followed 10rs fine per day should be applied)");
		// System.out.println("The Author of the paper is:- " + authorname);
		break;
		case 3:
		count = 1;
		counter++;
		System.out.println("Enter details for Video");
		Video v = new Video();
        id = v.getIdNumber();
		copies = v.getNoOfCopies();
		title_of_item = v.getTitle();
		get_director = v.getDirector();
		get_genre = v.getGenre();
        runtime = v.runTime();
		get_yearreleased = v.getYearReleased();
		checkin = v.checkIn();
		checkout = v.checkOut();
		Video v2 = new Video(id, copies, title_of_item, get_director, get_genre, runtime, get_yearreleased, checkin, checkout);
		arraylist.add(v2);
		// System.out.println("***********USER DETAILS*************");
		// System.out.println("The id of the item is:- " + id);
		// System.out.println("Number of copies:- " + copies);
		// System.out.println("The title of the item:- " + title_of_item);
		// System.out.println("Year Video was published on in is:- " + get_yearreleased);
		// System.out.println("Director of the video:- " + get_director);
		// System.out.println("Genre of the video is:- " + get_genre);
		// System.out.println("Run time of the video is:- " + runtime);
		// System.out.println("The checkin date is:-  " + checkin);
		// System.out.println("The check out date is:- " + checkout + "(if not followed 10rs fine per day should be applied)");
		break;
		case 4:
		count = 1;
		counter++;
		System.out.println("Enter details for CD");
           CD cd = new CD();
          id = cd.getIdNumber();
		copies = cd.getNoOfCopies();
		title_of_item = cd.getTitle();
		get_genre = cd.getCdGenre();
		cdartist = cd.getCdArtist();
        runtime = cd.runTime();
		checkin = cd.checkIn();
		checkout = cd.checkOut();
		CD cd2 = new CD(id, copies, title_of_item,  get_genre, cdartist, runtime, checkin, checkout);
		arraylist.add(cd2);
		// System.out.println("***********USER DETAILS*************");
		// System.out.println("The id of the item is:- " + id);
		// System.out.println("Number of copies:- " + copies);
		// System.out.println("The title of the item:- " + title_of_item);
		// System.out.println("Artist in the CD is:- " + cdartist);
		// System.out.println("Genre of the video is:- " + get_genre);
		// System.out.println("Run time of the video is:- " + runtime);
		// System.out.println("The checkin date is:-  " + checkin);
		// System.out.println("The check out date is:- " + checkout + "(if not followed 10rs fine per day should be applied)");
            break;
            case 5:
            if(count == 0)
            	System.out.println("******************** You have to add some data first :) ******************** \n");
            else
            { 
            	for(int i = 0;i  < counter; i++)
            	{
            		if((arraylist.get(i)) instanceof Book)
            		{
            			System.out.println("***********USER DETAILS FOR BOOK*************");
            			System.out.println("The id of the item is:- " + ((Book)arraylist.get(i)).getterId());
            			System.out.println("Number of copies:- " + ((Book)arraylist.get(i)).getterOfCopies());
            			System.out.println("The title of the item:- " + ((Book)arraylist.get(i)).getterTitle());
            			System.out.println("The checkin date is:- " + ((Book)arraylist.get(i)).getterCheckIn());
            			System.out.println("The check out date is:- " + ((Book)arraylist.get(i)).getterCheckOut() + "(if not followed 10rs fine per day should be applied)");
		                System.out.println("The Author of the book is:- " + ((Book)arraylist.get(i)).getterAuthor());            		
		            }
		           else if((arraylist.get(i)) instanceof JournalPaper)
            		{
            			System.out.println("***********USER DETAILS FOR JOURNAL PAPER*************");
            			System.out.println("The id of the item is:- " + ((JournalPaper)arraylist.get(i)).getterId());
            			System.out.println("Number of copies:- " + ((JournalPaper)arraylist.get(i)).getterOfCopies());
            			System.out.println("The title of the item:- " + ((JournalPaper)arraylist.get(i)).getterTitle());
            			System.out.println("Year paper was published on in is:- " + ((JournalPaper)arraylist.get(i)).getterYearPublishion());
            			System.out.println("The checkin date is:- " + ((JournalPaper)arraylist.get(i)).getterCheckIn());
            			System.out.println("The check out date is:- " + ((JournalPaper)arraylist.get(i)).getterCheckOut() + "(if not followed 10rs fine per day should be applied)");
		                System.out.println("The Author of the paper is:- " + ((JournalPaper)arraylist.get(i)).getterAuthor());            		
		            }
		            else if((arraylist.get(i)) instanceof Video)
            		{
            			System.out.println("***********USER DETAILS FOR VIDEO*************");
            			System.out.println("The id of the item is:- " + ((Video)arraylist.get(i)).getterId());
            			System.out.println("Number of copies:- " + ((Video)arraylist.get(i)).getterOfCopies());
            			System.out.println("The title of the item:- " + ((Video)arraylist.get(i)).getterTitle());
            			System.out.println("Year video was published on in is:- " + ((Video)arraylist.get(i)).getterYearReleased());
            			System.out.println("Director of the video is :- " + ((Video)arraylist.get(i)).getterDirector());
            			System.out.println("The runtime of the video is:- " + ((Video)arraylist.get(i)).getterRuntime());
            			System.out.println("Genre of the video is:-  " + ((Video)arraylist.get(i)).getterGenre());
            			System.out.println("The checkin date is:- " + ((Video)arraylist.get(i)).getterCheckIn());
            			System.out.println("The check out date is:- " + ((Video)arraylist.get(i)).getterCheckOut() + "(if not followed 10rs fine per day should be applied)");
		                        		
		            }
		            else if((arraylist.get(i)) instanceof CD)
            		{
            			System.out.println("***********USER DETAILS FOR CD*************");
            			System.out.println("The id of the item is:- " + ((CD)arraylist.get(i)).getterId());
            			System.out.println("Number of copies:- " + ((CD)arraylist.get(i)).getterOfCopies());
            			System.out.println("The title of the item:- " + ((CD)arraylist.get(i)).getterTitle());
            			System.out.println("The artist in the CD is:- " + ((CD)arraylist.get(i)).getterArtist());
               			System.out.println("The runtime of the CD is:- " + ((CD)arraylist.get(i)).getterRuntime());
            			System.out.println("Genre of the CD is:-  " + ((CD)arraylist.get(i)).getterGenre());
            			System.out.println("The checkin date is:- " + ((CD)arraylist.get(i)).getterCheckIn());
            			System.out.println("The check out date is:- " + ((CD)arraylist.get(i)).getterCheckOut() + "(if not followed 10rs fine per day should be applied)");
		                        		
		            }

            	}


            }
            break;
		}//switch ends here
		
}//while loop ends here

	}//main ends here
	
}