public class Student{
      String name; // Имя студента
     int age; // Возраст
     String gender; // пол
      int IQ; // Уровень интеллекта по результатам IQ теста
      Boolean responsibility; // Отзывчивость
      Boolean sociability; // Общительность
      Boolean literacy; // Грамотность
     Boolean StressResistance; // Стрессоустойчивость
      Boolean attentiveness; // Внимательность
      Boolean present; //Присутствие

Student(String name, int age, String gender, int IQ, Boolean responsibility, Boolean literacy, Boolean StressResistance, Boolean attentiveness, Boolean present){
               this.name=name;
               this.age=age;
               this.gender=gender;
               this.IQ=IQ;
               this.responsibility=responsibility;
               this.literacy=literacy;
               this.StressResistance=StressResistance;
               this.attentiveness=attentiveness;
               this.present=present;

}
String ChooseLeader(Student s){
         String nameOfLeader=null;
         if(s.IQ>150&s.responsibility==true&s.literacy==true&s.StressResistance==true&s.attentiveness==true&s.present==true){
             nameOfLeader=s.name;
         }
    return nameOfLeader;
    
}
}