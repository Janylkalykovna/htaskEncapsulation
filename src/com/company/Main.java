package com.company;

public class Main {

    public static void main(String[] args) {
  Balyk balyk =new Balyk();
  balyk.setName("Lolly");
  balyk.setType("Bony fish");
  balyk.setWeight(7);
      System.out.println("Балыктын аты:"+balyk.getName()+", туру:"+balyk.getType()+", Салмагы:"+balyk.getWeight());

  Popugay popy=new Popugay();
  popy.setName("Aleks");
  popy.setAge(15);
  popy.setColor("Green");
      System.out.println("Попугайдын аты:"+popy.getName()+", жашы:"+popy.getAge()+", тусу:"+popy.getColor());

 Myshyk myshyk = new Myshyk();
 myshyk.setName("Pushok");
 myshyk.setAge(2);
 myshyk.setKlass("Domestic animal");
      System.out.println("Мышыктын аты:"+myshyk.getName()+" жашы:"+myshyk.getAge()+" классы:"+myshyk.getKlass());


    }
}
