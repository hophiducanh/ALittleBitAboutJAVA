package com.tellyouiam.covariant.returntype.from.javapaper;

class AfricaZoo extends Zoo {
    @Override
    Lion getWildAnimal() {
        return new Lion();
    }
}
