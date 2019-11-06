public class dogDriver
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang", 5, "Huskey", 80);
        Dog dog2 = new Dog("Nutmeg", 12, "Austrailian Sheepdog", 45);
        Dog dog3 = new Dog("Belle", 2, "Poodle Mix", 6);


        if (dog2.getAge() == dog1.getAge())
        {
            System.out.println("Nutmeg and Fang have the same age.");
        }
        else if (dog2.getAge() > dog1.getAge())
        {
            System.out.println("Nutmeg is older than fang.");
        }
        else
        {
            System.out.println("Fang is older than Nutmeg.");
        }

        if (dog1.getAge() == dog3.getAge())
        {
            System.out.println("Fang and Belle are the same age.");
        }
        else if (dog1.getAge() < dog3.getAge())
        {
            System.out.println("Belle is older than Fang");
        }
        else
        {
            System.out.println("Fang is older than Belle.");
        }
        /*
        System.out.println("First dog:");
        System.out.println("Breed: " + dog1.getBreed());
        System.out.println("Age: " + dog1.getAge());
        System.out.println();

        System.out.println("Second Dog:");
        System.out.println("Weight: " + dog2.getWeight());
        System.out.println();

        System.out.println("Third Dog: ");
        System.out.println("Name: " + dog3.getDog());
        System.out.println("Age: " + dog3.getAge());
        System.out.println("Breed: " + dog3.getBreed());
        System.out.println("Weight: " + dog3.getWeight());
        System.out.println();

        System.out.println("Total Dog count: " + Dog.getDogCount());

         */
    }
}
