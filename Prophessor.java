public class Prophessor{
 String name;
 String subj;
 
 Prophessor(String name, String subj){
 this.name=name;
 this.subj=subj;
 }
String WhoIsPresent(Student s){
String answ;
if(s.present==true){
answ="is here";
}
else{
answ="is NOT here";
}
return answ;
}
}