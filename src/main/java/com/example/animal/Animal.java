package com.example.animal;

public class Animal {
    public void MakeSound()
    {
        System.out.println("the animal makes sound");
    }
    public class cat extends Animal
    {
        @Override
        public void MakeSound() {
            System.out.println("Cat sounds meow");
        }
    }
    public static class dog extends Animal
    {
        @Override
        public void MakeSound() {
            System.out.println("Dog sounds barks");
        }
    }
    public class Main
    {
        public void main(String[] args)
        {
            Animal[] animals = new Animal[2];
            animals[0] = new cat();
            animals[1] = new dog();
            for (Animal animal: animals)
            {
                animal.MakeSound();
            }
        }
    }
}
