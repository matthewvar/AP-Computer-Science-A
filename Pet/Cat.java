public class Cat extends Pet{

 private String myName;
 private String word;

 public Cat(String name)
  {
    super(name);
  }

  
  public String speak(){
   word= "meow";
   return word;
  }
}
