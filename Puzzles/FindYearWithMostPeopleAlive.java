import java.io.*;
import java.util.*;

class FindYearWithMostPeopleAlive 
{
  // complexity O(nlog n) * 2 + m
  public static void main(String[] args)
  {
    List<Person> persons = Arrays.asList(new Person(1945, 1999), new Person(1912, 1946), new Person(1922, 1923));
    
    
    List<Person> births = new ArrayList<Person>(persons);
    Collections.sort(births, new BirthComparator());
    
    List<Person> deaths = new ArrayList<Person>(persons);
    Collections.sort(deaths, new DeathComparator());
    
    int currentYear = 0;
    int currentPeopleAlive = 0;
    int bestPeopleAlive = 0;
    int bestYear = 0;
    
    
    Iterator<Person> deathIterator = deaths.iterator();
    Person nextDeadPerson = deathIterator.next();
    for(Person p : births)
    {
      currentYear = p.birth;
      currentPeopleAlive++;
     
      while (currentYear >= nextDeadPerson.death)
      {
        currentPeopleAlive--;
        nextDeadPerson = deathIterator.next();
      }
      
      if (currentPeopleAlive > bestPeopleAlive)
      {
        bestPeopleAlive = currentPeopleAlive;
        bestYear = currentYear;
      }
    }
    
    System.out.println("best year is " + bestYear + " has people alive: " + bestPeopleAlive);
  
  }
  
  private static class BirthComparator implements Comparator<Person>
  {
    public int compare(Person person1, Person person2)
    {
      if (person1.birth > person2.birth)
      {
          return 1;
      }
      else if  (person1.birth < person2.birth)
      {
          return -1;
      }
      
      return 0;
    }
  }
  
  private static class DeathComparator implements Comparator<Person>
  {
    public int compare(Person person1, Person person2)
    {
      if (person1.death > person2.death)
      {
          return 1;
      }
      else if  (person1.death < person2.death)
      {
          return -1;
      }
      
      return 0;
    }
  }
  
  private static class Person
  {
    final int birth;
    final int death;
    
    public Person(int b, int d)
    {
      birth = b;
      death = d;
    }
}
}