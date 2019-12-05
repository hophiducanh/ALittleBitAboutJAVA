package com.tellyouiam.covariant.returntype.from.javapaper;

class IndiaZoo extends Zoo {
    @Override
    BengalTiger getWildAnimal() {
        return new BengalTiger();
    }
}
