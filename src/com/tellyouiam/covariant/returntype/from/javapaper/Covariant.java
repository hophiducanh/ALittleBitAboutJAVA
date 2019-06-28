package com.tellyouiam.covariant.returntype.from.javapaper;

/**
 * In class Zoo, the method getWildAnimal returns ‘WildAnimal’ which is a super type.
 * AfricaZoo extends Zoo and overrides the method getWildAnimal.
 * While overriding, the return type of this method is changed from WildAnimal to Lion.
 * This demonstrates covariant type / Liskov substitution principle.
 * We are replacing the supertype’s (WildAnimal) instance with subtype’s (Lion) instance.
 * This was not possible before JDK 1.5 IndiaZoo is just another example which demonstrates the same covariant type.
 * */

class WildAnimal {
    public String willYouBite(){
        return "Yes";
    }
}

class Lion extends WildAnimal {
    public String whoAreYou() {
        return "Lion";
    }
}

class BengalTiger extends WildAnimal {
    public String whoAreYou() {
        return "Bengal Tiger";
    }
}

class Zoo {
    WildAnimal getWildAnimal() {
        return new WildAnimal();
    }
}

class AfricaZoo extends Zoo {
    @Override
    Lion getWildAnimal() {
        return new Lion();
    }
}

class IndiaZoo extends Zoo {
    @Override
    BengalTiger getWildAnimal() {
        return new BengalTiger();
    }
}

public class Covariant {
    public static void main(String args[]){
        AfricaZoo afZoo = new AfricaZoo();
        System.out.println(afZoo.getWildAnimal().whoAreYou());
        IndiaZoo inZoo = new IndiaZoo();
        System.out.println(inZoo.getWildAnimal().whoAreYou());
    }
}
