#OOP
## Three Baisc Principles
- Encapulation
- Inheritance
- Polymorphism

### Inheritance
The Liskov Substitution Principle
Any subclass object should be subsituable for the superclass object from which
it is derived.

### polymorphism
Runtime
```
public class Instrument {
    public void play() {
        System.out.println("Instument is playing...");
    }
}

public class Wind extends Instrument {
    public void play() {
        System.out.println("Wind is playing...");
    }
}

public class Percussion extends Instrument {
    public void play() {
        System.out.println("Percussion is playing...");
    }
}

public class Music {
    public static void main(String[] args) {
        List<Instrument> instruments = new ArrayList<>();
        instruments.add(new Wind());
        instruments.add(new Percussion());
        for(Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
```
## UML
### Generalization
descripe inheritance relationship
### Relization
descripe implement relationship
### Aggregation
descripe the whole is formed by part
### Composition
### Association
### Dependency
work in runtime


