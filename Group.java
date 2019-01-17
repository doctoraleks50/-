public class Group{

public static void main(String []args){
    Student Anna = new Student("Anna", 18, "female", 140, true, true, true, true, true);
    Student Nick = new Student("Nick", 20, "male", 180, true, false, true, false, false);
    Student Pol = new Student("Pol", 21, "male", 150, true, true, false, false, true);
    Student Andrew = new  Student("Andrew", 19, "male", 140, false, false, true, false, false);
    Student Helena = new Student("Helena", 21, "female", 170, true, true, true, true, true);
    Student Natali = new Student("Natali", 20, "female", 189, false, true, true, false, false);
    Student Vlad = new Student("Vlad", 18, "male",156, true, true, false, false, true);
    Student Antony = new Student("Antony", 20, "male", 150, true, true, false, false, false);
    Student Ihor = new Student("Ihor", 21, "male", 156, true, true, true, false, true);
    Student Maryna = new Student("Maryna", 20, "female", 167, false, true, true, true, false);
    Student Mac = new Student("Mac", 22, "male", 179, false, true, true, false, true);
    Student Mary = new Student("Mary", 19, "female", 180, true, true, false, true, true);



 Student group_1[]={Anna, Nick, Pol, Andrew, Helena, Natali, Vlad, Antony, Ihor,Maryna, Mac, Mary};
  
Prophessor Jim=new Prophessor("Jim", "Astronomy");

  for (Student student2 : group_1){
        String str=Anna.ChooseLeader(student2);
        if(str != null){
             System.out.println("Старостой был(а) выбран(а) " + str);
        }
        else{
          
}
}
    for (Student student1 : group_1) {
        String isPr = Jim.WhoIsPresent(student1);
        System.out.print(student1.name + " -");
        System.out.println(isPr);
    }
  
}
}


