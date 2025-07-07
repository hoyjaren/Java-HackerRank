    package abstractionOne;

    public abstract class Animal {

        String name;
        //Abstract
        abstract void makeSound();

        //concrete method
        void showName(){
            System.out.println("Name : " + name);
        }

        void setName(String name) {
            this.name = name;
        }
    }
