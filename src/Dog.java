public class Dog implements Comparable<Dog>
{
    private String dog;
    private int age;
    private String breed;
    private double weight;
    private static int dogCount;

    //constructor
    public Dog(String dog, int age, String breed, double weight)
    {
        this.dog = dog;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount++;

    }//close initial constructor

    //getters
    public String getDog()
    {
        return dog;
    }

    public int getAge()
    {
        return age;
    }

    public String getBreed()
    {
        return breed;
    }

    public double getWeight()
    {
        return weight;
    }

    public static int getDogCount()
    {
        return dogCount;
    }

    //setters
    public void setDog(String newDog)
    {
        dog = newDog;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public void setBreed(String newBreed)
    {
        breed = newBreed;
    }

    public void setWeight(double newWeight)
    {
        weight = newWeight;
    }

    public int compareTo(Dog someDog)
    {
        if (this.age < someDog.age)
        {
            return -1;
        }
        else if(this.age == someDog.age)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    //methods
    public String toKilos()
    {
        double kilos = weight / 2.2046;
        return kilos + " in kilograms";
    }

    //tostring method
    public String toString()
    {
        String output = "";
        output += "Name: " + dog;
        output += "\nAge: " + age;
        output += "\nBreed: " + breed;
        output += "\nWeight in pounds: " + weight;
        return output;

    }//close tostring
}//close class
