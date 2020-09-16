public class ClassCastExceptionExample {
    public static void main(String[] args){
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat); //여기서 매개값으로 cat 객체를 주어서 12행에서 Dog타입으로 변환 불가능
    }
    public static void changeDog(Animal animal){
        //if(animal instanceof Dog){
            Dog dog = (Dog) animal; //ClassCaseException 발생.
        //}
    }
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
