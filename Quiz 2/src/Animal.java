abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("myau");
    }
}