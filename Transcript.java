import java.util.HashMap;
import java.util.Scanner;


class Transcript{

  public Transcript(){

  }
  public void getClasses(HashMap<String, String> transcript){
    if(transcript.size() < 1 ){
      System.out.println("Error So you have " + transcript);

    }
    else{
      for(String class : transcript.keySet()){
        if(transcript.get(class) != "F"){
          System.out.println("your class is " + class);
        }
      }
    }
  }
  public void getFailingClasses(HashMap<String, String> transcript){
    if(transcript.size() < 1){
      System.out.println("Error uh really you have " + transcript);

    }
    else{
      for(String class : transcript.keySet()){
        if(transcript.get(class) == "F"){
          System.out.println("Your class is " + class);
        }
      }
    }
  }
  public void getAllClasses(HashMap<String, String> transcript){
    if(transcript.size() != 1 ){
      System.out.println("Error so you have " + transcript);

      }
    else{
      for(String class : transcript.keySet()){

        System.out.println("These are the classes you have " + class);
      }
    }
  }
    public void additem(HashMap<String, String> transcript){
      System.out.println("Enter grade for class");
      String class = input.nextString();
      System.out.println("The grade for the class you entered is " + class);

      System.out.println("Is this your grade for this class" + class + "yes or no (no caps)");
      String grade = input.nextString();
      System.out.println("you anwsered" + grade);

      if(grade == "yes"){

        transcript.put(class, grade);
    }
    else{transcript.put(class, grade)};

    }


    public static void main(String[] args) {

    HashMap<String, String> myReportCard = new HashMap<String, String>();
    Transcript myTranscript = new Transcript();
    Scanner choice = new Scanner(System.in);

    HashMap<String, String> myReportCardSoft = new HashMap<String, String>();

    HashMap<String, String> myReportCardJunior = new HashMap<String, String>();

    HashMap<String, String> myReportCardSenior = new HashMap<String, String>();


    myReportCard.put("Health", "C+");
    myReportCard.put("Lit Lab", "B");
    myReportCard.put("Fitness for life", "B+");
    myReportCard.put("Algebra", "B+");
    myReportCard.put("World Cultures", "C+");
    myReportCard.put("Web Design I", "C");
    myReportCard.put("Metals", "C");

    myReportCardSoft.put("Science/Lit Lab", "A");
    myReportCardSoft.put("Gym", "B");
    myReportCardSoft.put("Geometry", "C");
    myReportCardSoft.put("Programming I", "C");
    myReportCardSoft.put("Web design II", "B-");
    myReportCardSoft.put("Animation", "");

    myReportCardJunior.put("Hero's Journey", "B-");
    myReportCardJunior.put("US History", "C+");
    myReportCardJunior.put("Spanish", "F");
    myReportCardJunior.put("Enviromental Science", "C-");
    myReportCardJunior.put("Programming II", "C+");
    myReportCardJunior.put("Math", "B");


    myReportCardSenior.put("Culinary", "A-");
    myReportCardSenior.put("French", "D-");
    myReportCardSenior.put("Naturalist", "B-");
    myReportCardSenior.put("Graphics", "B");

    int option;
    Boolean running = true;
    while(running){
      System.out.println("Personal Report Card");
      System.out.println("1 - Add to Report Card" +
                       "\n2 - Remove from Report Card" +
                       "\n3 - View list of Passed Classes" +
                       "\n4 - View list of Failed Classes" +
                       "\n5 - View list of Report Card" +
                       "\n6 - Total of Classes" +
                       "\n7 - Exit Report Card");

        option = choice.nextInt();
    switch(option){
      case 1: System.out.println("You selected choice 1");
              myReportCard.additem();
              break;
      case 2: System.out.println("You selected choice 2");
              myReportCard.Removeitem();
              break;
      case 3: System.out.println("You selected choice 3");
              myReportCard.getClasses(myReportCard);
              break;
      case 4: System.out.println("You selected choice 4");
              myReportCard.getFailingClasses(myReportCard);
              break;
      case 5: System.out.println("You selected choice 5");
              myReportCard.getAllClasses(myReportCard);
              break;
      case 6: System.out.println("You selected choice 6");
            //  myReportCard
              break;
      case 7: System.out.println("You selected choice 7");
              running = false;
              break;
      default: System.out.println("invalid choice");
              break;
    }

    }
    }




}
